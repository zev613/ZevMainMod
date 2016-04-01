package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.blocks.ZevBlockSlab;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemZevBlockSlab extends ItemSlab 
{
	
	public ItemZevBlockSlab(
	        final Block block,
	        final ZevBlockSlab slab,
	        final ZevBlockSlab doubleSlab,
	        final Boolean stacked) 
	{
	        super(block, slab, doubleSlab, stacked);
	        	//System.out.println("In ItemBlockSlab.Class, block is: " + block);
	}
}
