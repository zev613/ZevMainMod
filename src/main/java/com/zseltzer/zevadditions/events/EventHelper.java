package com.zseltzer.zevadditions.events;

import com.zseltzer.zevadditions.init.ModBlocks;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class EventHelper 
{
		//Register this event helper
	public static void registerEvents() 
	{
		 MinecraftForge.EVENT_BUS.register(new EventHelper());
	}
}