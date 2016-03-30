package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBatgirlCostume extends ItemArmor 
{
	public String textureName = "batgirl";

	 public ItemBatgirlCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.batgirlHead || stack.getItem() == ModDCCostumes.batgirlChest || stack.getItem() == ModDCCostumes.batgirlBoots)
			{
				return Reference.MODID + ":textures/models/batgirl_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.batgirlPants)
			{
				return Reference.MODID + ":textures/models/batgirl_2.png";
			}
			else
			{
				return null;
			}	
		}
}
