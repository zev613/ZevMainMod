package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.blocks.BlockBasic;
import com.zseltzer.zevadditions.blocks.BlockModLightGrass;
import com.zseltzer.zevadditions.blocks.BlockModLightLeaves;
import com.zseltzer.zevadditions.blocks.BlockModLightLog;
import com.zseltzer.zevadditions.blocks.BlockModLightSapling;
import com.zseltzer.zevadditions.blocks.BlockModPortal;
import com.zseltzer.zevadditions.blocks.BlockVerticalSlab;
import com.zseltzer.zevadditions.blocks.GenericBaseBlock;
import com.zseltzer.zevadditions.blocks.GenericSidedBlock;
import com.zseltzer.zevadditions.blocks.GenericWoodBlock;
import com.zseltzer.zevadditions.blocks.StorageBlock;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;

public class ModBlocks 
{
	
//STANDARD BLOCKS
	
	public static Block adobeBlock = new GenericBaseBlock("adobeBlock", Material.rock);
	public static Block adobe_bricks = new GenericBaseBlock("adobe_bricks", Material.rock);
	public static Block adobeTile = new GenericBaseBlock("adobeTile", Material.rock);
	public static Block amethystOre = new GenericBaseBlock("amethystOre", Material.rock);
	public static Block andesite = new GenericBaseBlock("andesite", Material.rock);
	public static Block andesite_bricks = new GenericBaseBlock("andesite_bricks", Material.rock);
	public static Block andesite_smooth = new GenericBaseBlock("andesite_smooth", Material.rock);
	public static Block aquamarineBlock = new GenericBaseBlock("aquamarineBlock", Material.rock);
	public static Block aquaStone = new GenericBaseBlock("aquaStone", Material.rock);
	public static Block aquaStone_smooth = new GenericBaseBlock("aquaStone_smooth", Material.rock);
	public static Block ashBlock = new GenericBaseBlock("ashBlock", Material.rock);
	public static Block ashStone = new GenericBaseBlock("ashStone", Material.rock);
	public static Block bambooThatchBlock = new GenericBaseBlock("bambooThatchBlock", Material.cloth);
	public static Block basalt = new GenericBaseBlock("basalt", Material.rock);
	public static Block basalt_bricks = new GenericBaseBlock("basalt_bricks", Material.rock);
	public static Block basalt_smooth = new GenericBaseBlock("basalt_smooth", Material.rock);
	public static Block blueStone = new GenericBaseBlock("blueStone", Material.rock);
	public static Block blueStone_smooth = new GenericBaseBlock("blueStone_smooth", Material.rock);
	public static Block brownStone = new GenericBaseBlock("brownStone", Material.rock);
	public static Block brownStone_smooth = new GenericBaseBlock("brownStone_smooth", Material.rock);
	public static Block cementBlock = new GenericBaseBlock("cementBlock", Material.rock);
	public static Block charcoalBlock = new GenericBaseBlock("charcoalBlock", Material.rock);
	public static Block chert = new GenericBaseBlock("chert", Material.rock);
	public static Block chert_bricks = new GenericBaseBlock("chert_bricks", Material.rock);
	public static Block chertPolishedBlock = new GenericBaseBlock("chertPolishedBlock", Material.rock);
	public static Block chertCobble = new GenericBaseBlock("chertCobble", Material.rock); 
	public static Block coarseDirt = new GenericBaseBlock("coarseDirt", Material.ground);
	public static Block copperOre = new GenericBaseBlock("copperOre", Material.rock);
	public static Block crackedSand = new GenericBaseBlock("crackedSand", Material.sand);
	public static Block cragRock = new GenericBaseBlock("cragRock", Material.rock);
	public static Block dacite = new GenericBaseBlock("dacite", Material.rock);
	public static Block dacite_bricks = new GenericBaseBlock("dacite_bricks", Material.rock);
	public static Block dacitePolishedBlock = new GenericBaseBlock("dacitePolishedBlock", Material.rock);
	public static Block daciteCobble = new GenericBaseBlock("daciteCobble", Material.rock); 
	public static Block darkPrismarine = new GenericBaseBlock("darkPrismarine", Material.rock);
	public static Block diorite = new GenericBaseBlock("diorite", Material.rock);
	public static Block diorite_bricks = new GenericBaseBlock("diorite_bricks", Material.rock);
	public static Block diorite_smooth = new GenericBaseBlock("diorite_smooth", Material.rock);
	public static Block driedDirt = new GenericBaseBlock("driedDirt", Material.ground);
	public static Block endStoneBricks = new GenericBaseBlock("endStoneBricks", Material.rock);
	public static Block fir_planks = new GenericWoodBlock("fir_planks");
	public static Block gabbro = new GenericBaseBlock("gabbro", Material.rock);
	public static Block gabbro_bricks  = new GenericBaseBlock("gabbro_bricks", Material.rock);
	public static Block gabbroPolishedBlock = new GenericBaseBlock("gabbroPolishedBlock", Material.rock);
	public static Block gabbroCobble = new GenericBaseBlock("gabbroCobble", Material.rock);
	public static Block granite = new GenericBaseBlock("granite", Material.rock);
	public static Block granite_bricks = new GenericBaseBlock("granite_bricks", Material.rock);
	public static Block granite_smooth = new GenericBaseBlock("granite_smooth", Material.rock);
	public static Block graniteCobble = new GenericBaseBlock("graniteCobble", Material.rock);
	public static Block hardenedDirt = new GenericBaseBlock("hardenedDirt", Material.ground);
	public static Block hardenedSand = new GenericBaseBlock("hardenedSand", Material.sand);
	public static Block hardenedSandstone = new GenericBaseBlock("hardenedSandstone", Material.rock);
	public static Block hardenedSandstone_bricks = new GenericBaseBlock("hardenedSandstone_bricks", Material.rock);
	public static Block hardenedSandstoneCobble = new GenericBaseBlock("hardenedSandstoneCobble", Material.rock);
	public static Block hardenedSandstonePolishedBlock = new GenericBaseBlock("hardenedSandstonePolishedBlock", Material.rock);
	public static Block hardenedIce = new GenericBaseBlock("hardenedIce", Material.rock);
	public static Block hayVariant1 = new GenericBaseBlock("hayVariant1", Material.cloth);
	public static Block limeStone = new GenericBaseBlock("limeStone", Material.rock);
	public static Block limeStone_smooth = new GenericBaseBlock("limeStone_smooth", Material.rock);
	public static Block marble = new GenericBaseBlock("marble", Material.rock);
	public static Block marble_bricks = new GenericBaseBlock("marble_bricks", Material.rock);
	public static Block marblePolishedBlock = new GenericBaseBlock("marblePolishedBlock", Material.rock);
	public static Block marbleCobble = new GenericBaseBlock("marbleCobble", Material.rock);
	public static Block mud_bricks = new GenericBaseBlock("mud_bricks", Material.clay);
	public static Block mudBlock = new GenericBaseBlock("mudBlock", Material.clay);
	public static Block mushroomBlock1 = new GenericBaseBlock("mushroomBlock1", Material.ground);
	public static Block mushroomBlock2 = new GenericBaseBlock("mushroomBlock2", Material.ground);
	public static Block mushroomBlock3 = new GenericBaseBlock("mushroomBlock3", Material.ground);
	public static Block mushroomBlock4 = new GenericBaseBlock("mushroomBlock4", Material.ground);
	public static Block obsidian_pillar = new GenericSidedBlock("obsidian_pillar", Material.rock);
	public static Block obsidian_smooth = new GenericBaseBlock("obsidian_smooth", Material.rock);
	public static Block palm_planks = new GenericBaseBlock("palm_planks", Material.rock);
	public static Block pine_planks = new GenericBaseBlock("pine_planks", Material.wood);
	public static Block pinkStone = new GenericBaseBlock("pinkStone", Material.rock);
	public static Block pinkStone_smooth = new GenericBaseBlock("pinkStone_smooth", Material.rock);
	public static Block prismarine_bricks = new GenericBaseBlock("prismarine_bricks", Material.rock);
	public static Block quartzStone = new GenericBaseBlock("quartzStone", Material.rock);
	public static Block quartzStone_bricks = new GenericBaseBlock("quartzStone_bricks", Material.rock);
	public static Block quartzStonePolishedBlock = new GenericBaseBlock("quartzStonePolishedBlock", Material.rock);
	public static Block quartzStoneCobble = new GenericBaseBlock("quartzStoneCobble", Material.rock);
	public static Block quickSand = new GenericBaseBlock("quickSand", Material.sand);
	public static Block redRock = new GenericBaseBlock("redRock", Material.rock);
	public static Block redRock_bricks = new GenericBaseBlock("redRock_bricks", Material.rock);
	public static Block redRockCobble = new GenericBaseBlock("redRockCobble", Material.rock);
	public static Block redRockTile = new GenericBaseBlock("redRockTile", Material.rock);
	public static Block redwood_planks = new GenericWoodBlock("redwood_planks");
	public static Block rhyolite = new GenericBaseBlock("rhyolite", Material.rock);
	public static Block rhyolite_bricks = new GenericBaseBlock("rhyolite_bricks", Material.rock);
	public static Block rhyolitePolishedBlock = new GenericBaseBlock("rhyolitePolishedBlock", Material.rock);
	public static Block rhyoliteCobble = new GenericBaseBlock("rhyoliteCobble", Material.rock);
	public static Block rubyOre = new GenericBaseBlock("rubyOre", Material.rock);
	public static Block sandCoarseDirt = new GenericBaseBlock("sandCoarseDirt", Material.rock);
	public static Block sandDirt = new GenericBaseBlock("sandDirt", Material.rock);
	public static Block sapphireOre = new GenericBaseBlock("sapphireOre", Material.rock);
	public static Block schist = new GenericBaseBlock("schist", Material.rock);
	public static Block schist_bricks = new GenericBaseBlock("schist_bricks", Material.rock);
	public static Block schistCobble = new GenericBaseBlock("schistCobble", Material.rock);
	public static Block schistPolishedBlock = new GenericBaseBlock("schistPolishedBlock", Material.rock);
	public static Block shale = new GenericBaseBlock("shale", Material.rock);
	public static Block shale_bricks = new GenericBaseBlock("shale_bricks", Material.rock);
	public static Block shalePolishedBlock = new GenericBaseBlock("shalePolishedBlock", Material.rock);
	public static Block shale_smooth = new GenericBaseBlock("shale_smooth", Material.rock);
	public static Block shaleCobble = new GenericBaseBlock("shaleCobble", Material.rock);
	public static Block siltStone = new GenericBaseBlock("siltStone", Material.rock);
	public static Block siltStone_smooth = new GenericBaseBlock("siltStone_smooth", Material.rock);
	public static Block silverOre = new GenericBaseBlock("silverOre", Material.rock);
	public static Block stoneChalk = new GenericBaseBlock("stoneChalk", Material.rock);
	public static Block stoneChalk_bricks = new GenericBaseBlock("stoneChalk_bricks", Material.rock);
	public static Block stoneChalkPolishedBlock = new GenericBaseBlock("stoneChalkPolishedBlock", Material.rock);
	public static Block stoneChalkCobble = new GenericBaseBlock("stoneChalkCobble", Material.rock);
	public static Block slate = new GenericBaseBlock("slate", Material.rock);
	public static Block slate_bricks = new GenericBaseBlock("slate_bricks", Material.rock);
	public static Block slateCobble = new GenericBaseBlock("slateCobble", Material.rock);
	public static Block stone_limestone = new GenericBaseBlock("stone_limestone", Material.rock);
	public static Block stone_limestone_bricks = new GenericBaseBlock("stone_limestone_bricks", Material.rock);
	public static Block stone_limestoneCobble = new GenericBaseBlock("stone_limestoneCobble", Material.rock);
	public static Block stone_limestonePolishedBlock = new GenericBaseBlock("stone_limestonePolishedBlock", Material.rock);
	public static Block stone1 = new GenericBaseBlock("stone1", Material.rock);
	public static Block stone2 = new GenericBaseBlock("stone2", Material.rock);
	public static Block stone3 = new GenericBaseBlock("stone3", Material.rock);
	public static Block stone4 = new GenericBaseBlock("stone4", Material.rock);
	public static Block stone5 = new GenericBaseBlock("stone5", Material.rock);
	public static Block stone6 = new GenericBaseBlock("stone6", Material.rock);
	public static Block stone7 = new GenericBaseBlock("stone7", Material.rock);
	public static Block stone8 = new GenericBaseBlock("stone8", Material.rock);
	public static Block stone9 = new GenericBaseBlock("stone9", Material.rock);
	public static Block stone10 = new GenericBaseBlock("stone10", Material.rock);
	public static Block stone11 = new GenericBaseBlock("stone11", Material.rock);
	public static Block stone12 = new GenericBaseBlock("stone12", Material.rock);
	public static Block thatch	= new GenericBaseBlock("thatch", Material.cloth);
	public static Block thatch_other = new GenericBaseBlock("thatch_other", Material.rock);
	public static Block topazOre = new GenericBaseBlock("topazOre", Material.rock);
	public static Block willow_planks = new GenericBaseBlock("willow_planks", Material.wood);
	public static Block yellowStone = new GenericBaseBlock("yellowStone", Material.rock);
	public static Block yellowStone_smooth = new GenericBaseBlock("yellowStone_smooth", Material.rock);

//STORAGE BLOCKS	
	
	public static Block amethystBlock = new StorageBlock("amethystBlock", Material.rock, ModItems.amethystIngot);
	public static Block boneBlock = new StorageBlock("boneBlock", Material.cloth, Items.bone);
	public static Block bonemealBlock = new StorageBlock("bonemealBlock", Material.cloth, ModItems.whiteDye);
	public static Block blazeBlock = new StorageBlock("blazeBlock", Material.cloth, Items.blaze_powder);
	public static Block rottenFleshBlock = new StorageBlock("rottenFleshBlock", Material.cloth, Items.rotten_flesh); 
	public static Block enderPearlBlock = new StorageBlock("enderPearlBlock", Material.rock, Items.ender_pearl);
	public static Block flintBlock = new StorageBlock("flintBlock", Material.rock, Items.flint);
	public static Block gunpowderBlock = new StorageBlock("gunpowderBlock", Material.cloth, Items.gunpowder);
	public static Block rubyBlock = new StorageBlock("rubyBlock", Material.rock, ModItems.rubyIngot);
	public static Block sapphireBlock = new StorageBlock("sapphireBlock", Material.rock, ModItems.sapphireIngot);
	public static Block sugarBlock = new StorageBlock("sugarBlock", Material.cloth, Items.sugar);
	public static Block silverBlock = new StorageBlock("silverBlock", Material.rock, ModItems.silverIngot);
	public static Block topazBlock = new StorageBlock("topazBlock", Material.rock, ModItems.topazIngot);

//RANDOM BLOCKS (ADOBE, LOGOS, ETC)
	
	public static Block adobeIncAfterEffects = new GenericBaseBlock("adobeIncAfterEffects", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);;
	public static Block adobeIncAudition = new GenericBaseBlock("adobeIncAudition", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncBridge = new GenericBaseBlock("adobeIncBridge", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);;
	public static Block adobeIncDreamweaver = new GenericBaseBlock("adobeIncDreamweaver", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncEncore = new GenericBaseBlock("adobeIncEncore", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncFireworks = new GenericBaseBlock("adobeIncFireworks", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncFlash = new GenericBaseBlock("adobeIncFlash", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncIllustrator = new GenericBaseBlock("adobeIncIllustrator", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncInDesign = new GenericBaseBlock("adobeIncInDesign", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncLightroom = new GenericBaseBlock("adobeIncLightroom", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncPhotoshop = new GenericBaseBlock("adobeIncPhotoshop", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncPrelude = new GenericBaseBlock("adobeIncPrelude", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncPremierPro = new GenericBaseBlock("adobeIncPremierPro", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block adobeIncSpeedgrade = new GenericBaseBlock("adobeIncSpeedgrade", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block deadpoolBlock = new GenericBaseBlock("deadpoolBlock", Material.rock).setCreativeTab(ModTabs.tabMassBlocks);
	public static Block verticalSlabTest = new BlockVerticalSlab("verticalSlabTest");
	
//SLAB BLOCKS	

//STAIR BLOCKS
	/*
	public static String[] stairTypeNames = {"bedrock", "sponge", "dirt", "smoothStone", "basalt", "shale", "obsidian", "iron_Block", "aquaStone", "endStone"};

	public static Block[] stairBlockNames = {Blocks.bedrock, Blocks.sponge, Blocks.dirt, Blocks.stone, ModBlocks.basalt, ModBlocks.shale, Blocks.obsidian, Blocks.iron_block, ModBlocks.aquaStone, Blocks.end_stone,};
	{
	
	for (int i = 0; i > stairTypeNames.length; i++)
		{
			Block stairBlockNames[i] = new ZevBlockStairs(stairBlockNames[i]);
		}
	}
	*/
	
	public static int currentNum = 0;
	
//OTHER PLANTS
	
//TREES
	/*
	public static void initTrees()
	{	
		int i_this;
		
		for(int i = 0; i < BlockModLightLeaves.typeNames.length; i ++)
		{
			BlockModLightLog logs = new BlockModLightLog(BlockModLightLeaves.typeNames[i]);
			BlockModLightLeaves leaves = new BlockModLightLeaves(BlockModLightLeaves.typeNames[i]);
			BlockModLightSapling saplings = new BlockModLightSapling(BlockModLightLeaves.typeNames[i]);

			 	//ZevBlockSlab doubleSlab =
	                //new ZevBlockSlab(true, slabTypeNames[j]);
	            //ItemSlab itemSlab = new ItemSlab(slab, slab, doubleSlab, false);
	            //ItemSlab itemDoubleSlab =
	                //new ItemSlab(doubleSlab, slab, doubleSlab, true);
	            //allSlabBlocks[2 * j] = slab;
	            //allSlabBlocks[2 * j + 1] = doubleSlab;
	            //stainedBrickSlabItemBlocks[2 * j] = itemSlab;
	            //stainedBrickSlabItemBlocks[2 * j + 1] = itemDoubleSlab;
	            
	            RegisterHelper.registerBlock(logs);
	            RegisterHelper.registerBlock(leaves);
	            RegisterHelper.registerBlock(saplings);
		}
	}
	*/
	
//BIOMES BLOCKS	
	
	public static Block lightStone = new BlockBasic(Material.rock, "lightStone", "lightStone", Block.soundTypeStone);
	public static Block lightForestGrass = new BlockModLightGrass(Material.rock, "lightForestGrass", Block.soundTypeGrass);
	public static Block lightForestDirt = new BlockBasic(Material.rock, "lightForestDirt", "lightForestDirt", Block.soundTypeGrass);
	//public static Block effectLeaves = new BlockModEffectLeaves("effectLeaves", "effect");
	public static Block lightPortal = new BlockModPortal("lightPortal");
	//public static Block lightFire  = new BlockModFire("lightFire");
	
	
	public static Block lightLog = new BlockModLightLog("light");
	public static Block lightLeaves = new BlockModLightLeaves("light");
	public static Block lightSapling = new BlockModLightSapling("light");
	
	public static Block cherryLog = new BlockModLightLog("cherry");
	public static Block cherryLeaves = new BlockModLightLeaves("cherry");
	public static Block cherrySapling = new BlockModLightSapling("cherry");
	
	public static Block redwoodLog = new BlockModLightLog("redwood");
	public static Block redwoodLeaves = new BlockModLightLeaves("redwood");
	public static Block redwoodSapling = new BlockModLightSapling("redwood");
	
	
public static void init()
{

	//STANDARD BLOCKS
		
	 RegisterHelper.registerBlock(adobeBlock);
	 RegisterHelper.registerBlock(adobe_bricks);
	 RegisterHelper.registerBlock(adobeTile);
	 RegisterHelper.registerBlock(amethystOre);
	 RegisterHelper.registerBlock(andesite);
	 RegisterHelper.registerBlock(andesite_bricks);
	 RegisterHelper.registerBlock(andesite_smooth);
	 RegisterHelper.registerBlock(aquamarineBlock);
	 RegisterHelper.registerBlock(aquaStone);
	 RegisterHelper.registerBlock(aquaStone_smooth);
	 RegisterHelper.registerBlock(ashBlock);
	 RegisterHelper.registerBlock(ashStone);
	 RegisterHelper.registerBlock(bambooThatchBlock);
	 RegisterHelper.registerBlock(basalt);
	 RegisterHelper.registerBlock(basalt_bricks);
	 RegisterHelper.registerBlock(basalt_smooth);
	 RegisterHelper.registerBlock(blueStone);
	 RegisterHelper.registerBlock(blueStone_smooth);
	 RegisterHelper.registerBlock(brownStone);
	 RegisterHelper.registerBlock(brownStone_smooth);
	 RegisterHelper.registerBlock( cementBlock);
	 RegisterHelper.registerBlock(charcoalBlock);
	 RegisterHelper.registerBlock(chert);
	 RegisterHelper.registerBlock(chert_bricks);
	 RegisterHelper.registerBlock(chertPolishedBlock);
	 RegisterHelper.registerBlock(chertCobble); 
	 RegisterHelper.registerBlock(coarseDirt);
	 RegisterHelper.registerBlock(copperOre);
	 RegisterHelper.registerBlock(crackedSand);
	 RegisterHelper.registerBlock(cragRock);
	 RegisterHelper.registerBlock(dacite);
	 RegisterHelper.registerBlock(dacite_bricks);
	 RegisterHelper.registerBlock(dacitePolishedBlock);
	 RegisterHelper.registerBlock(daciteCobble); 
	 RegisterHelper.registerBlock(darkPrismarine);
	 RegisterHelper.registerBlock(diorite);
	 RegisterHelper.registerBlock(diorite_bricks);
	 RegisterHelper.registerBlock(diorite_smooth);
	 RegisterHelper.registerBlock(driedDirt);
	 RegisterHelper.registerBlock(endStoneBricks);
	 RegisterHelper.registerBlock(fir_planks);
	 RegisterHelper.registerBlock(gabbro);
	 RegisterHelper.registerBlock(gabbro_bricks);
	 RegisterHelper.registerBlock(gabbroPolishedBlock);
	 RegisterHelper.registerBlock(gabbroCobble);
	 RegisterHelper.registerBlock(granite);
	 RegisterHelper.registerBlock(granite_bricks);
	 RegisterHelper.registerBlock(granite_smooth);
	 RegisterHelper.registerBlock(graniteCobble);
	 RegisterHelper.registerBlock(hardenedDirt);
	 RegisterHelper.registerBlock(hardenedSand);
	 RegisterHelper.registerBlock(hardenedSandstone);
	 RegisterHelper.registerBlock(hardenedSandstone_bricks);
	 RegisterHelper.registerBlock(hardenedSandstoneCobble);
	 RegisterHelper.registerBlock(hardenedSandstonePolishedBlock);
	 RegisterHelper.registerBlock(hardenedIce);
	 RegisterHelper.registerBlock(hayVariant1);
	 RegisterHelper.registerBlock(limeStone);
	 RegisterHelper.registerBlock(limeStone_smooth);
	 RegisterHelper.registerBlock(marble);
	 RegisterHelper.registerBlock(marble_bricks);
	 RegisterHelper.registerBlock(marblePolishedBlock);
	 RegisterHelper.registerBlock(marbleCobble);
	 RegisterHelper.registerBlock(mud_bricks);
	 RegisterHelper.registerBlock(mudBlock);
	 RegisterHelper.registerBlock(mushroomBlock1);
	 RegisterHelper.registerBlock(mushroomBlock2);
	 RegisterHelper.registerBlock(mushroomBlock3);
	 RegisterHelper.registerBlock(mushroomBlock4);
	 RegisterHelper.registerBlock(obsidian_pillar);
	 RegisterHelper.registerBlock(obsidian_smooth);
	 RegisterHelper.registerBlock(palm_planks);
	 RegisterHelper.registerBlock(pine_planks);
	 RegisterHelper.registerBlock(pinkStone);
	 RegisterHelper.registerBlock(pinkStone_smooth);
	 RegisterHelper.registerBlock(prismarine_bricks);
	 RegisterHelper.registerBlock(quartzStone);
	 RegisterHelper.registerBlock(quartzStone_bricks);
	 RegisterHelper.registerBlock(quartzStonePolishedBlock);
	 RegisterHelper.registerBlock(quartzStoneCobble);
	 RegisterHelper.registerBlock(quickSand);
	 RegisterHelper.registerBlock(redRock);
	 RegisterHelper.registerBlock(redRock_bricks);
	 RegisterHelper.registerBlock(redRockCobble);
	 RegisterHelper.registerBlock(redRockTile);
	 RegisterHelper.registerBlock(redwood_planks);
	 RegisterHelper.registerBlock(rhyolite);
	 RegisterHelper.registerBlock(rhyolite_bricks);
	 RegisterHelper.registerBlock(rhyolitePolishedBlock);
	 RegisterHelper.registerBlock(rhyoliteCobble);
	 RegisterHelper.registerBlock(rubyOre);
	 RegisterHelper.registerBlock(sandCoarseDirt);
	 RegisterHelper.registerBlock(sandDirt);
	 RegisterHelper.registerBlock(sapphireOre);
	 RegisterHelper.registerBlock(schist);
	 RegisterHelper.registerBlock(schist_bricks);
	 RegisterHelper.registerBlock(schistCobble);
	 RegisterHelper.registerBlock(schistPolishedBlock);
	 RegisterHelper.registerBlock(shale);
	 RegisterHelper.registerBlock(shale_bricks);
	 RegisterHelper.registerBlock(shalePolishedBlock);
	 RegisterHelper.registerBlock(shale_smooth);
	 RegisterHelper.registerBlock(shaleCobble);
	 RegisterHelper.registerBlock(siltStone);
	 RegisterHelper.registerBlock(siltStone_smooth);
	 RegisterHelper.registerBlock(silverOre);
	 RegisterHelper.registerBlock(stoneChalk);
	 RegisterHelper.registerBlock(stoneChalk_bricks);
	 RegisterHelper.registerBlock(stoneChalkPolishedBlock);
	 RegisterHelper.registerBlock(stoneChalkCobble);
	 RegisterHelper.registerBlock(slate);
	 RegisterHelper.registerBlock(slate_bricks);
	 RegisterHelper.registerBlock(slateCobble);
	 RegisterHelper.registerBlock(stone_limestone);
	 RegisterHelper.registerBlock(stone_limestone_bricks);
	 RegisterHelper.registerBlock(stone_limestoneCobble);
	 RegisterHelper.registerBlock(stone_limestonePolishedBlock);
	 RegisterHelper.registerBlock(stone1);
	 RegisterHelper.registerBlock(stone2);
	 RegisterHelper.registerBlock(stone3);
	 RegisterHelper.registerBlock(stone4);
	 RegisterHelper.registerBlock(stone5);
	 RegisterHelper.registerBlock(stone6);
	 RegisterHelper.registerBlock(stone7);
	 RegisterHelper.registerBlock(stone8);
	 RegisterHelper.registerBlock(stone9);
	 RegisterHelper.registerBlock(stone10);
	 RegisterHelper.registerBlock(stone11);
	 RegisterHelper.registerBlock(stone12);
	 RegisterHelper.registerBlock(thatch);
	 RegisterHelper.registerBlock(thatch_other);
	 RegisterHelper.registerBlock(topazOre);
	 RegisterHelper.registerBlock(willow_planks);
	 RegisterHelper.registerBlock(yellowStone);
	 RegisterHelper.registerBlock(yellowStone_smooth);
	
//STORAGE BLOCKS	
	
	 	RegisterHelper.registerBlock(amethystBlock);
	 	RegisterHelper.registerBlock(boneBlock);
	 	RegisterHelper.registerBlock(bonemealBlock);
	 	RegisterHelper.registerBlock(blazeBlock);
	 	RegisterHelper.registerBlock(enderPearlBlock);
		RegisterHelper.registerBlock(flintBlock);
	 	RegisterHelper.registerBlock(gunpowderBlock);
	 	RegisterHelper.registerBlock(rottenFleshBlock);
	 	RegisterHelper.registerBlock(rubyBlock);
	 	RegisterHelper.registerBlock(sapphireBlock);
	 	RegisterHelper.registerBlock(silverBlock);	
	 	RegisterHelper.registerBlock(sugarBlock);
	 	RegisterHelper.registerBlock(topazBlock);
		
//RANDOM / OTHER BLOCKS
	 	
		RegisterHelper.registerBlock(adobeIncAfterEffects);
		RegisterHelper.registerBlock(adobeIncAudition);
		RegisterHelper.registerBlock(adobeIncBridge);
		RegisterHelper.registerBlock(adobeIncDreamweaver);
		RegisterHelper.registerBlock(adobeIncEncore);
		RegisterHelper.registerBlock(adobeIncFireworks);
		RegisterHelper.registerBlock(adobeIncFlash);
		RegisterHelper.registerBlock(adobeIncIllustrator);
		RegisterHelper.registerBlock(adobeIncInDesign);
		RegisterHelper.registerBlock(adobeIncLightroom);
		RegisterHelper.registerBlock(adobeIncPhotoshop);
		RegisterHelper.registerBlock(adobeIncPrelude);
		RegisterHelper.registerBlock(adobeIncPremierPro);
		RegisterHelper.registerBlock(adobeIncSpeedgrade);
		RegisterHelper.registerBlock(deadpoolBlock);
		RegisterHelper.registerBlock(verticalSlabTest);
		
//SLAB BLOCKS	
		
//OTHER PLANTS
		
//TREES		
		
		RegisterHelper.registerBlock(lightLog);
		RegisterHelper.registerBlock(lightLeaves);
		RegisterHelper.registerBlock(lightSapling);
		
		RegisterHelper.registerBlock(cherryLog);
		RegisterHelper.registerBlock(cherryLeaves);
		RegisterHelper.registerBlock(cherrySapling);
		
		RegisterHelper.registerBlock(redwoodLog);
		RegisterHelper.registerBlock(redwoodLeaves);
		RegisterHelper.registerBlock(redwoodSapling);
		
//BIOME BLOCKS	
		
		RegisterHelper.registerBlock(lightForestDirt);
		RegisterHelper.registerBlock(lightForestGrass);
		RegisterHelper.registerBlock(lightStone);
		RegisterHelper.registerBlock(lightPortal);
		//RegisterHelper.registerBlock(lightFire);
		//RegisterHelper.registerBlock(lightLog);
		//RegisterHelper.registerBlock(lightLeaves);
		//RegisterHelper.registerBlock(effectLeaves);
		//RegisterHelper.registerBlock(lightSapling);
		
	}
	
}
