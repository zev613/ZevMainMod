package com.zseltzer.zevadditions;

import com.zseltzer.zevadditions.crafting.ModRecipes;
import com.zseltzer.zevadditions.events.EventHelper;
import com.zseltzer.zevadditions.events.KeyInputHandler;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModEntities;
import com.zseltzer.zevadditions.init.ModItems;
import com.zseltzer.zevadditions.init.ModSlabs;
import com.zseltzer.zevadditions.init.ModStairs;
import com.zseltzer.zevadditions.keybindings.KeyBindings;
import com.zseltzer.zevadditions.proxies.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Main 
{
	@Instance(Reference.MODID)
	public static Main instance;
	
	@SidedProxy(clientSide="com.zseltzer.zevadditions.proxies.ClientProxy", serverSide="com.zseltzer.zevadditions.proxies.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();

        ModArmory.init();

        ModBlocks.init();

        ModSlabs.init();

        ModStairs.init();

        ModEntities.init();

            FMLCommonHandler.instance().bus().register(new KeyInputHandler());

            KeyBindings.init();
    }
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		ModRecipes.init();

		EventHelper.registerEvents();
		
		proxy.registerRenderers();
    }
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    // register server commands
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}