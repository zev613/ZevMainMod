package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
/*
public class ZevLeavesNew extends ZevLeaves
{
    public static final String[][] leafNames = new String[][]{{"maple_leaves", "redwood_leaves", "pine_leaves", "willow_leaves", "palm_leaves"}, {"maple_leaves_opaque", "redwood_leaves_opaque", "pine_leaves_opaque", "willow_leaves_opaque", "palm_leaves_opaque"}};

    public static final String[] typeNames = new String[]{"maple", "redwood", "pine", "willow", "palm"};

    //Returns the color this block should be rendered. Used by leaves.

    //
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int color)
    {
        return (color & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((color & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.getRenderColor(color));
    }
    //

     //Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     //when first determining what to render.

    //
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess blockAccess, int num_1, int num_2, int num_3)
    {
        int l = blockAccess.getBlockMetadata(num_1, num_2, num_3);
        return (l & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((l & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.colorMultiplier(blockAccess, num_1, num_2, num_3));
    }
    //

    protected void func_150124_c(World world, int num1, int num2, int num3, int num4, int num5)
    {
        if ((num4 & 3) == 0 && world.rand.nextInt(num5) == 0)
        {
            this.dropBlockAsItem(world, num1, num2, num3, new ItemStack(Items.apple, 1, 0));
        }
    }

    protected int func_150123_b(int num_1)
    {
        int j = super.func_150123_b(num_1);

        if ((num_1 & 4) == 4)
        {
            j = 40;
        }

        return j;
    }

     //Gets the block's texture. Args: side, meta

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return (meta & 4) == 4 ? this.numOfBlockLeaves[this.zevLeavesArray_2][4] : ((meta & 4) == 3 ? this.numOfBlockLeaves[this.zevLeavesArray_2][3] : ((meta & 4) == 2 ? this.numOfBlockLeaves[this.zevLeavesArray_2][2] : (meta & 4) == 1 ? this.numOfBlockLeaves[this.zevLeavesArray_2][1] : this.numOfBlockLeaves[this.zevLeavesArray_2][0]));
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

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        for (int i = 0; i < leafNames.length; ++i)
        {
            this.numOfBlockLeaves[i] = new IIcon[leafNames[i].length];

            for (int j = 0; j < leafNames[i].length; ++j)
            {
                this.numOfBlockLeaves[i][j] = icon.registerIcon(Reference.MODID + ":" + leafNames[i][j]);
            }
        }
    }

    public String[] func_150125_e()
    {
        return typeNames;
    }
}
*/