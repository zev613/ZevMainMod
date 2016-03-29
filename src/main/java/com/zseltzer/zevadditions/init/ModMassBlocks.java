package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.blocks.ZevBlockSlab;
import com.zseltzer.zevadditions.items.ItemZevBlockSlab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;
/*
public class ModMassBlocks 
{
	public static String[] massBlockTypeNames = new String[] {"adobeBricks", "adobeBlock", "adobeTile", "andesite", "andesite_smooth", "cementBlock", "diorite", "diorite_smooth", "endStoneBrick", "granite", "granite_smooth", "hardenedDirt", "hardenedSand", "hayVariant1", "marble", "marbleBricks", "mud", "mudBricks", "mushroomBlock1", "mushroomBlock2", "mushroomBlock3", "mushroomBlock4", "redRock", "redRockBrick", "redRockCobble", "sandyDirt", "silverBlock", "silverOre", "stoneChalk", "stoneChalk_bricks"};
	
	public static void init()
	{
		GenericMassBlock[] massBlocks;

	    	massBlocks =
	            new GenericMassBlock[2 * massBlockTypeNames.length];

		 for (int j = 0; j < massBlockTypeNames.length; j++) 
		 {
			 	GenericMassBlock blocks = new GenericMassBlock(massBlockTypeNames[j]);
	            massBlocks[2 * j] = blocks;
	            
	            RegisterHelper.registerBlock(blocks);
		}
	}
}
*/