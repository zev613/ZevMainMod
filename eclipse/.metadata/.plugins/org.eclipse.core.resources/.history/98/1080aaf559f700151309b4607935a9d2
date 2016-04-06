package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.items.ItemAmethystArmor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SuperheroTest 
{
		static ArmorMaterial SUPERHERO_ARMOR = EnumHelper.addArmorMaterial
			("SUPERHERO_ARMOR", 20, new int[]{3, 7, 5, 2}, 14);
		
		public static Item superheroHead = new ItemAmethystArmor(SUPERHERO_ARMOR, 0, "superheroHead");
		
		public static Item superheroChest = new ItemAmethystArmor(SUPERHERO_ARMOR, 1, "superheroChest");
		
		public static Item superheroPants = new ItemAmethystArmor(SUPERHERO_ARMOR, 2, "superheroPants");
		
		public static Item superheroBoots = new ItemAmethystArmor(SUPERHERO_ARMOR, 3, "superheroBoots");
			
	public void init()
	{
		RegisterHelper.registerItem(superheroHead);
		RegisterHelper.registerItem(superheroChest);
		RegisterHelper.registerItem(superheroPants);
		RegisterHelper.registerItem(superheroBoots);
	}
}
