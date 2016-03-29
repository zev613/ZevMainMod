package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemGreenArrowCostume extends ItemArmor 
{
	public String textureName = "greenArrow";

	 public ItemGreenArrowCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.greenArrowHead || stack.getItem() == ModDCCostumes.greenArrowChest || stack.getItem() == ModDCCostumes.greenArrowBoots)
			{
				return Reference.MODID + ":textures/models/greenArrow_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.greenArrowPants)
			{
				return Reference.MODID + ":textures/models/greenArrow_2.png";
			}
			else
			{
				return null;
			}	
		}
}
