package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemFlashCostume extends ItemArmor 
{
	public String textureName = "flash";

	 public ItemFlashCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.flashHead || stack.getItem() == ModDCCostumes.flashChest || stack.getItem() == ModDCCostumes.flashBoots)
			{
				return Reference.MODID + ":textures/models/flash_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.flashPants)
			{
				return Reference.MODID + ":textures/models/flash_2.png";
			}
			else
			{
				return null;
			}	
		}
}
