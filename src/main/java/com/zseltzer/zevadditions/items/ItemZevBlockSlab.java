package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.blocks.ZevBlockSlab;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemZevBlockSlab extends ItemSlab 
{
    /*
    Initializes a new instance of the ItemBlockStainedBrickSlab class.
     @param block the block behind the item.
     @param bedrockSlab the half height slab.
     @param bedrockDoubleSlab the full height slab.
     @param stacked whether or not the block is the stacked version.
    */
	
	public ItemZevBlockSlab(
	        final Block block,
	        final ZevBlockSlab slab,
	        final ZevBlockSlab doubleSlab,
	        final Boolean stacked) 
	{
	        super(block, slab, doubleSlab, stacked);
	        	System.out.println("In ItemBlockSlab.Class, block is: " + block);

	}

}
