package com.zseltzer.zevadditions.events;

import com.zseltzer.zevadditions.blocks.BlockModLightSapling;
import com.zseltzer.zevadditions.init.ModBlocks;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class EventHelper 
{
		//Used to make the sapling grow the tree
	@SubscribeEvent
	public void bonemealUsed(BonemealEvent event) 
	{
		if(event.world.getBlock(event.x, event.y, event.z) == ModBlocks.lightSapling) 
		{
			((BlockModLightSapling)ModBlocks.lightSapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
		}
	}

		//Register this event helper
	public static void registerEvents() 
	{
		 MinecraftForge.EVENT_BUS.register(new EventHelper());
	}
}