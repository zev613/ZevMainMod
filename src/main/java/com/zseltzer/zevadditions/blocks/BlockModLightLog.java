package com.zseltzer.zevadditions.blocks;

import java.util.List;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockModLightLog extends BlockModLogBase
{
	//public static final String[] BlockModLightLeaves.typeNames = new String[] {"lightOak"};
    @SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000277";
    
    public BlockModLightLog(String unlocalizedName)
    {
    	this.setBlockName(unlocalizedName/*BlockModLightLeaves.typeNames[ModBlocks.currentNum]*/);
    	this.setBlockTextureName("log_" + unlocalizedName);
    	this.setCreativeTab(ModTabs.tabNewBlocks);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
        //p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150167_a = new IIcon[BlockModLightLeaves.typeNames.length];
        this.field_150166_b = new IIcon[BlockModLightLeaves.typeNames.length];

        for (int i = 0; i < this.field_150167_a.length; ++i)
        {
            this.field_150167_a[i] = p_149651_1_.registerIcon(Reference.MODID + ":log_" + this.getTextureName() + "_" + BlockModLightLeaves.typeNames[ModBlocks.currentNum]);
            this.field_150166_b[i] = p_149651_1_.registerIcon(Reference.MODID + ":log_" + this.getTextureName() + "_" + BlockModLightLeaves.typeNames[ModBlocks.currentNum] + "_top");
        }
    }
}