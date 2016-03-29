package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ArmorRecipes 
{

	public static void init()
	{	

		
//AMETHYST ARMOR RECIPES		
		
		
GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystHelmet), 
	new Object[] {
			"AAA", 
			"A A",  
			'A', ModItems.amethystIngot});

GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystChestplate), 
		new Object[] {
			"A A", 
			"AAA",
			"AAA",
			'A', ModItems.amethystIngot});

GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystLeggings), 
		new Object[] {
			"AAA", 
			"A A", 
			"A A",
			'A', ModItems.amethystIngot});

GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystBoots), 
		new Object[] {
			"A A", 
			"A A",  
			'A', ModItems.amethystIngot});


//RUBY ARMOR RECIPES


	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyHelmet), 
		new Object[] {
			"AAA", 
			"A A",  
			'A', ModItems.rubyIngot});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyChestplate), 
		new Object[] {
			"A A", 
			"AAA",
			"AAA",
			'A', ModItems.rubyIngot});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyLeggings), 
		new Object[] {
			"AAA", 
			"A A", 
			"A A",
			'A', ModItems.rubyIngot});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyBoots), 
		new Object[] {
			"A A", 
			"A A",  
			'A', ModItems.rubyIngot});


//EMERALD ARMOR RECIPES


	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldHelmet), 
		new Object[] {
			"AAA", 
			"A A",  
			'A', Items.emerald});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldChestplate), 
		new Object[] {
			"A A", 
			"AAA",
			"AAA",
			'A', Items.emerald});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldLeggings), 
		new Object[] {
			"AAA", 
			"A A", 
			"A A",
			'A', Items.emerald});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldBoots), 
		new Object[] {
			"A A", 
			"A A",  
			'A', Items.emerald});


//SAPPHIRE ARMOR RECIPES


	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireHelmet), 
		new Object[] {
			"AAA", 
			"A A",  
			'A', ModItems.sapphireIngot});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireChestplate), 
		new Object[] {
			"A A", 
			"AAA",
			"AAA",
			'A', ModItems.sapphireIngot});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireLeggings), 
		new Object[] {
			"AAA", 
			"A A", 
			"A A",
			'A', ModItems.sapphireIngot});

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireBoots), 
		new Object[] {
			"A A", 
			"A A",  
			'A', ModItems.sapphireIngot});


	}
	
}
