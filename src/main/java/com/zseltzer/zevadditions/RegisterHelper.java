package com.zseltzer.zevadditions;

import java.util.Random;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;

public class RegisterHelper
{	
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + block.getUnlocalizedName().substring(5));
	}
	
	/*
	public static void registerMetaBlock(Block block, Class itemclass)
	{
		GameRegistry.registerBlock(block, itemclass, Reference.MODID + block.getUnlocalizedName().substring(5));
	}
	*/

	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, Reference.MODID + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerEntity(Class entityClass, String name)
	{
	int entityID = EntityRegistry.findGlobalUniqueEntityId();
	long seed = name.hashCode();
	Random rand = new Random(seed);
	int primaryColor = rand.nextInt() * 16777215;
	int secondaryColor = rand.nextInt() * 16777215;

	EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
	EntityRegistry.registerModEntity(entityClass, name, entityID, Main.instance, 64, 1, true);
	EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}
}
