package com.zseltzer.zevadditions.tabs;

import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModItems;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModHeroBlocks;
import com.zseltzer.zevadditions.superheroes.ModHeroTools;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModTabs 
{
	
	public static CreativeTabs tabNewBlocks = new CreativeTabs("tabNewBlocks") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return Item.getItemFromBlock(ModBlocks.rubyBlock);
	    }
	};

	public static CreativeTabs tabNewItems = new CreativeTabs("tabNewItems") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	        return ModItems.sapphireIngot;
	    }
	};
	
	public static CreativeTabs tabNewSlabs = new CreativeTabs("tabNewSlabs") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return Item.getItemFromBlock(Blocks.stone_slab);
	    }
	};
	
	public static CreativeTabs tabMassBlocks = new CreativeTabs("tabMassBlocks") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return Item.getItemFromBlock(ModBlocks.limeStone_smooth);
	    }
	};
	
	public static CreativeTabs tabHeroItems = new CreativeTabs("tabHeroItems") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return ModHeroTools.willpowerPickaxe;
	    }
	};

	public static CreativeTabs tabHeroCostumes = new CreativeTabs("tabHeroCostumes") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return ModDCCostumes.flashChest;
	    }
	};
	
	public static CreativeTabs tabHeroBlocks = new CreativeTabs("tabHeroBlocks") 
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return Item.getItemFromBlock(ModHeroBlocks.tesseract);
	    }
	};
}