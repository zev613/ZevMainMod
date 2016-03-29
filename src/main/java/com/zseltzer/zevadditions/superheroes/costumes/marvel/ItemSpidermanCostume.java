package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSpidermanCostume extends ItemArmor 
{
	public String textureName = "spiderman";

	 public ItemSpidermanCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.spidermanHead || stack.getItem() == ModMarvelCostumes.spidermanChest || stack.getItem() == ModMarvelCostumes.spidermanBoots)
			{
				return Reference.MODID + ":textures/models/spiderman_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.spidermanPants)
			{
				return Reference.MODID + ":textures/models/spiderman_2.png";
			}
			else
			{
				return null;
			}	
		}
}
