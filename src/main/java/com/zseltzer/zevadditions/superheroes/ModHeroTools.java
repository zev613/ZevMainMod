package com.zseltzer.zevadditions.superheroes;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.superheroes.tools.HeroItemAxe;
//import com.zseltzer.zevadditions.superheroes.tools.HeroItemBow;
import com.zseltzer.zevadditions.superheroes.tools.HeroItemHoe;
import com.zseltzer.zevadditions.superheroes.tools.HeroItemPickaxe;
import com.zseltzer.zevadditions.superheroes.tools.HeroItemShovel;
import com.zseltzer.zevadditions.superheroes.tools.HeroItemSword;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModHeroTools 
{	
	static Item.ToolMaterial WILLPOWER_TOOLS = EnumHelper.addToolMaterial
			("WILLPOWER_TOOLS", 3, 512, 2.0F, 2.0F, 14);
									
//HERO TOOLS
	
	//GREEN LANTERN CONSTRUCT TOOLS	
	
	public static Item willpowerSword = new HeroItemSword(WILLPOWER_TOOLS, "willpowerSword");
		
	public static Item willpowerPickaxe = new HeroItemPickaxe(WILLPOWER_TOOLS, "willpowerPickaxe");
	
	public static Item willpowerShovel = new HeroItemShovel(WILLPOWER_TOOLS, "willpowerShovel");
	
	public static Item willpowerAxe = new HeroItemAxe(WILLPOWER_TOOLS, "willpowerAxe");
	
	public static Item willpowerHoe = new HeroItemHoe(WILLPOWER_TOOLS, "willpowerHoe");
		
	public static void init()
	{
		
//WILLPOWER TOOLS
		
		RegisterHelper.registerItem(willpowerSword);
		RegisterHelper.registerItem(willpowerPickaxe);
		RegisterHelper.registerItem(willpowerShovel);
		RegisterHelper.registerItem(willpowerAxe);
		RegisterHelper.registerItem(willpowerHoe);		
	}
}
