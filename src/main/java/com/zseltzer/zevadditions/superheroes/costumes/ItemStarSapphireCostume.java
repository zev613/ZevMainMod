package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemStarSapphireCostume extends ItemArmor 
{
	public String textureName = "starSapphire";

	 public ItemStarSapphireCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.starSapphireHead || stack.getItem() == ModDCCostumes.starSapphireChest || stack.getItem() == ModDCCostumes.starSapphirePants)
			{
				return Reference.MODID + ":textures/models/starSapphire_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.starSapphireBoots)
			{
				return Reference.MODID + ":textures/models/starSapphire_2.png";
			}
			else
			{
				return null;
			}	
		}
}
