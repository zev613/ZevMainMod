package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperheroTestArmor extends ItemArmor
{

	public static String suitName = "superSuitDefault";

	 public SuperheroTestArmor( ArmorMaterial material, int ArmorType, String name) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(name);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabNewItems);
		}
	 
	 public static void suitName(String superheroSuitName)
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
