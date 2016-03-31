package com.zseltzer.zevadditions.util;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.SuperheroTest;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class SetSuitTexture 
{
	private static String suitName;
	
	
	public static void getSuitTexture(String superheroSuitName)
	{
		suitName = superheroSuitName;
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == SuperheroTest.superheroHead || stack.getItem() == SuperheroTest.superheroChest || stack.getItem() == SuperheroTest.superheroBoots)
		{
			return Reference.MODID + ":textures/models/superheroSuits/" + suitName + "_layer_1.png";
		}
		else if (stack.getItem() == SuperheroTest.superheroPants)
		{
			return Reference.MODID + ":textures/models/superheroSuits/" + suitName + "_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}
