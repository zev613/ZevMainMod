package com.zseltzer.zevadditions.tabs;

import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModItems;

import com.zseltzer.zevadditions.init.ModStairs;
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

	public static CreativeTabs tabArmory = new CreativeTabs("tabArmory")
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem()
	    {
	        return ModArmory.rubyChestplate;
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

	public static CreativeTabs tabNewRocks = new CreativeTabs("tabNewRocks")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ModBlocks.gabbro);
		}
	};
	
	public static CreativeTabs tabDecorations = new CreativeTabs("tabDecorations")
	{
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() 
	    {
	    	return Item.getItemFromBlock(ModStairs.enderPearlBlockStairs);
	    }
	};

    public static CreativeTabs tabWorld = new CreativeTabs("tabWorld")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.hardenedDirt);
        }
    };
}