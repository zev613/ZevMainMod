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
				'A', new ItemStack(Items.dye, 15));
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.blazeBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.blaze_powder);
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rottenFleshBlock),
				"AAA",
				"AAA",
				"AAA",
				'A', Items.rotten_flesh);
		
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

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.limeStone_smooth, 4),
				"AA",
				"AA",
				'A', ModBlocks.limeStone);

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

//SHAPELESS RECIPES		
		
	//STORAGE BLOCK SHAPELESS RECIPES
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.amethystBlock, 1), new ItemStack(ModItems.amethystIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.boneBlock, 1), new ItemStack(Items.bone, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bonemealBlock, 1), new ItemStack(Items.dye, 15, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blazeBlock, 1), new ItemStack(Items.blaze_powder, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rottenFleshBlock, 1), new ItemStack(Items.rotten_flesh, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.enderPearlBlock, 1), new ItemStack(Items.ender_pearl, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flintBlock, 1), new ItemStack(Items.flint, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gunpowderBlock, 1), new ItemStack(Items.gunpowder, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rubyBlock, 1), new ItemStack(ModItems.rubyIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sapphireBlock, 1), new ItemStack(ModItems.sapphireIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.sugarBlock, 1), new ItemStack(Items.sugar, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.silverBlock, 1), new ItemStack(ModItems.silverIngot, 9));

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.topazBlock, 1), new ItemStack(ModItems.topazIngot, 9));

//SMELTING RECIPES		

		GameRegistry.addSmelting(ModBlocks.rubyOre, 
				new ItemStack(ModItems.rubyIngot), 0.1F);

		GameRegistry.addSmelting(ModBlocks.topazOre, 
				new ItemStack(ModItems.topazIngot), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.sapphireOre, 
				new ItemStack(ModItems.sapphireIngot), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.silverOre, 
				new ItemStack(ModItems.silverIngot), 0.1F);
		
		GameRegistry.addSmelting(ModBlocks.amethystOre, 
				new ItemStack(ModItems.amethystIngot), 0.1F);	
	}
}