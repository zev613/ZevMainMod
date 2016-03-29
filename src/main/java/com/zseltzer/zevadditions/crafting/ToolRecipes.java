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
		new Object[] {
			" A ", 
			" A ", 
			" B ", 
			'A', ModItems.amethystIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystPickaxe), 
		new Object[] {
			"AAA", 
			" B ", 
			" B ", 
			'A', ModItems.amethystIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystShovel), 
		new Object[] {
			" A ", 
			" B ", 
			" B ", 
			'A', ModItems.amethystIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystAxe), 
		new Object[] {
			"AA ", 
			"AB ", 
			" B ", 
			'A', ModItems.amethystIngot});
			
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystHoe), 
		new Object[] {
			"AA ", 
			" B ", 
			" B ", 
			'A', ModItems.amethystIngot, 'B', Items.stick});

//RUBY TOOL RECIPES
	
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubySword), 
		new Object[] {
			" A ", 
			" A ", 
			" B ", 
			'A', ModItems.rubyIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyPickaxe), 
		new Object[] {
			"AAA", 
			" B ", 
			" B ", 
			'A', ModItems.rubyIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyShovel), 
		new Object[] {
			" A ", 
			" B ", 
			" B ", 
			'A', ModItems.rubyIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyAxe), 
		new Object[] {
			"AA ", 
			"AB ", 
			" B ", 
			'A', ModItems.rubyIngot});
				
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyHoe), 
		new Object[] {
			"AA ", 
			" B ", 
			" B ", 
			'A', ModItems.rubyIngot, 'B', Items.stick});

//EMERALD TOOL RECIPES	

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldSword), 
		new Object[] {
			" A ", 
			" A ", 
			" B ", 
			'A', Items.emerald, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldPickaxe), 
		new Object[] {
			"AAA", 
			" B ", 
			" B ", 
			'A', Items.emerald, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldShovel), 
		new Object[] {
			" A ", 
			" B ", 
			" B ", 
			'A', Items.emerald, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldAxe), 
		new Object[] {
			"AA ", 
			"AB ", 
			" B ", 
			'A', Items.emerald, 'B', Items.stick});
				
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldHoe), 
		new Object[] {
			"AA ", 
			" B ", 
			" B ", 
			'A', Items.emerald, 'B', Items.stick});

//SAPPHIRE TOOL RECIPES
	
GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireSword), 
		new Object[] {
			" A ", 
			" A ", 
			" B ", 
			'A', ModItems.sapphireIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphirePickaxe), 
		new Object[] {
			"AAA", 
			" B ", 
			" B ", 
			'A', ModItems.sapphireIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireShovel), 
		new Object[] {
			" A ", 
			" B ", 
			" B ", 
			'A', ModItems.sapphireIngot, 'B', Items.stick});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireAxe), 
		new Object[] {
			"AA ", 
			"AB ", 
			" B ", 
			'A', ModItems.sapphireIngot, 'B', Items.stick});
				
	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireHoe), 
		new Object[] {
			"AA ", 
			" B ", 
			" B ", 
			'A', ModItems.sapphireIngot, 'B', Items.stick});
	}
}
