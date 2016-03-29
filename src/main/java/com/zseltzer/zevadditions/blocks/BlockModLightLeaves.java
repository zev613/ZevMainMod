package com.zseltzer.zevadditions.blocks;

import java.util.List;
import java.util.Random;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockModLightLeaves extends BlockModLeaves
{
		
    public static final String[] typeNames = new String[] {"light", "cherry", "redwood"};/*, "maple", "willow", "pine", "fir", "palm"*/
	
    public static final String[][] leafNames = new String[typeNames.length][typeNames.length];

	
	public static void init()
	{
		
	    final String prefix = "_leaves";
		
	    final String prefix_O = "_leaves_opaque";
	    	    
	    String[][] leafNames = new String[typeNames.length][typeNames.length];
	    for(int i = 0; i < typeNames.length; i++)
	        {
	    		//leafNames[i][i] = leafNames_1[i];
	          //for(int y = 0; y < typeNames.length; y++)
	          //{
	    	leafNames[0][i] = typeNames[i] + prefix;
	    	leafNames[1][i] = typeNames[i] + prefix_O;

	          //}
	        }
	}
		
	//TODO: block renders see through back/adjcent faces
	//final String[][] leafNames_O_other = new String[][] {{"light_leaves"}, {"cherry_leaves"}, {"redwood_leaves"}, {"maple_leaves"}, {"willow_leaves"}, {"pine_leaves"}, {"fir_leaves"}, {"palm_leaves"}, /*separate*/ {"light_leaves_opaque"}, {"cherry_leaves_opaque"}, {"redwood_leaves_opaque"}, {"maple_leaves_opaque"}, {"willow_leaves_opaque"}, {"palm_leaves_opaque"}, {"pine_leaves_opaque"}, {"fir_leaves_opaque"}};
	
    //public static final String[][] leafNames = new String[][] {{"light_leaves"}, {"light_leaves_opaque"}};
	//public static final String[] typeNames = new String[] {"light"};
  
    
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000280";
    
    public BlockModLightLeaves(String unlocalizedName)
    {
    	this.setBlockName(unlocalizedName + "Leaves");
    	this.setBlockTextureName(unlocalizedName + "_leaves");
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return (p_149741_1_ & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((p_149741_1_ & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.getRenderColor(p_149741_1_));
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        int l = p_149720_1_.getBlockMetadata(p_149720_2_, p_149720_3_, p_149720_4_);
        return (l & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((l & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.colorMultiplier(p_149720_1_, p_149720_2_, p_149720_3_, p_149720_4_));
    }

    protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_)
    {
        if ((p_150124_5_ & 3) == 0 && p_150124_1_.rand.nextInt(p_150124_6_) == 0)
        {
            this.dropBlockAsItem(p_150124_1_, p_150124_2_, p_150124_3_, p_150124_4_, new ItemStack(Items.apple, 1, 0));
        }
    }

    protected int func_150123_b(int p_150123_1_)
    {
        int j = super.func_150123_b(p_150123_1_);

        if ((p_150123_1_ & 3) == 3)
        {
            j = 40;
        }

        return j;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return (p_149691_2_ & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : ((p_149691_2_ & 3) == 3 ? this.field_150129_M[this.field_150127_b][3] : ((p_149691_2_ & 3) == 2 ? this.field_150129_M[this.field_150127_b][2] : this.field_150129_M[this.field_150127_b][0]));
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        for (int i = 0; i < leafNames.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[1/*leafNames[i].length*/];

            for (int j = 0; j < leafNames[i].length; ++j)
            {
                this.field_150129_M[i][j] = p_149651_1_.registerIcon(Reference.MODID + ":" + leafNames[i][j]);
            }
        }
    }

    public String[] func_150125_e()
    {
        return typeNames;
    }

	@Override
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
		//TODO: add effect for tree like in aether
	}
}