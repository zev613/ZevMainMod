package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemWonderWomanCostume extends ItemArmor 
{
	public String textureName = "wonderWoman";

	 public ItemWonderWomanCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.wonderWomanHead || stack.getItem() == ModDCCostumes.wonderWomanChest || stack.getItem() == ModDCCostumes.wonderWomanBoots)
			{
				return Reference.MODID + ":textures/models/wonderWoman_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.wonderWomanPants)
			{
				return Reference.MODID + ":textures/models/wonderWoman_2.png";
			}
			else
			{
				return null;
			}	
		}
}
