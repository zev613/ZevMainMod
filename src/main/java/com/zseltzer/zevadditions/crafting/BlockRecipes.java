package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModItems;
import com.zseltzer.zevadditions.init.ModArmory;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockRecipes 
{

	public static void init()
	{	
		
//SHAPED RECIPES

        TreeRecipes.init();

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.amethystBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.amethystIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.boneBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.bone);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bonemealBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Items.dye, 1, 15));
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blazeBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.blaze_powder);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bronzeBlock),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.bronzeIngot);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_black),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.blackDye);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_black),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 0));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_blue),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.blueDye);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_brown),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 3));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_cyan),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 6));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_lightBlue),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 12));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_lightGray),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 7));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_lime),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 10));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_gray),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 8));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_green),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 2));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_magenta),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 13));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_orange),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 14));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_pink),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 9));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_purple),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 5));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_red),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 1));

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_white),
                "AAA",
                "AAA",
                "AAA",
                'A', ModItems.whiteDye);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.dyeBlock_yellow),
                "AAA",
                "AAA",
                "AAA",
                'A', new ItemStack(Items.dye, 11));

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.enderPearlBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.ender_pearl);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.flintBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.flint);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.gunpowderBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.gunpowder);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.netherWartBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.nether_wart);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redNetherBrick, 4),
				"AB",
				"BA",
				'A', Items.netherbrick, 'B', Items.nether_wart);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.redNetherBrick, 4),
                "BA",
                "AB",
                'A', Items.netherbrick, 'B', Items.nether_wart);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rottenFleshBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.rotten_flesh);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rubyBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.rubyIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sapphireBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.sapphireIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.sugarBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.sugar);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.silverBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.silverIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.topazBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', ModItems.topazIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.aquaStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.aquaStone);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.basalt_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.basalt);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.brownStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.brownStone);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.greenStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.greenStone);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pinkStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.pinkStone);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.shale_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.shale);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.siltStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.siltStone);

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.yellowStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.yellowStone);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.adobeBlock, 4),
                "AA",
                "AA",
                'A', ModItems.ballOfAdobe);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.adobe_bricks, 4),
                "AA",
                "AA",
                'A', ModItems.adobeBrick);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.adobeTile, 4),
                "AA",
                "AA",
                'A', ModBlocks.adobeBlock);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.bambooThatchBlock, 4),
                "AAA",
                "AAA",
                "AAA",
                'A', Items.stick);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.endStoneBricks, 4),
                "AA",
                "AA",
                'A', Blocks.end_stone);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedIce, 4),
                "AA",
                "AA",
                'A', Blocks.packed_ice);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedSand, 4),
                "AA",
                "AA",
                'A', Blocks.sand);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedSandstonePolishedBlock, 4),
                "AA",
                "AA",
                'A', ModBlocks.hardenedSandstone);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedSandstone_bricks, 4),
                "BA",
                "AB",
                'A', ModBlocks.hardenedSandstone, 'B', ModBlocks.hardenedSand);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedSandstone_bricks, 4),
                "AB",
                "BA",
                'A', ModBlocks.hardenedSandstone, 'B', ModBlocks.hardenedSand);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedSand, 4),
                "AA",
                "AA",
                'A', Blocks.sand);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hardenedDirt, 4),
                "AA",
                "AA",
                'A', Blocks.dirt);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.hayVariant, 4),
                "AA",
                "AA",
                'A', Blocks.hay_block);

//SHAPELESS RECIPES
		
	//STORAGE BLOCK SHAPELESS RECIPES
		/*
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.amethystBlock, 1), new ItemStack(ModItems.amethystIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.boneBlock, 1), new ItemStack(Items.bone, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bonemealBlock, 1), new ItemStack(Items.dye, 9, 15));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blazeBlock, 1), new ItemStack(Items.blaze_powder, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bronzeBlock, 1), new ItemStack(ModItems.bronzeIngot, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_black, 1), new ItemStack(ModItems.blackDye, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_black, 1), new ItemStack(Items.dye, 9, 0));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_blue, 1), new ItemStack(ModItems.blueDye, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_brown, 1), new ItemStack(Items.dye, 9, 3));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_cyan, 1), new ItemStack(Items.dye, 9, 6));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_gray, 1), new ItemStack(Items.dye, 9, 8));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_green, 1), new ItemStack(Items.dye, 9, 2));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_lightBlue, 1), new ItemStack(Items.dye, 9, 12));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_lightGray, 1), new ItemStack(Items.dye, 9, 7));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_lime, 1), new ItemStack(Items.dye, 9, 10));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_magenta, 1), new ItemStack(Items.dye, 9, 13));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_orange, 1), new ItemStack(Items.dye, 9, 14));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_pink, 1), new ItemStack(Items.dye, 9, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_purple, 1), new ItemStack(Items.dye, 9, 5));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_red, 1), new ItemStack(Items.dye, 9, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_white, 1), new ItemStack(ModItems.whiteDye, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dyeBlock_yellow, 1), new ItemStack(Items.dye, 9, 11));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.enderPearlBlock, 1), new ItemStack(Items.ender_pearl, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flintBlock, 1), new ItemStack(Items.flint, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gunpowderBlock, 1), new ItemStack(Items.gunpowder, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.netherWartBlock, 1), new ItemStack(Items.nether_wart, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rottenFleshBlock, 1), new ItemStack(Items.rotten_flesh, 9));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rubyBlock, 1), new ItemStack(ModItems.rubyIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sapphireBlock, 1), new ItemStack(ModItems.sapphireIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sugarBlock, 1), new ItemStack(Items.sugar, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.silverBlock, 1), new ItemStack(ModItems.silverIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.topazBlock, 1), new ItemStack(ModItems.topazIngot, 9));
*/

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amethystIngot, 9), new ItemStack(ModBlocks.amethystBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 9), new ItemStack(ModBlocks.boneBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 15), new ItemStack(ModBlocks.bonemealBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_powder, 9), new ItemStack(ModBlocks.blazeBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronzeIngot, 9), new ItemStack(ModBlocks.bronzeBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blackDye, 9), new ItemStack(ModBlocks.dyeBlock_black, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 0), new ItemStack(ModBlocks.dyeBlock_black, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blueDye, 9), new ItemStack(ModBlocks.dyeBlock_blue, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 3), new ItemStack(ModBlocks.dyeBlock_brown, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 6), new ItemStack(ModBlocks.dyeBlock_cyan, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 8), new ItemStack(ModBlocks.dyeBlock_gray, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 2), new ItemStack(ModBlocks.dyeBlock_green, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 12), new ItemStack(ModBlocks.dyeBlock_lightBlue, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 7), new ItemStack(ModBlocks.dyeBlock_lightGray, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 10), new ItemStack(ModBlocks.dyeBlock_lime, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 13), new ItemStack(ModBlocks.dyeBlock_magenta, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 14), new ItemStack(ModBlocks.dyeBlock_orange, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 9), new ItemStack(ModBlocks.dyeBlock_pink, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 5), new ItemStack(ModBlocks.dyeBlock_purple, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 1), new ItemStack(ModBlocks.dyeBlock_red, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.whiteDye, 9), new ItemStack(ModBlocks.dyeBlock_white, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 9, 11), new ItemStack(ModBlocks.dyeBlock_yellow, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), new ItemStack(ModBlocks.enderPearlBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 9), new ItemStack(ModBlocks.flintBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 9), new ItemStack(ModBlocks.gunpowderBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.nether_wart, 9), new ItemStack(ModBlocks.netherWartBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.rotten_flesh, 9), new ItemStack(ModBlocks.rottenFleshBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rubyIngot, 9), new ItemStack(ModBlocks.rubyBlock, 1));

        GameRegistry.addShapelessRecipe( new ItemStack(ModItems.sapphireIngot, 9), new ItemStack(ModBlocks.sapphireBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(Items.sugar, 9), new ItemStack(ModBlocks.sugarBlock, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverIngot, 9), new ItemStack(ModBlocks.silverBlock, 1));



//SMELTING RECIPES		

		GameRegistry.addSmelting(ModBlocks.rubyOre, 
				new ItemStack(ModItems.rubyIngot), 0.1F);

		GameRegistry.addSmelting(ModBlocks.topazOre, 
				new ItemStack(ModItems.topazIngot), 0.1F);

        GameRegistry.addSmelting(ModBlocks.bronzeOre,
                new ItemStack(ModItems.bronzeIngot), 0.1F);

		GameRegistry.addSmelting(ModBlocks.sapphireOre, 
				new ItemStack(ModItems.sapphireIngot), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.silverOre, 
				new ItemStack(ModItems.silverIngot), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.amethystOre, 
				new ItemStack(ModItems.amethystIngot), 0.1F);


        GameRegistry.addSmelting(Blocks.clay,
                new ItemStack(ModBlocks.cementBlock), 0.0F);

        GameRegistry.addSmelting(Blocks.dirt,
                new ItemStack(ModBlocks.driedDirt), 0.0F);

        GameRegistry.addSmelting(Blocks.sandstone,
                new ItemStack(ModBlocks.hardenedSandstone), 0.0F);
	}
}