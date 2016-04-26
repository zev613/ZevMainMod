package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.items.ItemAmethystArmor;
import com.zseltzer.zevadditions.items.ItemEmeraldArmor;
import com.zseltzer.zevadditions.items.ItemRubyArmor;
import com.zseltzer.zevadditions.items.ItemSapphireArmor;
import com.zseltzer.zevadditions.items.ModItemAxe;
import com.zseltzer.zevadditions.items.ModItemEnchantedSword;
import com.zseltzer.zevadditions.items.ModItemHoe;
import com.zseltzer.zevadditions.items.ModItemPickaxe;
import com.zseltzer.zevadditions.items.ModItemShovel;
import com.zseltzer.zevadditions.items.ModItemSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory 
{
	//Amethyst Material
	
	static Item.ToolMaterial AMETHYST = EnumHelper.addToolMaterial
		("AMETHYST", 3, 512, 2.0F, 2.0F, 14);
	
	static ArmorMaterial AMETHYST_ARMOR = EnumHelper.addArmorMaterial
		("AMETHYST_ARMOR", 20, new int[]{3, 7, 5, 2}, 14);
	
//Ruby Material	
	
	static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial
			("RUBY", 3, 512, 2.0F, 2.0F, 14);
		
		static ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial
			("RUBY_ARMOR", 20, new int[]{3, 7, 5, 2}, 14);
	
//Emerald Material
		
	static Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial
				("EMERALD", 3, 512, 2.0F, 2.0F, 14);
			
		static ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial
				("EMERALD_ARMOR", 20, new int[]{3, 7, 5, 2}, 14);

//Saphire Material
		
		static Item.ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial
				("SAPPHIRE", 3, 512, 2.0F, 2.0F, 14);
			
		static ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial
				("SAPPHIRE_ARMOR", 20, new int[]{3, 7, 5, 2}, 14);	
			
		//TOOL SETS		
				
//AMETHYST TOOLS
			
	public static Item amethystSword = new ModItemSword(AMETHYST).setUnlocalizedName("amethystSword");
	
	public static Item amethystEnchantedSword = new ModItemEnchantedSword(AMETHYST).setUnlocalizedName("amethystEnchantedSword");
	
	public static Item amethystPickaxe = new ModItemPickaxe(AMETHYST).setUnlocalizedName("amethystPickaxe");
	
	public static Item amethystShovel = new ModItemShovel(AMETHYST).setUnlocalizedName("amethystShovel");
	
	public static Item amethystAxe = new ModItemAxe(AMETHYST).setUnlocalizedName("amethystAxe");
	
	public static Item amethystHoe = new ModItemHoe(AMETHYST).setUnlocalizedName("amethystHoe");
	
//RUBY TOOLS	
	
	public static Item rubySword = new ModItemSword(RUBY).setUnlocalizedName("rubySword");
		
	public static Item rubyPickaxe = new ModItemPickaxe(RUBY).setUnlocalizedName("rubyPickaxe");
	
	public static Item rubyShovel = new ModItemShovel(RUBY).setUnlocalizedName("rubyShovel");
	
	public static Item rubyAxe = new ModItemAxe(RUBY).setUnlocalizedName("rubyAxe");
	
	public static Item rubyHoe = new ModItemHoe(RUBY).setUnlocalizedName("rubyHoe");

//EMERALD TOOLS
	
	public static Item emeraldSword = new ModItemSword(EMERALD).setUnlocalizedName("emeraldSword");
		
	public static Item emeraldPickaxe = new ModItemPickaxe(EMERALD).setUnlocalizedName("emeraldPickaxe");
	
	public static Item emeraldShovel = new ModItemShovel(EMERALD).setUnlocalizedName("emeraldShovel");
	
	public static Item emeraldAxe = new ModItemAxe(EMERALD).setUnlocalizedName("emeraldAxe");
	
	public static Item emeraldHoe = new ModItemHoe(EMERALD).setUnlocalizedName("emeraldHoe");

	//SAPPHIRE TOOLS
	
	public static Item sapphireSword = new ModItemSword(SAPPHIRE).setUnlocalizedName("sapphireSword");
				
	public static Item sapphirePickaxe = new ModItemPickaxe(SAPPHIRE).setUnlocalizedName("sapphirePickaxe");
		
	public static Item sapphireShovel = new ModItemShovel(SAPPHIRE).setUnlocalizedName("sapphireShovel");
		
	public static Item sapphireAxe = new ModItemAxe(SAPPHIRE).setUnlocalizedName("sapphireAxe");
		
	public static Item sapphireHoe = new ModItemHoe(SAPPHIRE).setUnlocalizedName("sapphireHoe");


        //ARMOR SETS

	
//AMETHYST ARMOR	
	
	public static Item amethystHelmet = new ItemAmethystArmor(AMETHYST_ARMOR, 0, "amethystHelmet");
	
	public static Item amethystChestplate = new ItemAmethystArmor(AMETHYST_ARMOR, 1, "amethystChestplate");
	
	public static Item amethystLeggings = new ItemAmethystArmor(AMETHYST_ARMOR, 2, "amethystLeggings");
	
	public static Item amethystBoots = new ItemAmethystArmor(AMETHYST_ARMOR, 3, "amethystBoots");
	
//RUBY ARMOR
	
	public static Item rubyHelmet = new ItemRubyArmor(RUBY_ARMOR, 0, "rubyHelmet");
	
	public static Item rubyChestplate = new ItemRubyArmor(RUBY_ARMOR, 1, "rubyChestplate");
	
	public static Item rubyLeggings = new ItemRubyArmor(RUBY_ARMOR, 2, "rubyLeggings");
	
	public static Item rubyBoots = new ItemRubyArmor(RUBY_ARMOR, 3, "rubyBoots");
	
//EMERALD ARMOR
	
	public static Item emeraldHelmet = new ItemEmeraldArmor(EMERALD_ARMOR, 0, "emeraldHelmet");
	
	public static Item emeraldChestplate = new ItemEmeraldArmor(EMERALD_ARMOR, 1, "emeraldChestplate");
	
	public static Item emeraldLeggings = new ItemEmeraldArmor(EMERALD_ARMOR, 2, "emeraldLeggings");
	
	public static Item emeraldBoots = new ItemEmeraldArmor(EMERALD_ARMOR, 3, "emeraldBoots");
	
//EMERALD ARMOR
	
	public static Item sapphireHelmet = new ItemSapphireArmor(SAPPHIRE_ARMOR, 0, "sapphireHelmet");
		
	public static Item sapphireChestplate = new ItemSapphireArmor(SAPPHIRE_ARMOR, 1, "sapphireChestplate");
		
	public static Item sapphireLeggings = new ItemSapphireArmor(SAPPHIRE_ARMOR, 2, "sapphireLeggings");
		
	public static Item sapphireBoots = new ItemSapphireArmor(SAPPHIRE_ARMOR, 3, "sapphireBoots");	
	

	public static void init()
	{
		
//TOOLS
		
	//AMETHYST TOOLS
		
		RegisterHelper.registerItem(amethystSword);
		RegisterHelper.registerItem(amethystEnchantedSword);
		RegisterHelper.registerItem(amethystPickaxe);
		RegisterHelper.registerItem(amethystShovel);
		RegisterHelper.registerItem(amethystAxe);
		RegisterHelper.registerItem(amethystHoe);
		
	//RUBY TOOLS
		
		RegisterHelper.registerItem(rubySword);
		RegisterHelper.registerItem(rubyPickaxe);
		RegisterHelper.registerItem(rubyShovel);
		RegisterHelper.registerItem(rubyAxe);
		RegisterHelper.registerItem(rubyHoe);
		
	//EMERALD TOOLS
		
		RegisterHelper.registerItem(emeraldSword);
		RegisterHelper.registerItem(emeraldPickaxe);
		RegisterHelper.registerItem(emeraldShovel);
		RegisterHelper.registerItem(emeraldAxe);
		RegisterHelper.registerItem(emeraldHoe);
		
	//EMERALD TOOLS
		
		RegisterHelper.registerItem(sapphireSword);
		RegisterHelper.registerItem(sapphirePickaxe);
		RegisterHelper.registerItem(sapphireShovel);
		RegisterHelper.registerItem(sapphireAxe);
		RegisterHelper.registerItem(sapphireHoe);
		
	//AMETHYST ARMOR
		
		RegisterHelper.registerItem(amethystHelmet);
		RegisterHelper.registerItem(amethystChestplate);
		RegisterHelper.registerItem(amethystLeggings);
		RegisterHelper.registerItem(amethystBoots);
		
	//RUBY ARMOR
		
		RegisterHelper.registerItem(rubyHelmet);
		RegisterHelper.registerItem(rubyChestplate);
		RegisterHelper.registerItem(rubyLeggings);
		RegisterHelper.registerItem(rubyBoots);
		
	//EMERALD ARMOR	
		
		RegisterHelper.registerItem(emeraldHelmet);
		RegisterHelper.registerItem(emeraldChestplate);
		RegisterHelper.registerItem(emeraldLeggings);
		RegisterHelper.registerItem(emeraldBoots);
		
	//SAPPHIRE ARMOR	
		
		RegisterHelper.registerItem(sapphireHelmet);
		RegisterHelper.registerItem(sapphireChestplate);
		RegisterHelper.registerItem(sapphireLeggings);
		RegisterHelper.registerItem(sapphireBoots);
	}
}