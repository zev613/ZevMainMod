package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.items.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory 
{
//Amethyst Material
	
	static Item.ToolMaterial AMETHYST = EnumHelper.addToolMaterial
		("AMETHYST", 5, 1024, 7.0F, 4.0F, 16);
	
	static ArmorMaterial AMETHYST_ARMOR = EnumHelper.addArmorMaterial
		("AMETHYST_ARMOR", 37, new int[]{5, 11, 9, 5}, 14);
	
//Ruby Material	
	
	static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial
			("RUBY", 3, 665, 6.0F, 2.0F, 14);
		
		static ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial
			("RUBY_ARMOR", 35, new int[]{4, 9, 7, 4}, 14);
	
//Emerald Material
		
	static Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial
				("EMERALD", 5, 960, 7.0F, 4.0F, 16);
			
		static ArmorMaterial EMERALD_ARMOR = EnumHelper.addArmorMaterial
				("EMERALD_ARMOR", 36, new int[]{4, 12, 10, 4}, 14);

//Saphire Material
		
		static Item.ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial
				("SAPPHIRE", 3, 640, 6.0F, 2.0F, 14);
			
		static ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial
				("SAPPHIRE_ARMOR", 35, new int[]{4, 9, 7, 4}, 14);

//Bronze Material

    static Item.ToolMaterial BRONZE = EnumHelper.addToolMaterial
            ("BRONZE", 2, 512, 5.0F, 2.0F, 14);

    static ArmorMaterial BRONZE_ARMOR = EnumHelper.addArmorMaterial
            ("BRONZE_ARMOR", 27, new int[]{3, 8, 6, 3}, 15);

//Silver Material

    static Item.ToolMaterial SILVER = EnumHelper.addToolMaterial
            ("SILVER", 3, 512, 4.0F, 2.0F, 14);

    static ArmorMaterial SILVER_ARMOR = EnumHelper.addArmorMaterial
            ("SILVER_ARMOR", 25, new int[]{3, 8, 6, 3}, 15);

//TOOL SETS

	//AMETHYST TOOLS

	public static Item amethystSword = new ModItemSword(AMETHYST).setUnlocalizedName("amethystSword");

	public static Item amethystPoisonedSword = new ModItemPoisonedSword(AMETHYST).setUnlocalizedName("amethystPoisonedSword");

	public static Item amethystPickaxe = new ModItemPickaxe(AMETHYST).setUnlocalizedName("amethystPickaxe");

	public static Item amethystShovel = new ModItemShovel(AMETHYST).setUnlocalizedName("amethystShovel");

	public static Item amethystAxe = new ModItemAxe(AMETHYST).setUnlocalizedName("amethystAxe");

	public static Item amethystHoe = new ModItemHoe(AMETHYST).setUnlocalizedName("amethystHoe");

//RUBY TOOLS	
	
	public static Item rubySword = new ModItemSword(RUBY).setUnlocalizedName("rubySword");

    public static Item rubyPoisonedSword = new ModItemPoisonedSword(RUBY).setUnlocalizedName("rubyPoisonedSword");

    public static Item rubyPickaxe = new ModItemPickaxe(RUBY).setUnlocalizedName("rubyPickaxe");
	
	public static Item rubyShovel = new ModItemShovel(RUBY).setUnlocalizedName("rubyShovel");
	
	public static Item rubyAxe = new ModItemAxe(RUBY).setUnlocalizedName("rubyAxe");
	
	public static Item rubyHoe = new ModItemHoe(RUBY).setUnlocalizedName("rubyHoe");

//EMERALD TOOLS
	
	public static Item emeraldSword = new ModItemSword(EMERALD).setUnlocalizedName("emeraldSword");

    public static Item emeraldPoisonedSword = new ModItemPoisonedSword(EMERALD).setUnlocalizedName("emeraldPoisonedSword");

    public static Item emeraldPickaxe = new ModItemPickaxe(EMERALD).setUnlocalizedName("emeraldPickaxe");
	
	public static Item emeraldShovel = new ModItemShovel(EMERALD).setUnlocalizedName("emeraldShovel");
	
	public static Item emeraldAxe = new ModItemAxe(EMERALD).setUnlocalizedName("emeraldAxe");
	
	public static Item emeraldHoe = new ModItemHoe(EMERALD).setUnlocalizedName("emeraldHoe");

//SAPPHIRE TOOLS
	
	public static Item sapphireSword = new ModItemSword(SAPPHIRE).setUnlocalizedName("sapphireSword");

    public static Item sapphirePoisonedSword = new ModItemPoisonedSword(SAPPHIRE).setUnlocalizedName("sapphirePoisonedSword");

    public static Item sapphirePickaxe = new ModItemPickaxe(SAPPHIRE).setUnlocalizedName("sapphirePickaxe");
		
	public static Item sapphireShovel = new ModItemShovel(SAPPHIRE).setUnlocalizedName("sapphireShovel");
		
	public static Item sapphireAxe = new ModItemAxe(SAPPHIRE).setUnlocalizedName("sapphireAxe");
		
	public static Item sapphireHoe = new ModItemHoe(SAPPHIRE).setUnlocalizedName("sapphireHoe");

//BRONZE TOOLS

	public static Item bronzeSword = new ModItemSword(BRONZE).setUnlocalizedName("bronzeSword");

    public static Item bronzePoisonedSword = new ModItemPoisonedSword(BRONZE).setUnlocalizedName("bronzePoisonedSword");

    public static Item bronzePickaxe = new ModItemPickaxe(BRONZE).setUnlocalizedName("bronzePickaxe");

	public static Item bronzeShovel = new ModItemShovel(BRONZE).setUnlocalizedName("bronzeShovel");

	public static Item bronzeAxe = new ModItemAxe(BRONZE).setUnlocalizedName("bronzeAxe");

	public static Item bronzeHoe = new ModItemHoe(BRONZE).setUnlocalizedName("bronzeHoe");

//SILVER TOOLS

    public static Item silverSword = new ModItemSword(SILVER).setUnlocalizedName("silverSword");

    public static Item silverPoisonedSword = new ModItemPoisonedSword(SILVER).setUnlocalizedName("silverPoisonedSword");

    public static Item silverPickaxe = new ModItemPickaxe(SILVER).setUnlocalizedName("silverPickaxe");

    public static Item silverShovel = new ModItemShovel(SILVER).setUnlocalizedName("silverShovel");

    public static Item silverAxe = new ModItemAxe(SILVER).setUnlocalizedName("silverAxe");

    public static Item silverHoe = new ModItemHoe(SILVER).setUnlocalizedName("silverHoe");

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
	
//SAPPHIRE ARMOR
	
	public static Item sapphireHelmet = new ItemSapphireArmor(SAPPHIRE_ARMOR, 0, "sapphireHelmet");
		
	public static Item sapphireChestplate = new ItemSapphireArmor(SAPPHIRE_ARMOR, 1, "sapphireChestplate");
		
	public static Item sapphireLeggings = new ItemSapphireArmor(SAPPHIRE_ARMOR, 2, "sapphireLeggings");
		
	public static Item sapphireBoots = new ItemSapphireArmor(SAPPHIRE_ARMOR, 3, "sapphireBoots");

//BRONZE ARMOR

    public static Item bronzeHelmet = new ItemBronzeArmor(BRONZE_ARMOR, 0, "bronzeHelmet");

    public static Item bronzeChestplate = new ItemBronzeArmor(BRONZE_ARMOR, 1, "bronzeChestplate");

    public static Item bronzeLeggings = new ItemBronzeArmor(BRONZE_ARMOR, 2, "bronzeLeggings");

    public static Item bronzeBoots = new ItemBronzeArmor(BRONZE_ARMOR, 3, "bronzeBoots");

//SILVER ARMOR

    public static Item silverHelmet = new ItemSilverArmor(SILVER_ARMOR, 0, "silverHelmet");

    public static Item silverChestplate = new ItemSilverArmor(SILVER_ARMOR, 1, "silverChestplate");

    public static Item silverLeggings = new ItemSilverArmor(SILVER_ARMOR, 2, "silverLeggings");

    public static Item silverBoots = new ItemSilverArmor(SILVER_ARMOR, 3, "silverBoots");

    public static void init()
	{
		
//TOOLS
		
	//AMETHYST TOOLS
		
		RegisterHelper.registerItem(amethystSword);
		RegisterHelper.registerItem(amethystPoisonedSword);
		RegisterHelper.registerItem(amethystPickaxe);
		RegisterHelper.registerItem(amethystShovel);
		RegisterHelper.registerItem(amethystAxe);
		RegisterHelper.registerItem(amethystHoe);
		
	//RUBY TOOLS
		
		RegisterHelper.registerItem(rubySword);
        RegisterHelper.registerItem(rubyPoisonedSword);
        RegisterHelper.registerItem(rubyPickaxe);
		RegisterHelper.registerItem(rubyShovel);
		RegisterHelper.registerItem(rubyAxe);
		RegisterHelper.registerItem(rubyHoe);
		
	//EMERALD TOOLS
		
		RegisterHelper.registerItem(emeraldSword);
        RegisterHelper.registerItem(emeraldPoisonedSword);
        RegisterHelper.registerItem(emeraldPickaxe);
		RegisterHelper.registerItem(emeraldShovel);
		RegisterHelper.registerItem(emeraldAxe);
		RegisterHelper.registerItem(emeraldHoe);
		
	//SAPPHIRE TOOLS
		
		RegisterHelper.registerItem(sapphireSword);
        RegisterHelper.registerItem(sapphirePoisonedSword);
        RegisterHelper.registerItem(sapphirePickaxe);
		RegisterHelper.registerItem(sapphireShovel);
		RegisterHelper.registerItem(sapphireAxe);
		RegisterHelper.registerItem(sapphireHoe);

    //BRONZE TOOLS

        RegisterHelper.registerItem(bronzeSword);
        RegisterHelper.registerItem(bronzePoisonedSword);
        RegisterHelper.registerItem(bronzePickaxe);
        RegisterHelper.registerItem(bronzeShovel);
        RegisterHelper.registerItem(bronzeAxe);
        RegisterHelper.registerItem(bronzeHoe);

    //SILVER TOOLS

    RegisterHelper.registerItem(silverSword);
        RegisterHelper.registerItem(silverPoisonedSword);
        RegisterHelper.registerItem(silverPickaxe);
    RegisterHelper.registerItem(silverShovel);
    RegisterHelper.registerItem(silverAxe);
    RegisterHelper.registerItem(silverHoe);

//ARMOR SETS

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

    //BRONZE ARMOR

        RegisterHelper.registerItem(bronzeHelmet);
        RegisterHelper.registerItem(bronzeChestplate);
        RegisterHelper.registerItem(bronzeLeggings);
        RegisterHelper.registerItem(bronzeBoots);

    //SILVER ARMOR

    RegisterHelper.registerItem(silverHelmet);
    RegisterHelper.registerItem(silverChestplate);
    RegisterHelper.registerItem(silverLeggings);
    RegisterHelper.registerItem(silverBoots);
	}
}