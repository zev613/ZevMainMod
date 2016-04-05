package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCaptainBritainCostume extends ItemArmor 
{
	public String textureName = "captainBritain";

	 public ItemCaptainBritainCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.captainBritainHead || stack.getItem() == ModMarvelCostumes.captainBritainChest || stack.getItem() == ModMarvelCostumes.captainBritainBoots)
			{
				return Reference.MODID + ":textures/models/captainBritain_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.captainBritainPants)
			{
				return Reference.MODID + ":textures/models/captainBritain_2.png";
			}
			else
			{
				return null;
			}	
		}
}
