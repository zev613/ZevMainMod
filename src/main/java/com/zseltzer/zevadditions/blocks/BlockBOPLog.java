package com.zseltzer.zevadditions.blocks;

import java.util.List;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockBOPLog extends Block
{
    /*
    public static enum LogCategory
    {
        CAT1, CAT2, CAT3, CAT4;
    }
    */

    //logs1
    //Sacred Oak		(0)
    //Cherry			(1)
    //Dark				(2)
    //Fir				(3)

    //logs2
    //Loftwood			(0)
    //Magic				(1)
    //Mangrove			(2)
    //Palm				(3)

    //logs3
    //Redwood			(0)
    //Willow			(1)
    //Dead				(2)
    //Giant Flower Stem (3)

    //logs4
    //Pine				(0)
    //Hellbark			(1)
    //Jacaranda			(2)
    //Mahogany			(3)

    private static final String[] types = new String[] {"redwood", "maple", "palm", "willow", "pine", "fir", "chestnut", "sequoia", "elm", "hickory", "cedar", "sycamore", "cypress", "eucalyptus", "mahogany", "magnolia"};
    private IIcon[] textures;
    private IIcon[] logTop;

    public BlockBOPLog()
    {
        super(Material.wood);
        this.setHardness(2.0F);
        this.setHarvestLevel("axe", 0);
        this.setResistance(5.0F);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(ModTabs.tabWorld);
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        textures = new IIcon[types.length];
        logTop = new IIcon[types.length];

        for (int i = 0; i < types.length; ++i)
        {
            {
                textures[i] = iconRegister.registerIcon(Reference.MODID + ":" + types[i] + "_log_side");
                logTop[i] = iconRegister.registerIcon(Reference.MODID + ":" + types[i] + "_log_top");
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {

        if ((side == 1 || side == 0))
            return logTop[(getTypeFromMeta(meta))];
        else
            return textures[(getTypeFromMeta(meta))];
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int side)
    {
        return this.textures[side % this.textures.length];
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int top)
    {
        return this.logTop[top % this.logTop.length];
    }

    @Override
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list)
    {
        for (int i = 0; i < types.length; ++i)
        {
            list.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block par5, int par6)
    {
        byte radius = 4;
        int bounds = radius + 1;

        if (world.checkChunksExist(x - bounds, y - bounds, z - bounds, x + bounds, y + bounds, z + bounds))
        {
            for (int i = -radius; i <= radius; ++i)
            {
                for (int j = -radius; j <= radius; ++j)
                {
                    for (int k = -radius; k <= radius; ++k)
                    {
                        Block block = world.getBlock(x + i, y + j, z + k);

                        if (block.isLeaves(world, x, y, z))
                        {
                            block.beginLeavesDecay(world, x + i, y + j, z + k);
                        }
                    }
                }
            }
        }
    }

    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta)
    {
        int type = meta & 3;
        byte orientation = 0;

        switch (side)
        {
            case 0:
            case 1:
                orientation = 0;
                break;
            case 2:
            case 3:
                orientation = 8;
                break;
            case 4:
            case 5:
                orientation = 4;
        }
        return type | orientation;
    }

/*
    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta)
    {
        int type = getTypeFromMeta(meta);
        byte orientation = 0;

        switch (side)
        {
            case 0:
            case 1:
                orientation = 0;
                break;

            case 2:
            case 3:
                orientation = 8;
                break;

            case 4:
            case 5:
                orientation = 4;
        }

        return type | orientation;
    }
*/

    @Override
    public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        if (world.getBlockMetadata(x, y, z) == 1)
        {
            return 0;
        }
        else
        {
            return Blocks.fire.getFlammability(this);
        }
    }

    @Override
    public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        if (world.getBlockMetadata(x, y, z) == 1)
        {
            return 0;
        }
        else
        {
            return Blocks.fire.getEncouragement(this);
        }
    }

    @Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face)
    {
        if (world.getBlockMetadata(x, y, z) == 1)
        {
            return false;
        }
        else
        {
            return getFlammability(world, x, y, z, face) > 0;
        }
    }

    @Override
    public int damageDropped(int meta)
    {
        return getTypeFromMeta(meta);
    }

    @Override
    protected ItemStack createStackedBlock(int meta)
    {
        return new ItemStack(this, 1, getTypeFromMeta(meta));
    }

    @Override
    public int getRenderType()
    {
        return 31;
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    public String getWoodType(int meta)
    {
        return types[getTypeFromMeta(meta)];
    }

    private static int getTypeFromMeta(int meta)
    {
        return meta;
    }
}