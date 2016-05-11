package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModArmory;
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
	}
}
