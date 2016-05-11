package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;
/*
public abstract class ZevBlockLog extends BlockRotatedPillar
{
    @SideOnly(Side.CLIENT)
    protected IIcon[] logArray1_a;
    //field_150167_a
    @SideOnly(Side.CLIENT)
    protected IIcon[] logArray2_b;
    //field_150166_b

    //field_150130_N -- leaves

    //field_150131_O -- trees

    public ZevBlockLog()
    {
        super(Material.wood);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        //this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

    public static int func_150165_c(int num_1)
    {
        return num_1 & 4;
    }

     //Returns the quantity of items to drop on block destruction.

    public int quantityDropped(Random rand)
    {
        return 1;
    }

    public Item getItemDropped(int itemNum1, Random rand, int itemNum2)
    {
        return Item.getItemFromBlock(this);
    }

    public void breakBlock(World world, int num1, int num2, int num3, Block block1, int num4)
    {
        byte b0 = 4;
        int i1 = b0 + 1;

        if (world.checkChunksExist(num1 - i1, num2 - i1, num3 - i1, num1 + i1, num2 + i1, num3 + i1))
        {
            for (int j1 = -b0; j1 <= b0; ++j1)
            {
                for (int k1 = -b0; k1 <= b0; ++k1)
                {
                    for (int l1 = -b0; l1 <= b0; ++l1)
                    {
                        Block block = world.getBlock(num1 + j1, num2 + k1, num3 + l1);
                        if (block.isLeaves(world, num1 + j1, num2 + k1, num3 + l1))
                        {
                            block.beginLeavesDecay(world, num1 + j1, num2 + k1, num3 + l1);
                        }
                    }
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int icon)
    {
        return this.logArray1_a[icon % this.logArray1_a.length];
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int icon2)
    {
        return this.logArray2_b[icon2 % this.logArray2_b.length];
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
}
*/