package com.zseltzer.zevadditions.util;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.items.SuperheroTestArmor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SetSuitTexture
{
	
	public static String superheroSuitName;
	
	public static void init(String suitName)
	{
		
		superheroSuitName = suitName;
	
	}
	/*
	public static String getArmorTexture(Entity entity, ItemStack stack, int slot, String type)
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
    */
	
	/*
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
	if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModArmory.superheroPants))
	    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
	}
	*/
}

