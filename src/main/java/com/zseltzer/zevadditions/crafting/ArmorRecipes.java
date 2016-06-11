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
		"AAA",
		"A A",
		'A', ModItems.amethystIngot);

GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystChestplate),
		"A A",
		"AAA",
		"AAA",
		'A', ModItems.amethystIngot);

GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystLeggings),
		"AAA",
		"A A",
		"A A",
		'A', ModItems.amethystIngot);

GameRegistry.addShapedRecipe(new ItemStack(ModArmory.amethystBoots),
		"A A",
		"A A",
		'A', ModItems.amethystIngot);

//RUBY ARMOR RECIPES

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyHelmet),
			"AAA",
			"A A",
			'A', ModItems.rubyIngot);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyChestplate),
			"A A",
			"AAA",
			"AAA",
			'A', ModItems.rubyIngot);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyLeggings),
			"AAA",
			"A A",
			"A A",
			'A', ModItems.rubyIngot);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.rubyBoots),
			"A A",
			"A A",
			'A', ModItems.rubyIngot);

//EMERALD ARMOR RECIPES

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldHelmet),
			"AAA",
			"A A",
			'A', Items.emerald);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldChestplate),
			"A A",
			"AAA",
			"AAA",
			'A', Items.emerald);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldLeggings),
			"AAA",
			"A A",
			"A A",
			'A', Items.emerald);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.emeraldBoots),
			"A A",
			"A A",
			'A', Items.emerald);

//SAPPHIRE ARMOR RECIPES

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireHelmet),
			"AAA",
			"A A",
			'A', ModItems.sapphireIngot);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireChestplate),
			"A A",
			"AAA",
			"AAA",
			'A', ModItems.sapphireIngot);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireLeggings),
			"AAA",
			"A A",
			"A A",
			'A', ModItems.sapphireIngot);

	GameRegistry.addShapedRecipe(new ItemStack(ModArmory.sapphireBoots),
			"A A",
			"A A",
			'A', ModItems.sapphireIngot);

		//BRONZE ARMOR RECIPES

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeHelmet),
				"AAA",
				"A A",
				'A', ModItems.bronzeIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeChestplate),
				"A A",
				"AAA",
				"AAA",
				'A', ModItems.bronzeIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeLeggings),
				"AAA",
				"A A",
				"A A",
				'A', ModItems.bronzeIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.bronzeBoots),
				"A A",
				"A A",
				'A', ModItems.bronzeIngot);

		//SILVER ARMOR RECIPES

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverHelmet),
				"AAA",
				"A A",
				'A', ModItems.silverIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverChestplate),
				"A A",
				"AAA",
				"AAA",
				'A', ModItems.silverIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverLeggings),
				"AAA",
				"A A",
				"A A",
				'A', ModItems.silverIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ModArmory.silverBoots),
				"A A",
				"A A",
				'A', ModItems.silverIngot);

	}
}
