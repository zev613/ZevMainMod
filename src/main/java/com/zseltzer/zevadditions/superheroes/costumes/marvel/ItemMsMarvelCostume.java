package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMsMarvelCostume extends ItemArmor 
{
	public String textureName = "msMarvel";

	 public ItemMsMarvelCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.msMarvelHead || stack.getItem() == ModMarvelCostumes.msMarvelChest || stack.getItem() == ModMarvelCostumes.msMarvelBoots)
			{
				return Reference.MODID + ":textures/models/msMarvel_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.msMarvelPants)
			{
				return Reference.MODID + ":textures/models/msMarvel_2.png";
			}
			else
			{
				return null;
			}	
		}
}
