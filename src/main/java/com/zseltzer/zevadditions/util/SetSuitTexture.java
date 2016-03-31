package com.zseltzer.zevadditions.util;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;

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
		if (stack.getItem() == ModArmory.superheroHead || stack.getItem() == ModArmory.superheroChest || stack.getItem() == ModArmory.superheroBoots)
		{
			return Reference.MODID + ":textures/models/superheroSuits/" + suitName + "_layer_1.png";
		}
		else if (stack.getItem() == ModArmory.superheroPants)
		{
			return Reference.MODID + ":textures/models/superheroSuits/" + suitName + "_layer_2.png";
		}
		else
		{
			return null;
		}
	}
}
