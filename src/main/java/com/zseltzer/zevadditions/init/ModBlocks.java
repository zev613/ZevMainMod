package com.zseltzer.zevadditions.init;
import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.blocks.*;
import com.zseltzer.zevadditions.itemblocks.ItemBlockLeaves;
import com.zseltzer.zevadditions.itemblocks.ItemBlockLog;
import com.zseltzer.zevadditions.itemblocks.ItemBlockSapling;
import com.zseltzer.zevadditions.tabs.ModTabs;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ModBlocks
{
//STANDARD BLOCKS

    public static Block logs;
    public static Block leaves;
    public static Block saplings;

	public static Block adobeBlock = new GenericBaseBlock("adobeBlock", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block adobe_bricks = new GenericBaseBlock("adobe_bricks", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block adobeTile = new GenericBaseBlock("adobeTile", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block amethystOre = new GenericBaseBlock("amethystOre", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block andesite = new GenericBaseBlock("andesite", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block andesite_bricks = new GenericBaseBlock("andesite_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block andesite_smooth = new GenericBaseBlock("andesite_smooth", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block aquamarineBlock = new GenericBaseBlock("aquamarineBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block aquaStone = new GenericBaseBlock("aquaStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block aquaStone_smooth = new GenericBaseBlock("aquaStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block ashBlock = new GenericBaseBlock("ashBlock", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block ashStone = new GenericBaseBlock("ashStone", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block bambooThatchBlock = new GenericBaseBlock("bambooThatchBlock", Material.cloth).setCreativeTab(ModTabs.tabWorld);
	public static Block basalt = new GenericBaseBlock("basalt", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block basalt_bricks = new GenericBaseBlock("basalt_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block basalt_smooth = new GenericBaseBlock("basalt_smooth", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block blueStone = new GenericBaseBlock("blueStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block blueStone_smooth = new GenericBaseBlock("blueStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block bronzeOre = new GenericBaseBlock("bronzeOre", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block brownStone = new GenericBaseBlock("brownStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block brownStone_smooth = new GenericBaseBlock("brownStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block cementBlock = new GenericBaseBlock("cementBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block charcoalBlock = new GenericBaseBlock("charcoalBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block chert = new GenericDropBlock("chert", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block chert_bricks = new GenericBaseBlock("chert_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block chertPolishedBlock = new GenericBaseBlock("chertPolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block chertCobble = new GenericBaseBlock("chertCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block coarseDirt = new GenericBaseBlock("coarseDirt", Material.ground).setCreativeTab(ModTabs.tabWorld);
	public static Block crackedSand = new GenericBaseBlock("crackedSand", Material.sand).setCreativeTab(ModTabs.tabWorld);
	public static Block cragRock = new GenericBaseBlock("cragRock", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block dacite = new GenericDropBlock("dacite", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block dacite_bricks = new GenericBaseBlock("dacite_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block dacitePolishedBlock = new GenericBaseBlock("dacitePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block daciteCobble = new GenericBaseBlock("daciteCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block darkPrismarine = new GenericBaseBlock("darkPrismarine", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block diorite = new GenericBaseBlock("diorite", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block diorite_bricks = new GenericBaseBlock("diorite_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block diorite_smooth = new GenericBaseBlock("diorite_smooth", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block driedDirt = new GenericBaseBlock("driedDirt", Material.ground).setCreativeTab(ModTabs.tabWorld);
    public static Block endStoneBricks = new GenericBaseBlock("endStoneBricks", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block gabbro = new GenericDropBlock("gabbro", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block gabbro_bricks  = new GenericBaseBlock("gabbro_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block gabbroPolishedBlock = new GenericBaseBlock("gabbroPolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block gabbroCobble = new GenericBaseBlock("gabbroCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block granite = new GenericBaseBlock("granite", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block granite_bricks = new GenericBaseBlock("granite_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block granite_smooth = new GenericBaseBlock("granite_smooth", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block graniteCobble = new GenericBaseBlock("graniteCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block greenStone = new GenericBaseBlock("greenStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block greenStone_smooth = new GenericBaseBlock("greenStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block hardenedDirt = new GenericBaseBlock("hardenedDirt", Material.ground).setCreativeTab(ModTabs.tabWorld);
	public static Block hardenedSand = new GenericBaseBlock("hardenedSand", Material.ground).setCreativeTab(ModTabs.tabWorld);
	public static Block hardenedSandstone = new GenericDropBlock("hardenedSandstone", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block hardenedSandstone_bricks = new GenericBaseBlock("hardenedSandstone_bricks", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block hardenedSandstoneCobble = new GenericBaseBlock("hardenedSandstoneCobble", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block hardenedSandstonePolishedBlock = new GenericBaseBlock("hardenedSandstonePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block hardenedIce = new GenericBaseBlock("hardenedIce", Material.packedIce).setCreativeTab(ModTabs.tabWorld);
	public static Block hayVariant = new GenericBaseBlock("hayVariant", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block limestone = new GenericDropBlock("limestone", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
    public static Block limestone_bricks = new GenericBaseBlock("limestone_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
    public static Block limestoneCobble = new GenericBaseBlock("limestoneCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
    public static Block limestonePolishedBlock = new GenericBaseBlock("limestonePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
    public static Block magmaBlock = new GenericBaseBlock("magmaBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block marble = new GenericDropBlock("marble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block marble_bricks = new GenericBaseBlock("marble_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block marblePolishedBlock = new GenericBaseBlock("marblePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block marbleCobble = new GenericBaseBlock("marbleCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block mud_bricks = new GenericBaseBlock("mud_bricks", Material.clay).setCreativeTab(ModTabs.tabWorld);
	public static Block mudBlock = new GenericBaseBlock("mudBlock", Material.clay).setCreativeTab(ModTabs.tabWorld);
	public static Block mushroomBlock1 = new GenericBaseBlock("mushroomBlock1", Material.ground).setCreativeTab(CreativeTabs.tabBlock);
	public static Block mushroomBlock2 = new GenericBaseBlock("mushroomBlock2", Material.ground).setCreativeTab(CreativeTabs.tabBlock);
	public static Block mushroomBlock3 = new GenericBaseBlock("mushroomBlock3", Material.ground).setCreativeTab(CreativeTabs.tabBlock);
	public static Block mushroomBlock4 = new GenericBaseBlock("mushroomBlock4", Material.ground).setCreativeTab(CreativeTabs.tabBlock);
	public static Block obsidian_pillar = new GenericSidedBlock("obsidian_pillar", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block obsidian_smooth = new GenericBaseBlock("obsidian_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block pinkStone = new GenericBaseBlock("pinkStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block pinkStone_smooth = new GenericBaseBlock("pinkStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block prismarine_bricks = new GenericBaseBlock("prismarine_bricks", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block quartzStone = new GenericDropBlock("quartzStone", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block quartzStone_bricks = new GenericBaseBlock("quartzStone_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block quartzStonePolishedBlock = new GenericBaseBlock("quartzStonePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block quartzStoneCobble = new GenericBaseBlock("quartzStoneCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block quickSand = new GenericBaseBlock("quickSand", Material.sand).setCreativeTab(ModTabs.tabWorld);
	public static Block redNetherBrick = new GenericBaseBlock("redNetherBrick", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block redRock = new GenericDropBlock("redRock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block redRock_bricks = new GenericBaseBlock("redRock_bricks", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block redRockCobble = new GenericBaseBlock("redRockCobble", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block redRockTile = new GenericBaseBlock("redRockTile", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block rhyolite = new GenericDropBlock("rhyolite", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block rhyolite_bricks = new GenericBaseBlock("rhyolite_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block rhyolitePolishedBlock = new GenericBaseBlock("rhyolitePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block rhyoliteCobble = new GenericBaseBlock("rhyoliteCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block rubyOre = new GenericBaseBlock("rubyOre", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block sandCoarseDirt = new GenericBaseBlock("sandCoarseDirt", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block sandDirt = new GenericBaseBlock("sandDirt", Material.rock).setCreativeTab(ModTabs.tabWorld);
	public static Block sapphireOre = new GenericBaseBlock("sapphireOre", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block schist = new GenericDropBlock("schist", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block schist_bricks = new GenericBaseBlock("schist_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block schistCobble = new GenericBaseBlock("schistCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block schistPolishedBlock = new GenericBaseBlock("schistPolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block shale = new GenericDropBlock("shale", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block shale_bricks = new GenericBaseBlock("shale_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block shalePolishedBlock = new GenericBaseBlock("shalePolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block shale_smooth = new GenericBaseBlock("shale_smooth", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block shaleCobble = new GenericBaseBlock("shaleCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block siltStone = new GenericBaseBlock("siltStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block siltStone_smooth = new GenericBaseBlock("siltStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block silverOre = new GenericBaseBlock("silverOre", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block stoneChalk = new GenericBaseBlock("stoneChalk", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stoneChalk_bricks = new GenericBaseBlock("stoneChalk_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stoneChalkPolishedBlock = new GenericBaseBlock("stoneChalkPolishedBlock", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stoneChalkCobble = new GenericBaseBlock("stoneChalkCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block slate = new GenericDropBlock("slate", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block slate_bricks = new GenericBaseBlock("slate_bricks", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block slateCobble = new GenericBaseBlock("slateCobble", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone1 = new GenericBaseBlock("stone1", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone2 = new GenericBaseBlock("stone2", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone3 = new GenericBaseBlock("stone3", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone4 = new GenericBaseBlock("stone4", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone5 = new GenericBaseBlock("stone5", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone6 = new GenericBaseBlock("stone6", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone7 = new GenericBaseBlock("stone7", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone8 = new GenericBaseBlock("stone8", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone9 = new GenericBaseBlock("stone9", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone10 = new GenericBaseBlock("stone10", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone11 = new GenericBaseBlock("stone11", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block stone12 = new GenericBaseBlock("stone12", Material.rock).setCreativeTab(ModTabs.tabNewRocks);
	public static Block thatch	= new GenericBaseBlock("thatch", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block topazOre = new GenericBaseBlock("topazOre", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block yellowStone = new GenericBaseBlock("yellowStone", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block yellowStone_smooth = new GenericBaseBlock("yellowStone_smooth", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);

//STORAGE BLOCKS	
	
	public static Block amethystBlock = new StorageBlock("amethystBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block blazeBlock = new StorageBlock("blazeBlock", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block boneBlock = new StorageSidedBlock("boneBlock", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block bonemealBlock = new StorageBlock("bonemealBlock", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block bronzeBlock = new StorageBlock("bronzeBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block dyeBlock_black = new StorageBlock("dyeBlock_black", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_blue = new StorageBlock("dyeBlock_blue", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_brown = new StorageBlock("dyeBlock_brown", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_cyan = new StorageBlock("dyeBlock_cyan", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_gray = new StorageBlock("dyeBlock_gray", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_green = new StorageBlock("dyeBlock_green", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_lightBlue = new StorageBlock("dyeBlock_lightBlue", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_lightGray = new StorageBlock("dyeBlock_lightGray", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_lime = new StorageBlock("dyeBlock_lime", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_magenta = new StorageBlock("dyeBlock_magenta", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_orange = new StorageBlock("dyeBlock_orange", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_pink = new StorageBlock("dyeBlock_pink", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_purple = new StorageBlock("dyeBlock_purple", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_red = new StorageBlock("dyeBlock_red", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_white = new StorageBlock("dyeBlock_white", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block dyeBlock_yellow = new StorageBlock("dyeBlock_yellow", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block enderPearlBlock = new StorageBlock("enderPearlBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block flintBlock = new StorageBlock("flintBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block gunpowderBlock = new StorageBlock("gunpowderBlock", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block netherWartBlock = new StorageBlock("netherWartBlock", Material.ground).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block rottenFleshBlock = new StorageBlock("rottenFleshBlock", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
    public static Block rubyBlock = new StorageBlock("rubyBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block sapphireBlock = new StorageBlock("sapphireBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block sugarBlock = new StorageBlock("sugarBlock", Material.cloth).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block silverBlock = new StorageBlock("silverBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);
	public static Block topazBlock = new StorageBlock("topazBlock", Material.rock).setCreativeTab(ModTabs.tabNewBlocks);

//TREE WOOD PLANKS BLOCKS

    public static Block redwood_planks = new GenericWoodBlock("redwood_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block maple_planks = new GenericWoodBlock("maple_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block palm_planks = new GenericWoodBlock("palm_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block willow_planks = new GenericWoodBlock("willow_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block pine_planks = new GenericWoodBlock("pine_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block fir_planks = new GenericWoodBlock("fir_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block chestnut_planks = new GenericWoodBlock("chestnut_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block sequoia_planks = new GenericWoodBlock("sequoia_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block elm_planks = new GenericWoodBlock("elm_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block hickory_planks = new GenericWoodBlock("hickory_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block cedar_planks = new GenericWoodBlock("cedar_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block sycamore_planks = new GenericWoodBlock("sycamore_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block cypress_planks = new GenericWoodBlock("cypress_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block eucalyptus_planks = new GenericWoodBlock("eucalyptus_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block mahogany_planks = new GenericWoodBlock("mahogany_planks").setCreativeTab(ModTabs.tabWorld);
    public static Block magnolia_planks = new GenericWoodBlock("magnolia_planks").setCreativeTab(ModTabs.tabWorld);

//TREES
    public static Block registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        return block;
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock > itemBlockClass)
    {
        GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().substring(5));
        return block;
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass, Object... constructorArgs)
    {
        GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().substring(5), constructorArgs);
        return block;
    }

//BIOMES BLOCKS

    public static void registerBlocks()
    {
        logs = registerBlock(new BlockBOPLog().setBlockName("logs"), ItemBlockLog.class);

        leaves = registerBlock(new BlockBOPLeaves().setBlockName("leaves"), ItemBlockLeaves.class);

        saplings = registerBlock(new BlockBOPSapling().setBlockName("saplings"), ItemBlockSapling.class);
    }

public static void init()
{
	//STANDARD BLOCKS

    registerBlocks();

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
	 RegisterHelper.registerBlock(bronzeOre);
	 RegisterHelper.registerBlock(brownStone);
	 RegisterHelper.registerBlock(brownStone_smooth);
	 RegisterHelper.registerBlock(cementBlock);
	 RegisterHelper.registerBlock(charcoalBlock);
	 RegisterHelper.registerBlock(chert);
	 RegisterHelper.registerBlock(chert_bricks);
	 RegisterHelper.registerBlock(chertPolishedBlock);
	 RegisterHelper.registerBlock(chertCobble); 
	 RegisterHelper.registerBlock(coarseDirt);
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
	 RegisterHelper.registerBlock(gabbro);
	 RegisterHelper.registerBlock(gabbro_bricks);
	 RegisterHelper.registerBlock(gabbroPolishedBlock);
	 RegisterHelper.registerBlock(gabbroCobble);
	 RegisterHelper.registerBlock(granite);
	 RegisterHelper.registerBlock(granite_bricks);
	 RegisterHelper.registerBlock(granite_smooth);
	 RegisterHelper.registerBlock(graniteCobble);
    RegisterHelper.registerBlock(greenStone);
    RegisterHelper.registerBlock(greenStone_smooth);
	 RegisterHelper.registerBlock(hardenedDirt);
	 RegisterHelper.registerBlock(hardenedSand);
	 RegisterHelper.registerBlock(hardenedSandstone);
	 RegisterHelper.registerBlock(hardenedSandstone_bricks);
	 RegisterHelper.registerBlock(hardenedSandstoneCobble);
	 RegisterHelper.registerBlock(hardenedSandstonePolishedBlock);
	 RegisterHelper.registerBlock(hardenedIce);
	 RegisterHelper.registerBlock(hayVariant);
    RegisterHelper.registerBlock(limestone);
    RegisterHelper.registerBlock(limestone_bricks);
    RegisterHelper.registerBlock(limestoneCobble);
    RegisterHelper.registerBlock(limestonePolishedBlock);
     RegisterHelper.registerBlock(magmaBlock);
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
	 RegisterHelper.registerBlock(pinkStone);
	 RegisterHelper.registerBlock(pinkStone_smooth);
	 RegisterHelper.registerBlock(prismarine_bricks);
	 RegisterHelper.registerBlock(quartzStone);
	 RegisterHelper.registerBlock(quartzStone_bricks);
	 RegisterHelper.registerBlock(quartzStonePolishedBlock);
	 RegisterHelper.registerBlock(quartzStoneCobble);
	 RegisterHelper.registerBlock(quickSand);
	 RegisterHelper.registerBlock(redNetherBrick);
	 RegisterHelper.registerBlock(redRock);
	 RegisterHelper.registerBlock(redRock_bricks);
	 RegisterHelper.registerBlock(redRockCobble);
	 RegisterHelper.registerBlock(redRockTile);
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
	 RegisterHelper.registerBlock(topazOre);
	 RegisterHelper.registerBlock(yellowStone);
	 RegisterHelper.registerBlock(yellowStone_smooth);
	
//STORAGE BLOCKS	
	
	RegisterHelper.registerBlock(amethystBlock);
	RegisterHelper.registerBlock(blazeBlock);
	RegisterHelper.registerBlock(boneBlock);
	RegisterHelper.registerBlock(bonemealBlock);
	RegisterHelper.registerBlock(bronzeBlock);
    RegisterHelper.registerBlock(dyeBlock_black);
    RegisterHelper.registerBlock(dyeBlock_blue);
    RegisterHelper.registerBlock(dyeBlock_brown);
    RegisterHelper.registerBlock(dyeBlock_cyan);
    RegisterHelper.registerBlock(dyeBlock_gray);
    RegisterHelper.registerBlock(dyeBlock_green);
    RegisterHelper.registerBlock(dyeBlock_lightBlue);
    RegisterHelper.registerBlock(dyeBlock_lightGray);
    RegisterHelper.registerBlock(dyeBlock_lime);
    RegisterHelper.registerBlock(dyeBlock_magenta);
    RegisterHelper.registerBlock(dyeBlock_orange);
    RegisterHelper.registerBlock(dyeBlock_pink);
    RegisterHelper.registerBlock(dyeBlock_purple);
    RegisterHelper.registerBlock(dyeBlock_red);
    RegisterHelper.registerBlock(dyeBlock_white);
    RegisterHelper.registerBlock(dyeBlock_yellow);
    RegisterHelper.registerBlock(enderPearlBlock);
	RegisterHelper.registerBlock(flintBlock);
	RegisterHelper.registerBlock(gunpowderBlock);
	RegisterHelper.registerBlock(netherWartBlock);
	RegisterHelper.registerBlock(rottenFleshBlock);
	RegisterHelper.registerBlock(rubyBlock);
	RegisterHelper.registerBlock(sapphireBlock);
    RegisterHelper.registerBlock(silverBlock);
    RegisterHelper.registerBlock(sugarBlock);
    RegisterHelper.registerBlock(topazBlock);

    RegisterHelper.registerBlock(redwood_planks);
    RegisterHelper.registerBlock(maple_planks);
    RegisterHelper.registerBlock(palm_planks);
    RegisterHelper.registerBlock(willow_planks);
    RegisterHelper.registerBlock(pine_planks);
    RegisterHelper.registerBlock(fir_planks);
    RegisterHelper.registerBlock(chestnut_planks);
    RegisterHelper.registerBlock(sequoia_planks);
    RegisterHelper.registerBlock(elm_planks);
    RegisterHelper.registerBlock(hickory_planks);
    RegisterHelper.registerBlock(cedar_planks);
    RegisterHelper.registerBlock(sycamore_planks);
    RegisterHelper.registerBlock(cypress_planks);
    RegisterHelper.registerBlock(eucalyptus_planks);
    RegisterHelper.registerBlock(mahogany_planks);
    RegisterHelper.registerBlock(magnolia_planks);
	}
}