package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.items.GenericItem;

import net.minecraft.item.Item;

public class ModItems
{
    //METAL ITEMS
	
	public static Item rubyIngot = new GenericItem("rubyIngot");
	
	public static Item amethystIngot = new GenericItem("amethystIngot");
	
	public static Item sapphireIngot = new GenericItem("sapphireIngot");

	public static Item silverIngot = new GenericItem("silverIngot");
	
//WORLD ITEMS
	
	public static Item ballOfAdobe = new GenericItem("ballOfAdobe");
	
	public static Item adobeBrick = new GenericItem("adobeBrick");

	public static Item topazIngot = new GenericItem("topazIngot");
	
	public static Item blackDye = new GenericItem("blackDye");
	
	public static Item blueDye = new GenericItem("blueDye");
	
	public static Item greenDye = new GenericItem("greenDye");
	
	public static Item ironNugget = new GenericItem("ironNugget");
	
	public static Item whiteDye = new GenericItem("whiteDye");

    public static Item bronzeIngot = new GenericItem("bronzeIngot");
	
//OTHER ITEMS	
	
        public static void init()
        {
        RegisterHelper.registerItem(ballOfAdobe);
        RegisterHelper.registerItem(adobeBrick);
        RegisterHelper.registerItem(amethystIngot);
        RegisterHelper.registerItem(blackDye);
        RegisterHelper.registerItem(blueDye);
        RegisterHelper.registerItem(greenDye);
        RegisterHelper.registerItem(ironNugget);
        RegisterHelper.registerItem(rubyIngot);
        RegisterHelper.registerItem(sapphireIngot);
        RegisterHelper.registerItem(silverIngot);
        RegisterHelper.registerItem(topazIngot);
        RegisterHelper.registerItem(whiteDye);
        RegisterHelper.registerItem(bronzeIngot);
        }
}