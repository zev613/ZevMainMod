package com.zseltzer.zevadditions.items;

import java.lang.ref.Reference;

import com.zseltzer.zevadditions.commands.CommandChangeSuit;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperheroTestArmor extends ItemArmor
{
	//public static String suitName = "superSuitDefault";
    //public static String customTexture;
	
	 public SuperheroTestArmor( ArmorMaterial material, int ArmorType, String name) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(name);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabNewItems);
		}

@Override	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModArmory.superheroHead || stack.getItem() == ModArmory.superheroChest || stack.getItem() == ModArmory.superheroBoots)
			{
				////System.out.println("The current suit texture is: " + CommandChangeSuit.suitName + ".");
				return Reference.MODID + ":textures/models/superheroSuits/" + CommandChangeSuit.suitName + "_layer_1.png";
			}
			else if (stack.getItem() == ModArmory.superheroPants)
			{
				//System..out.println("The current suit texture is: " + CommandChangeSuit.suitName + ".");
				return Reference.MODID + ":textures/models/superheroSuits/" + CommandChangeSuit.suitName + "_layer_2.png";
			}
			else
			{
				return null;
			}	
		}
}
