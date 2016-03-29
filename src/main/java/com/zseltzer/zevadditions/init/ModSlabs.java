package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.blocks.ZevBlockSlab;
import com.zseltzer.zevadditions.items.ItemZevBlockSlab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ModSlabs 
{
	
	public static String[] slabTypeNames = new String[] {"adobeBlock", "adobe_bricks", "adobeTile", "amethystBlock", "amethystOre", "andesite", "andesite_bricks", "andesite_smooth", "aquamarineBlock", "aquaStone", 
		"aquaStone_smooth", "ashBlock", "ashStone", "bambooThatchBlock", "basalt", "basalt_bricks", "basalt_smooth", "bedrock", "blazeBlock", "blueStone", "blueStone_smooth", "bonemealBlock", "boneBlock", "brownStone", "brownStone_smooth",
		"cementBlock", "charcoalBlock", "chert", "chert_bricks", "chertPolishedBlock", "chertCobble", "cherry_planks", "clay", "coalBlock", "coarseDirt", "copperOre", "crackedSand", "cragRock", "dacite", "dacite_bricks", "dacitePolishedBlock", "daciteCobble", "darkPrismarine", "diamondBlock", "diorite", "diorite_bricks", "diorite_smooth", "dirt", "driedDirt", "emeraldBlock", "emeraldOre", "enderPearlBlock", 
		"endStone", "endStoneBrick", "fir_planks", "flintBlock", "gabbro", "gabbro_bricks", "gabbroPolishedBlock", "gabbroCobble", "glowstone", "goldBlock", "granite", "granite_bricks", "granite_smooth", "graniteCobble", "gravel", "gunpowderBlock", "hardenedClay", "hardenedClay_black", "hardenedClay_blue", 
		"hardenedClay_brown", "hardenedClay_cyan", "hardenedClay_gray", "hardenedClay_green", "hardenedClay_lightBlue", "hardenedClay_lightGray", "hardenedClay_lime", "hardenedClay_magenta", 
		"hardenedClay_orange", "hardenedClay_pink", "hardenedClay_purple", "hardenedClay_red", "hardenedClay_white", "hardenedClay_yellow", "hardenedDirt", "hardenedSand", "hardenedSandstone", "hardenedSandstone_bricks", "hardenedSandstoneCobble", "hardenedSandstonePolishedBlock", "hardenedIce", "hayVariant1", "ironBlock", "lapisBlock", "lightForestDirt", 
		"lightStone", "limeStone", "limeStone_smooth", "marble", "marble_bricks", "marblePolishedBlock", "marbleCobble", "melonBlock", "mudBlock", "mud_bricks", "mushroomBlock1", "mushroomBlock2", "mushroomBlock3", "mushroomBlock4", 
		"netherrack", "obsidian", "obsidian_smooth", "packedIce", "palm_planks", "pine_planks", "pinkStone", "pinkStone_smooth", "prismarine_bricks", "quartzStone", "quartzStone_bricks", "quartzStonePolishedBlock", "quartzStoneCobble", "quickSand", "redRock", "redRock_bricks", "redRockCobble", "redRockTile", "redstoneBlock", 
		"redwood_planks", "rhyolite", "rhyolite_bricks", "rhyolitePolishedBlock", "rhyoliteCobble", "rubyBlock", "rubyOre", "sandCoarseDirt", "sandDirt", "sapphireBlock", "sapphireOre", "schist", "schist_bricks", "schistCobble", "schistPolishedBlock", "shale", "shale_bricks", "shalePolishedBlock", "shale_smooth", "shaleCobble", "siltStone", "siltStone_smooth", "slate", "slate_bricks", "slateCobble", "stoneChalk", "stoneChalk_bricks", "stoneChalkPolishedBlock", "stoneChalkCobble", "silverBlock", "silverOre", "smoothStone", 
		"snow", "soulSand", "sponge", "stone_limestone", "stone_limestone_bricks", "stone_limestoneCobble", "stone_limestonePolishedBlock", "stone1", "stone2", "stone3", "stone4", "stone5", "stone6", "stone7", "stone8", "stone9", "stone10", "stone11", "stone12", "sugarBlock", "thatch", "thatch_other", "topazBlock", "topazOre", "willow_planks", "wool_black", "wool_blue", "wool_brown", "wool_cyan", "wool_gray", "wool_green", 
		"wool_lightBlue", "wool_lightGray", "wool_lime", "wool_magenta", "wool_orange", "wool_pink", "wool_purple", "wool_red", "wool_white", "wool_yellow", "yellowStone", "yellowStone_smooth"};
	
	public static void init()
	{
		ZevBlockSlab[] allSlabBlocks;

	    ItemSlab[] stainedBrickSlabItemBlocks;
	    	allSlabBlocks =
	            new ZevBlockSlab[2 * slabTypeNames.length];
	        stainedBrickSlabItemBlocks =
	            new ItemSlab[2 * slabTypeNames.length];

		 for (int j = 0; j < slabTypeNames.length; j++) 
		 {			 
			 	ZevBlockSlab slab = new ZevBlockSlab(false, slabTypeNames[j]);
	            ZevBlockSlab doubleSlab =
	                new ZevBlockSlab(true, slabTypeNames[j]);
	            ItemSlab itemSlab = new ItemSlab(slab, slab, doubleSlab, false);
	            ItemSlab itemDoubleSlab =
	                new ItemSlab(doubleSlab, slab, doubleSlab, true);
	            allSlabBlocks[2 * j] = slab;
	            allSlabBlocks[2 * j + 1] = doubleSlab;
	            stainedBrickSlabItemBlocks[2 * j] = itemSlab;
	            stainedBrickSlabItemBlocks[2 * j + 1] = itemDoubleSlab;
	            
	            GameRegistry.registerBlock(
	                slab,
	                ItemZevBlockSlab.class,
	                slab.getId(),
	                slab,
	                doubleSlab,
	                false);
	            GameRegistry.registerBlock(
	                doubleSlab,
	                ItemZevBlockSlab.class,
	                doubleSlab.getId(),
	                slab,
	                doubleSlab,
	                true);
		}
	}
}
