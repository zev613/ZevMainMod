package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAquamanCostume extends ItemArmor 
{
	public String textureName = "aquaman";

	 public ItemAquamanCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
/*		
	 @Override
	 public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	 {
	     return Reference.MODID + ":textures/models/armor" + this.textureName + "_layer_" + (this.armorType == 2 ? "2" : "1") + ".png";
	 }
*/
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.aquamanHead || stack.getItem() == ModDCCostumes.aquamanChest || stack.getItem() == ModDCCostumes.aquamanBoots)
			{
				return Reference.MODID + ":textures/models/aquaman_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.aquamanPants)
			{
				return Reference.MODID + ":textures/models/aquaman_2.png";
			}
			else
			{
				return null;
			}	
		}
}
