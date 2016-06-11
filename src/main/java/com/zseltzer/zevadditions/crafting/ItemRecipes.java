package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemRecipes 
{

	public static void init()
	{	

	GameRegistry.addShapedRecipe(new ItemStack(Items.saddle),
		"A A",
		"A A",
		"BCB",
		'A', Items.leather, 'B', Items.iron_ingot, 'C', Blocks.iron_block);

	GameRegistry.addShapedRecipe(new ItemStack(Items.name_tag),
		"BB ",
		" A ",
		"  A",
		'A', Items.paper, 'B', Items.string);



    //GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 1), (ModItems.blueDye), new ItemStack(Items.dye, 2, 5));
	}
}