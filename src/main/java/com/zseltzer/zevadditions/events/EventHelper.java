package com.zseltzer.zevadditions.events;

import com.zseltzer.zevadditions.Main;
import com.zseltzer.zevadditions.blocks.ZevSapling;
import com.zseltzer.zevadditions.init.ModAchievements;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.init.ModBlocks;

import com.zseltzer.zevadditions.init.ModItems;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import net.minecraftforge.event.terraingen.SaplingGrowTreeEvent;

import java.util.logging.Level;

public class EventHelper
{
    //Register this event helper
    public static void registerEvents()
    {
        MinecraftForge.EVENT_BUS.register(new EventHelper());
    }

    public int applesFound = 0;

    public int ironFound = 0;

    /*
    @SubscribeEvent
    public void onTreeGrow(SaplingGrowTreeEvent e)
    {
        if(e.world.getBiomeGenForCoords(e.x, e.z) == BiomeGenBase.taiga)//Here i need to add conditional if type of tree not equals spruce
        {
            e.setResult(Event.Result.ALLOW);
        }
    }
    */

/*
    @SubscribeEvent
    public void bonemealUsed(BonemealEvent event)
    {
        if(event.world.getBlock(event.x, event.y, event.z) == ModBlocks.sapling)
        {
            ((ZevSapling)ModBlocks.sapling).func_149878_d(event.world, event.x, event.y, event.z, event.world.rand);
        }
    }
*/

    @SubscribeEvent
    public void crafting(PlayerEvent.ItemCraftedEvent event)
    {
        if(event.crafting.getItem() == ModArmory.sapphireHelmet)
        {
            event.player.addStat(ModAchievements.craftSapphire, 1);
        }
    }

    @SubscribeEvent
    public void smelting(PlayerEvent.ItemSmeltedEvent event)
    {
        if(event.smelting.getItem() == ModItems.rubyIngot)
        {
            event.player.addStat(ModAchievements.smeltRubyIngot, 1);
        }
    }

    public void pickup(PlayerEvent.ItemPickupEvent event)
    {

        if (event.pickedUp.getEntityItem().getItem() == Items.apple)
        {
            applesFound = applesFound + 1;

            this.triggerAchievementSecond(event);
        }

        if (event.pickedUp.getEntityItem().getItem() == Items.iron_ingot)
        {
            ironFound = ironFound + 1;

            this.triggerAchievementSecond(event);
        }
    }


    private void triggerAchievementSecond(PlayerEvent.ItemPickupEvent event)
    {
        if(applesFound >= 2)
        {
            if(ironFound >= 1)
            {

                event.player.addStat(ModAchievements.pickupSecond, 1);

            }
        }
    }
}