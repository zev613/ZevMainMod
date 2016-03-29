package com.zseltzer.zevadditions.init;

import com.zseltzer.zevadditions.entities.EntityBear;
import com.zseltzer.zevadditions.entities.EntityTestMob;
import com.zseltzer.zevadditions.entities.ModelBear;
import com.zseltzer.zevadditions.entities.RenderBear;
import com.zseltzer.zevadditions.RegisterHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ModEntities
{
	 public static void init()
	 {
		 
		 RegisterHelper.registerEntity(EntityBear.class, "entityBear");
	 }
}