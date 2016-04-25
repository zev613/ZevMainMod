package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEmeraldArmor extends ItemArmor 
{
	public String textureName = "emerald";

	 public ItemEmeraldArmor( ArmorMaterial material, int ArmorType, String name) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(name);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabNewItems);
		}
 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModArmory.emeraldHelmet || stack.getItem() == ModArmory.emeraldChestplate || stack.getItem() == ModArmory.emeraldBoots)
			{
				return Reference.MODID + ":textures/models/armor/emerald_layer_1.png";
			}
			else if (stack.getItem() == ModArmory.emeraldLeggings)
			{
				return Reference.MODID + ":textures/models/armor/emerald_layer_2.png";
			}
			else
			{
				return null;
			}	
		}
}