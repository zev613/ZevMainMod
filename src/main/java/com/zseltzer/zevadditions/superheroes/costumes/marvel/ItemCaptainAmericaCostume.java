package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCaptainAmericaCostume extends ItemArmor 
{
	public String textureName = "captainAmerica";

	 public ItemCaptainAmericaCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.captainAmericaHead || stack.getItem() == ModMarvelCostumes.captainAmericaChest || stack.getItem() == ModMarvelCostumes.captainAmericaBoots)
			{
				return Reference.MODID + ":textures/models/captainAmerica_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.captainAmericaPants)
			{
				return Reference.MODID + ":textures/models/captainAmerica_2.png";
			}
			else
			{
				return null;
			}	
		}
}
