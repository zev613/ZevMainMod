package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBatman1960Costume extends ItemArmor 
{
	public String textureName = "batman1960";

	 public ItemBatman1960Costume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.batman1960Head || stack.getItem() == ModDCCostumes.batman1960Chest || stack.getItem() == ModDCCostumes.batman1960Boots)
			{
				return Reference.MODID + ":textures/models/batman1960_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.batman1960Pants)
			{
				return Reference.MODID + ":textures/models/batman1960_2.png";
			}
			else
			{
				return null;
			}	
		}
}
