package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ToolRecipes 
{

	public static void init()
	{	

//AMETHYST TOOL RECIPES		

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystSword),
			" A ",
			" A ",
			" B ",
			'A', ModItems.amethystIngot, 'B', Items.stick);

	GameRegistry.addShapelessRecipe(new ItemStack(ModArmory.amethystPoisonedSword, 1), new ItemStack(ModArmory.amethystSword), (Items.fermented_spider_eye));

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystPickaxe),
			"AAA",
			" B ",
			" B ",
			'A', ModItems.amethystIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystShovel),
			" A ",
			" B ",
			" B ",
			'A', ModItems.amethystIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystAxe),
			"AA ",
			"AB ",
			" B ",
			'A', ModItems.amethystIngot);
			
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystHoe),
			"AA ",
			" B ",
			" B ",
			'A', ModItems.amethystIngot, 'B', Items.stick);

//RUBY TOOL RECIPES
	
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubySword),
			" A ",
			" A ",
			" B ",
			'A', ModItems.rubyIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyPickaxe),
			"AAA",
			" B ",
			" B ",
			'A', ModItems.rubyIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyShovel),
			" A ",
			" B ",
			" B ",
			'A', ModItems.rubyIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyAxe),
			"AA ",
			"AB ",
			" B ",
			'A', ModItems.rubyIngot);
				
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyHoe),
			"AA ",
			" B ",
			" B ",
			'A', ModItems.rubyIngot, 'B', Items.stick);

//EMERALD TOOL RECIPES	

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldSword),
			" A ",
			" A ",
			" B ",
			'A', Items.emerald, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldPickaxe),
			"AAA",
			" B ",
			" B ",
			'A', Items.emerald, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldShovel),
			" A ",
			" B ",
			" B ",
			'A', Items.emerald, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldAxe),
			"AA ",
			"AB ",
			" B ",
			'A', Items.emerald, 'B', Items.stick);
				
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldHoe),
			"AA ",
			" B ",
			" B ",
			'A', Items.emerald, 'B', Items.stick);

//SAPPHIRE TOOL RECIPES
	
GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireSword),
		" A ",
		" A ",
		" B ",
		'A', ModItems.sapphireIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphirePickaxe),
			"AAA",
			" B ",
			" B ",
			'A', ModItems.sapphireIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireShovel),
			" A ",
			" B ",
			" B ",
			'A', ModItems.sapphireIngot, 'B', Items.stick);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireAxe),
			"AA ",
			"AB ",
			" B ",
			'A', ModItems.sapphireIngot, 'B', Items.stick);
				
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireHoe),
			"AA ",
			" B ",
			" B ",
			'A', ModItems.sapphireIngot, 'B', Items.stick);

//BRONZE TOOL RECIPES

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeSword),
            " A ",
            " A ",
            " B ",
            'A', ModItems.bronzeIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzePickaxe),
            "AAA",
            " B ",
            " B ",
            'A', ModItems.bronzeIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeShovel),
            " A ",
            " B ",
            " B ",
            'A', ModItems.bronzeIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeAxe),
            "AA ",
            "AB ",
            " B ",
            'A', ModItems.bronzeIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeHoe),
            "AA ",
            " B ",
            " B ",
            'A', ModItems.bronzeIngot, 'B', Items.stick);

//SILVER TOOL RECIPES

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverSword),
            " A ",
            " A ",
            " B ",
            'A', ModItems.silverIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverPickaxe),
            "AAA",
            " B ",
            " B ",
            'A', ModItems.silverIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverShovel),
            " A ",
            " B ",
            " B ",
            'A', ModItems.silverIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverAxe),
            "AA ",
            "AB ",
            " B ",
            'A', ModItems.silverIngot, 'B', Items.stick);

    GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverHoe),
            "AA ",
            " B ",
            " B ",
            'A', ModItems.silverIngot, 'B', Items.stick);
	}
}