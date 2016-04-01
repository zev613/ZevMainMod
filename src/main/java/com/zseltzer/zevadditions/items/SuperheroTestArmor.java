package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.commands.CommandChangeSuit;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;
import com.zseltzer.zevadditions.util.SetSuitTexture;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SuperheroTestArmor extends ItemArmor
{
/*
int par3, int par4, String type) {
super(par1, par2EnumArmorMaterial, par3, par4);
this.setCreativeTab(CreativeTabs.tabCombat);
this.setArmorType(type.toLowerCase(), par4);
}

private String texturePath;

private void setArmorType(String type, int par4){
switch (par4){
case 0:
this.setUnlocalizedName(type + "Helmet");
this.texturePath += type +"_1.png";
this.iconPath += type + "Helmet";
break;
case 1:
this.setUnlocalizedName(type + "Chestplate");
this.texturePath += type +"_1.png";
this.iconPath += type + "Chestplate";
break;
case 2:
this.setUnlocalizedName(type + "Leggings");
this.texturePath += type +"_2.png";
this.iconPath += type + "Leggings";
break;
case 3:
this.setUnlocalizedName(type + "Boots");
this.texturePath += type +"_1.png";
this.iconPath += type + "Boots";
break;
}
 */
	//public static String suitName = "superSuitDefault";
	
    //public static String customTexture;
	
	 public SuperheroTestArmor( ArmorMaterial material, int ArmorType, String name) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(name);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabNewItems);
		}

@Override	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModArmory.superheroHead || stack.getItem() == ModArmory.superheroChest || stack.getItem() == ModArmory.superheroBoots)
			{
				System.out.println("The current suit texture is: " + CommandChangeSuit.suitName + ".");
				return Reference.MODID + ":textures/models/superheroSuits/" + CommandChangeSuit.suitName + "_layer_1.png";
			}
			else if (stack.getItem() == ModArmory.superheroPants)
			{
				System.out.println("The current suit texture is: " + CommandChangeSuit.suitName + ".");
				return Reference.MODID + ":textures/models/superheroSuits/" + CommandChangeSuit.suitName + "_layer_2.png";
			}
			else
			{
				return null;
			}	
		}

}
