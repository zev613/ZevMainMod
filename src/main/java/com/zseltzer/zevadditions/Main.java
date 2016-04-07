package com.zseltzer.zevadditions;

//import com.zseltzer.zevadditions.abilities.Abilities;
//import com.zseltzer.zevadditions.abilities.PotionFireBreathing;
//import com.zseltzer.zevadditions.abilities.PotionInvisibility;
//import com.zseltzer.zevadditions.abilities.PotionRegen;
//import com.zseltzer.zevadditions.abilities.PotionSpeed;
//import com.zseltzer.zevadditions.abilities.PotionWaterBreathing;
import com.zseltzer.zevadditions.abilities.PotionFlight;
import com.zseltzer.zevadditions.commands.CommandBlackAdam;
import com.zseltzer.zevadditions.commands.CommandChangeSuit;
import com.zseltzer.zevadditions.commands.CommandNewShazam;
import com.zseltzer.zevadditions.commands.CommandShazam;
import com.zseltzer.zevadditions.config.ModConfig;
import com.zseltzer.zevadditions.crafting.ModRecipes;
import com.zseltzer.zevadditions.events.EventHelper;
import com.zseltzer.zevadditions.events.ModEventHandler;
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

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

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
	
	ModEventHandler events = new ModEventHandler();
	
GeneralWorldGeneration eventWorldGen = new GeneralWorldGeneration();
	/*
	public static Potion speedForcePotion;
	public static int speedForcePotionID;
	public static Potion negspeedForcePotion;
	public static int negspeedForcePotionID;
	public static Potion speedPotion;
	public static int speedPotionID;
	public static Potion strengthPotion;
	public static int strengthPotionID;
	public static Potion waterPotion;
	public static int waterPotionID;
	public static Potion firePotion;
	public static int firePotionID;
	public static Potion regenPotion;
	public static int regenPotionID;
	public static Potion magicPotion;
	public static int magicPotionID;
	public static Potion telePotion;
	public static int telePotionID;
	public static Potion shrinkPotion;
	public static int shrinkPotionID;
	public static Potion jumpPotion;
	public static int jumpPotionID;
	public static Potion flightPotion;
	public static int flightPotionID;
	public static Potion archeryPotion;
	public static int archeryPotionID;
	public static Potion invPotion;
	public static int invPotionID;
	public static Potion growPotion;
	public static int growPotionID;

	public void initConfiguration(FMLPreInitializationEvent preEvent) {
		Configuration config = new Configuration(new java.io.File("config/SuperheroesUnlimitedMod.cfg"));
		config.load();

		speedForcePotionID = config.getInt("Speed Force ID", "Abilities", 80, 0, Integer.MAX_VALUE, "Speed Force Ability ID");
		negspeedForcePotionID = config.getInt("Negative Speed Force ID", "Abilities", 81, 0, Integer.MAX_VALUE, "Negative Speed Force Ability ID");
		strengthPotionID = config.getInt("Strength ID", "Abilities", 84, 0, Integer.MAX_VALUE, "Strength Ability ID");
		speedPotionID = config.getInt("Speed ID", "Abilities", 85, 0, Integer.MAX_VALUE, "Speed Ability ID");
		jumpPotionID = config.getInt("Acrobatics ID", "Abilities", 93, 0, Integer.MAX_VALUE, "Acrobatics Ability ID");
		waterPotionID = config.getInt("Water Breathing ID", "Abilities", 89, 0, Integer.MAX_VALUE, "Water Breathing Ability ID");
		firePotionID = config.getInt("Fire Resistance ID", "Abilities", 88, 0, Integer.MAX_VALUE, "Fire Resistance Ability ID");
		shrinkPotionID = config.getInt("Size Reduction ID", "Abilities", 96, 0, Integer.MAX_VALUE, "Size Reduction Ability ID");
		magicPotionID = config.getInt("Magic ID", "Abilities", 97, 0, Integer.MAX_VALUE, "Magic Ability ID");
		archeryPotionID = config.getInt("Archery ID", "Abilities", 98, 0, Integer.MAX_VALUE, "Archery Ability ID");
		flightPotionID = config.getInt("Flight ID", "Abilities", 90, 0, Integer.MAX_VALUE, "Flight Ability ID");
		telePotionID = config.getInt("Teleportation ID", "Abilities", 102, 0, Integer.MAX_VALUE, "Teleportation Ability ID");
		regenPotionID = config.getInt("Regen ID", "Abilities", 94, 0, Integer.MAX_VALUE, "Regen Ability ID");
		growPotionID = config.getInt("Size Enhancement ID", "Abilities", 95, 0, Integer.MAX_VALUE, "Size Enhancement Ability ID");
		flightPotionID = config.getInt("Flight ID", "Abilities", 90, 0, Integer.MAX_VALUE, "Flight Ability ID");
		invPotionID = config.getInt("Invisibility ID", "Abilities", 92, 0, Integer.MAX_VALUE, "Invisibility Ability ID");
	}
	*/

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


		Potion[] potionTypes = null;

		for (Field f : Potion.class.getDeclaredFields())
        {
			f.setAccessible(true);
			try {
				if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a"))
				{
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

					potionTypes = (Potion[])f.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			}
			catch (Exception e)
			{
				System.err.println("Severe error, please report this to the mod author:");
				System.err.println(e);
			}
		}

		FMLCommonHandler.instance().bus().register(events);

		MinecraftForge.EVENT_BUS.register(events);

		/*
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.PotionEventHooks());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.SupermanEventHandler());
		//MinecraftForge.EVENT_BUS.register(new SpeedForceEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.NegativeSpeedForceEventHandler());
		MinecraftForge.EVENT_BUS.register(new KidFlashSpeedForce());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.AquamanEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.AntManEventHandler());
		MinecraftForge.EVENT_BUS.register(new WaspEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.MartianManhunterEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.VisionEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.WonderWomanEventHandler());
		MinecraftForge.EVENT_BUS.register(new DeadpoolEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.GreenArrowEventHandler());
		MinecraftForge.EVENT_BUS.register(new SpeedyEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.ShazamEventHandler());
		MinecraftForge.EVENT_BUS.register(new HawkgirlEventHandler());
		MinecraftForge.EVENT_BUS.register(new GreenLanternEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.BlackPantherEventHandler());
		MinecraftForge.EVENT_BUS.register(new WolverineEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.SpawnEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.ProwlerEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.WillpowerEventHandler());
		MinecraftForge.EVENT_BUS.register(new com.zseltzer.zevadditions.handlers.BlackCanaryEventHandler());
	*/
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


        //flightPotion = new PotionFlight(80, false, 0).setIconIndex(0, 0).setPotionName("potion.flightPotion");


		/*
		speedPotion = new PotionSpeed(speedPotionID, false, 0).func_76399_b(0, 0).func_76390_b("potion.speedPotion").func_111184_a(SharedMonsterAttributes.field_111263_d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2);
		strengthPotion = new Abilities(strengthPotionID, false, 0).func_76399_b(4, 0).func_76390_b("potion.strengthPotion").func_111184_a(SharedMonsterAttributes.field_111264_e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3.0D, 1);
		jumpPotion = new Abilities(jumpPotionID, false, 0).func_76399_b(0, 0).func_76390_b("potion.jumpPotion");
		waterPotion = new PotionWaterBreathing(waterPotionID, false, 0).func_76399_b(0, 2).func_76390_b("potion.waterPotion");
		firePotion = new PotionFireBreathing(firePotionID, false, 0).func_76399_b(7, 1).func_76390_b("potion.firePotion");
		regenPotion = new PotionRegen(regenPotionID, false, 0).func_76399_b(7, 0).func_76390_b("potion.regenPotion");
		speedForcePotion = new Abilities(speedForcePotionID, false, 0).func_76399_b(2, 0).func_76390_b("potion.speedForcePotion");
		negspeedForcePotion = new Abilities(negspeedForcePotionID, false, 0).func_76399_b(2, 1).func_76390_b("potion.negspeedForcePotion");
		flightPotion = new Abilities(flightPotionID, false, 0).func_76399_b(1, 0).func_76390_b("potion.flightPotion");
		invPotion = new PotionInvisibility(invPotionID, false, 0).func_76399_b(0, 1).func_76390_b("potion.invPotion");
		growPotion = new Abilities(growPotionID, false, 0).func_76399_b(1, 1).func_76390_b("potion.growPotion");
		shrinkPotion = new Abilities(shrinkPotionID, false, 0).func_76399_b(0, 1).func_76390_b("potion.shrinkPotion");
		magicPotion = new Abilities(magicPotionID, false, 0).func_76399_b(4, 1).func_76390_b("potion.magicPotion");
		archeryPotion = new Abilities(archeryPotionID, false, 0).func_76399_b(3, 1).func_76390_b("potion.archeryPotion");
		telePotion = new Abilities(telePotionID, false, 0).func_76399_b(0, 2).func_76390_b("potion.tele");
		*/
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    // register server commands

	event.registerServerCommand(new CommandChangeSuit());
	
	event.registerServerCommand(new CommandNewShazam());

	event.registerServerCommand(new CommandBlackAdam());

	//event.registerServerCommand(new com.zseltzer.zevadditions.commands.CommandSpectreTime());
	//event.registerServerCommand(new com.zseltzer.zevadditions.commands.CommandSpawn());
	//event.registerServerCommand(new CommandSpawnTime());

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}