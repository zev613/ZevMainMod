package com.zseltzer.zevadditions;

//import com.zseltzer.zevadditions.commands.CommandChangeSuit;
//import com.zseltzer.zevadditions.commands.CommandSuitDefault;
import com.zseltzer.zevadditions.config.ModConfig;
import com.zseltzer.zevadditions.crafting.ModRecipes;
import com.zseltzer.zevadditions.events.EventHelper;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModEntities;
import com.zseltzer.zevadditions.init.ModItems;
import com.zseltzer.zevadditions.init.ModSlabs;
import com.zseltzer.zevadditions.init.ModStairs;
import com.zseltzer.zevadditions.proxies.CommonProxy;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModHeroBlocks;
import com.zseltzer.zevadditions.superheroes.ModHeroItems;
import com.zseltzer.zevadditions.superheroes.ModHeroTools;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.util.GameLogger;
import com.zseltzer.zevadditions.world.Dimension;
import com.zseltzer.zevadditions.world.WorldTypesTutorial;
import com.zseltzer.zevadditions.world.biomes.ModBiomes;
import com.zseltzer.zevadditions.world.gen.GeneralWorldGeneration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

/*
	This is the Main mod file, this is were all the mod stuff is loaded.
	This mod/tutorial has some cutom/changed stuff as I like things done my way.
	The Log file creates its own folder and log file the .minecraft folder.
	Log file is not used yet so will be removed from the download/github.
	The Config creates its own cfg file in the ZevAdditionsConfig folder in ZevAdditions folder in .minecraft.(.minecraft/ZevAdditions/Configs/ConfigurationFile.cfg).
	The Log creates its own log file in the ZevAdditions folder in ZevAdditionsLog folder in .minecraft.(.minecraft/ZevAdditions/ZevAdditionsLog/ZevAdditionsLog.log).
	I like to keep classes clean as i can and will create new classes if I want/need to.
	Note I do not use Proxies, as I don't really need them in this code, however, it may be best to use them if you are adding mobs ?..
	Added a basic custom world type.
	Added Trees and one tree has a particle effect to it.
	To make your dimension sky like overworld, remove methods skyRenderer and cloudRenderer from WorldProviderForest
*/

public class Main 
{
	@Instance(Reference.MODID)
	public static Main instance;
	
	@SidedProxy(clientSide="com.zseltzer.zevadditions.proxies.ClientProxy", serverSide="com.zseltzer.zevadditions.proxies.CommonProxy")
	public static CommonProxy proxy;
	
GeneralWorldGeneration eventWorldGen = new GeneralWorldGeneration();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	
		ModItems.init();

		ModBlocks.init();
		
		ModSlabs.init();
		
		ModStairs.init();
		
		ModArmory.init();
		
		ModDCCostumes.init();
		
		ModMarvelCostumes.init();
		
		ModHeroTools.init();
		
		ModHeroItems.init();
		
		ModHeroBlocks.init();
		
		ModEntities.init();
		
		GameLogger.createFolders();
		
		ModConfig.createTutConfig();
				
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		ModRecipes.init();
		
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);

		ModBiomes.registerWithBiomeDictionary();
		
		Dimension.registerWorldProvider();
		
		Dimension.registerDimensions();
		
		WorldTypesTutorial.addCustomWorldTypes();
		
		EventHelper.registerEvents();
		
		proxy.registerRenderers();

	}
	/*
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    // register server commands

	event.registerServerCommand(new CommandChangeSuit());
	
	event.registerServerCommand(new CommandSuitDefault());

	}
	*/
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
