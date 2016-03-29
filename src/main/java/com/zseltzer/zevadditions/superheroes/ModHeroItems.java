package com.zseltzer.zevadditions.superheroes;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.superheroes.items.GenericHeroItem;

import net.minecraft.item.Item;

public class ModHeroItems 
{

	public static Item greenLanternRing = new GenericHeroItem("greenLanternRing");
	
	public static Item kryptonite = new GenericHeroItem("kryptonite");
	
	public static Item bronzeIngot = new GenericHeroItem("bronzeIngot");

	public static Item platinumIngot = new GenericHeroItem("platinumIngot");
	
	public static Item vibranium = new GenericHeroItem("vibranium");
	
	public static Item redDiamond = new GenericHeroItem("redDiamond");


	

	
	
	public static void init()
	{
		
		RegisterHelper.registerItem(greenLanternRing);
		
		RegisterHelper.registerItem(kryptonite);
		
		RegisterHelper.registerItem(bronzeIngot);
		
		RegisterHelper.registerItem(platinumIngot);

		RegisterHelper.registerItem(vibranium);
		
		RegisterHelper.registerItem(redDiamond);



	}
	
}
