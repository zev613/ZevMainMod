package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;
/*
public class ZevSapling extends BlockBush implements IGrowable
{
    public static final String[] saplingTypeNames_a = new String[]{"maple", "redwood", "pine", "willow", "palm"};
    private static final IIcon[] saplingTypeNames_b = new IIcon[saplingTypeNames_a.length];

    public ZevSapling()
    {
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

    //Ticks the block if it's been scheduled

    public void updateTick(World world, int updateNum_1, int updateNum_2, int updateNum_3, Random rand)
    {
        if (!world.isRemote)
        {
            super.updateTick(world, updateNum_1, updateNum_2, updateNum_3, rand);

            if (world.getBlockLightValue(updateNum_1, updateNum_2 + 1, updateNum_3) >= 9 && rand.nextInt(7) == 0)
            {
                this.updateTick(world, updateNum_1, updateNum_2, updateNum_3, rand);
            }
        }
    }

     //Gets the block's texture. Args: side, meta


    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        meta &= 9;
        return saplingTypeNames_b[MathHelper.clamp_int(meta, 0, 6)];
    }

    public void func_149879_c(World world, int num_1, int num_2, int num_3, Random rand)
    {
        int l = world.getBlockMetadata(num_1, num_2, num_3);

        if ((l & 8) == 0)
        {
            world.setBlockMetadataWithNotify(num_1, num_2, num_3, l | 8, 4);
        } else
        {
            this.func_149878_d(world, num_1, num_2, num_3, rand);
        }
    }

    public void func_149878_d(World world, int num1, int num2, int num3, Random rand)
    {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(world, rand, num1, num2, num3)) return;
        int l = world.getBlockMetadata(num1, num2, num3) & 7;
        net.minecraft.world.gen.feature.WorldGenAbstractTree object = rand.nextInt(10) == 0 ? new ZevWorldGenBigTree(true) : new ZevWorldGenTrees(true);
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;

        switch (l)
        {
            case 0:
            default:
                break;
            case 1:
                label78:

                for (i1 = 0; i1 >= -1; --i1)
                {
                    for (j1 = 0; j1 >= -1; --j1)
                    {
                        if (this.func_149880_a(world, num1 + i1, num2, num3 + j1, 1) && this.func_149880_a(world, num1 + i1 + 1, num2, num3 + j1, 1) && this.func_149880_a(world, num1 + i1, num2, num3 + j1 + 1, 1) && this.func_149880_a(world, num1 + i1 + 1, num2, num3 + j1 + 1, 1))
                        {
                            object = new ZevWorldGenMegaPineTree(false, rand.nextBoolean());
                            flag = true;
                            break label78;
                        }
                    }
                }

//
                if (!flag)
                {
                    j1 = 0;
                    i1 = 0;
                    object = new WorldGenTaiga2(true);
                }

                break;
//

//
            case 2:
                object = new WorldGenForest(true, false);
                break;
//

//
            case 3:
                label93:

                for (i1 = 0; i1 >= -1; --i1)
                {
                    for (j1 = 0; j1 >= -1; --j1)
                    {
                        if (this.func_149880_a(world, num1 + i1, num2, num3 + j1, 3) && this.func_149880_a(world, num1 + i1 + 1, num2, num3 + j1, 3) && this.func_149880_a(world, num1 + i1, num2, num3 + j1 + 1, 3) && this.func_149880_a(world, num1 + i1 + 1, num2, num3 + j1 + 1, 3))
                        {
                            object = new WorldGenMegaJungle(true, 10, 20, 3, 3);
                            flag = true;
                            break label93;
                        }
                    }
                }
//

                if (!flag)
                {
                    j1 = 0;
                    i1 = 0;
                    object = new ZevWorldGenTrees(true, 4 + rand.nextInt(7), 3, 3, false);
                }

                break;

//
            case 4:
                object = new WorldGenSavannaTree(true);
                break;
//

//
            case 5:
                label108:

                for (i1 = 0; i1 >= -1; --i1)
                {
                    for (j1 = 0; j1 >= -1; --j1)
                    {
                        if (this.func_149880_a(world, num1 + i1, num2, num3 + j1, 5) && this.func_149880_a(world, num1 + i1 + 1, num2, num3 + j1, 5) && this.func_149880_a(world, num1 + i1, num2, num3 + j1 + 1, 5) && this.func_149880_a(world, num1 + i1 + 1, num2, num3 + j1 + 1, 5))
                        {
                            object = new WorldGenCanopyTree(true);
                            flag = true;
                            break label108;
                        }
                    }
                }

                if (!flag)
                {
                    return;
                }
//
        }

        Block block = Blocks.air;

        if (flag)
        {
            world.setBlock(num1 + i1, num2, num3 + j1, block, 0, 4);
            world.setBlock(num1 + i1 + 1, num2, num3 + j1, block, 0, 4);
            world.setBlock(num1 + i1, num2, num3 + j1 + 1, block, 0, 4);
            world.setBlock(num1 + i1 + 1, num2, num3 + j1 + 1, block, 0, 4);
        }
        else
        {
            world.setBlock(num1, num2, num3, block, 0, 4);
        }

        if (!(object).generate(world, rand, num1 + i1, num2, num3 + j1))
        {
            if (flag)
            {
                world.setBlock(num1 + i1, num2, num3 + j1, this, l, 4);
                world.setBlock(num1 + i1 + 1, num2, num3 + j1, this, l, 4);
                world.setBlock(num1 + i1, num2, num3 + j1 + 1, this, l, 4);
                world.setBlock(num1 + i1 + 1, num2, num3 + j1 + 1, this, l, 4);
            }
            else
            {
                world.setBlock(num1, num2, num3, this, l, 4);
            }
        }
    }

    public boolean func_149880_a(World world, int num_1, int num_2, int num_3, int num_4)
    {
        return world.getBlock(num_1, num_2, num_3) == this && (world.getBlockMetadata(num_1, num_2, num_3) & 7) == num_4;
    }

     //Determines the damage on the item the block drops. Used in cloth and wood.

    @Override
    public int damageDropped (int metadata)
    {
        return metadata;
    }

     //returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
        list.add(new ItemStack(item, 1, 4));
    }

    public String getUnlocalizedName(ItemStack itemstack, String typeName)
    {
        return saplingTypeNames_a[itemstack.getItemDamage()] + "_sapling";
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        for (int i = 0; i < saplingTypeNames_b.length; ++i)
        {
            saplingTypeNames_b[i] = icon.registerIcon(Reference.MODID + ":" + saplingTypeNames_a[i] + "_sapling");
        }
    }

    public boolean func_149851_a(World world, int num_1, int num_2, int num_3, boolean bool_1)
    {
        return true;
    }

    public boolean func_149852_a(World world, Random rand, int num1, int num2, int num3)
    {
        return (double) world.rand.nextFloat() < 0.45D;
    }

    public void func_149853_b(World world, Random rand, int num1_2, int num2_2, int num3_2)
    {
        this.func_149879_c(world, num1_2, num2_2, num3_2, rand);
    }
}
*/