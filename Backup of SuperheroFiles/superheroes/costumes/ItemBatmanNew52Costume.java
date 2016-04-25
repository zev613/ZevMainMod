package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBatmanNew52Costume extends ItemArmor 
{
	public String textureName = "batmanNew52";

	 public ItemBatmanNew52Costume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.batmanNew52Head || stack.getItem() == ModDCCostumes.batmanNew52Chest || stack.getItem() == ModDCCostumes.batmanNew52Boots)
			{
				return Reference.MODID + ":textures/models/batmanNew52_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.batmanNew52Pants)
			{
				return Reference.MODID + ":textures/models/batmanNew52_2.png";
			}
			else
			{
				return null;
			}	
		}

}
