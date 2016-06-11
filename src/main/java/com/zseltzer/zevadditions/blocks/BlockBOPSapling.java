package com.zseltzer.zevadditions.blocks;

import java.util.List;
import java.util.Random;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.tabs.ModTabs;
import com.zseltzer.zevadditions.world.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockBOPSapling extends BlockSapling
{
    private static final String[] saplings = new String[] {"redwood", "maple", "palm", "willow", "pine", "fir", "chestnut", "sequoia", "elm", "hickory", "cedar", "sycamore", "cypress", "eucalyptus", "mahogany", "magnolia"};
    private IIcon[] textures;
    private static final int TYPES = 16;

    public BlockBOPSapling()
    {
        this.setHardness(0.0F);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(ModTabs.tabWorld);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        textures = new IIcon[saplings.length];

        for (int i = 0; i < saplings.length; ++i)
        {
            textures[i] = iconRegister.registerIcon(Reference.MODID + ":" + saplings[i] + "_sapling");
        }

    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (meta < 0 || meta >= saplings.length)
        {
            meta = 0;
        }

        return textures[meta];
    }

    @Override
    public void getSubBlocks(Item tree, CreativeTabs creativeTabs, List list)
    {
        for (int i = 0; i < saplings.length; ++i)
        {
            list.add(new ItemStack(tree, 1, i));
        }
    }

    public boolean isValidPosition(World world, int x, int y, int z, int metadata)
    {
        Block block = world.getBlock(x, y - 1, z);

        switch (metadata)
        {
            default:
                return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland || block.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this);
        }
    }

    @Override
    public boolean canPlaceBlockOnSide(World world, int x, int y, int z, int side)
    {
        return isValidPosition(world, x, y, z, -1);
    }

    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        Block soil = world.getBlock(x, y - 1, z);

        if (world.getBlockMetadata(x, y, z) != 1)
            return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) &&
                    (soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this));
        else
            return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) &&
                    (soil != null && (soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this) || soil == Blocks.grass));
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (!world.isRemote)
        {
            if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0)
            {
                this.func_149878_d(world, x, y, z, random);
            }
        }
    }

    //func_149878_d == growTree method.
    @Override
    public void func_149878_d(World world, int x, int y, int z, Random random)
    {
        int meta = world.getBlockMetadata(x, y, z);
        Object obj = null;
        int rnd = random.nextInt(8);

        if (obj == null)
        {
            switch (meta)
            {
                //"redwood", "maple", "palm", "willow", "pine", "fir", "chestnut", "sequoia", "elm", "hickory", "cedar", "sycamore", "cypress", "eucalyptus", "mahogany", "magnolia"

                case 0: // Redwood Tree
                    obj = new WorldGenRedwoodTree2(ModBlocks.logs, ModBlocks.leaves, 0, 0, false, 20, 15);
                    break;

                case 1: //Maple Tree
                    obj = new WorldGenOriginalTree(ModBlocks.logs, ModBlocks.leaves, 1, 1, false, 5, 3, false);
                    break;

                case 2: //Palm Tree
                    rnd = random.nextInt(4);

                    if (rnd == 0) obj = new WorldGenPalmTree1();
                    else obj = new WorldGenPalmTree1(25, 8, 1.5D);
                    break;

                case 3: //Willow Tree
                    obj = new WorldGenBOPSwampTree(ModBlocks.logs, ModBlocks.leaves, 3, 3, 6, 9, Blocks.vine, 0);
                    break;

                case 4: //Pine Tree
                    obj = new WorldGenPineTree();
                    break;

                case 5: //Fir Tree
                    obj = new WorldGenBOPTaiga2(ModBlocks.logs, ModBlocks.leaves, 5, 5, false, 10, 10, 5);
                    break;

                case 6: //Chestnut Tree
                    obj = new WorldGenBOPBigTree(ModBlocks.logs, ModBlocks.leaves, 6, 6);
                    break;

				case 7: //Sequoia Tree
                    obj = new WorldGenRedwoodTree(ModBlocks.logs, ModBlocks.leaves, 7, 7, false, 18, 13);
				break;

                case 8: //Elm Tree
                    obj = new WorldGenBOPBigTree(ModBlocks.logs, ModBlocks.leaves, 8, 8);
                    break;

                case 9: //Hickory Tree
                    obj = new WorldGenBOPBigTree(ModBlocks.logs, ModBlocks.leaves, 9, 9);
                    break;

                case 10: //Cedar Tree
                    obj = new WorldGenBOPTaiga1(ModBlocks.logs, ModBlocks.leaves, 10, 10, false, 4, 3, 0);
                    break;

                case 11: //Sycamore Tree
                    obj = new WorldGenBOPTaiga3(ModBlocks.logs, ModBlocks.leaves, 11, 11, false, 5, 5, 0);
                    break;

                case 12: //Cypress Tree
                    obj = new WorldGenCypress(ModBlocks.logs, ModBlocks.leaves, 12, 12, false, 5, 3, 0);
                    break;

                case 13: //Eucalyptus Tree
                    obj = new WorldGenBOPBigTree(ModBlocks.logs, ModBlocks.leaves, 13, 13);
                    break;

                case 14: //Mahogany Tree
                    obj = new WorldGenRainforestTree1(ModBlocks.logs, ModBlocks.leaves, 14, 14, false, 8, 8);
                    break;

                case 15: //Magnolia Tree
                obj = new WorldGenBOPBigTree(ModBlocks.logs, ModBlocks.leaves, 15, 15);
                break;
            }
        }

        if (obj != null)
        {
            world.setBlockToAir(x, y, z);

            if (!((WorldGenerator)obj).generate(world, random, x, y, z))
            {
                world.setBlock(x, y, z, this, meta, 2);
            }
        }
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta & TYPES;
    }

    @Override
    public int getDamageValue(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z) & TYPES;
    }
}