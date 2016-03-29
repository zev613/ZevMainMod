package com.zseltzer.zevadditions.world.biomes.decorators;

import java.util.Random;

import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.world.gen.WorldGenEffectTree;
import com.zseltzer.zevadditions.world.gen.WorldGenForestBigTree;
import com.zseltzer.zevadditions.world.gen.WorldGenForestTrees;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeDecoratorMod extends BiomeDecorator
{
	/** The world the BiomeDecorator is currently decorating */
	public static World currentWorld;
	/** The Biome Decorator's random number generator. */
	public static Random randomGenerator;
	/** The X-coordinate of the chunk currently being decorated */
	public static int chunk_X;
	/** The Z-coordinate of the chunk currently being decorated */
	public static int chunk_Z;
	/** True if decorator should generate surface lava & water */
	public static boolean generateLakes;
	/** How meny trees per chunk, set in each biome class **/
	public static int howManyTrees;

	/** Dimension Trees **/
	public static WorldGenForestTrees smallTree;
	public static WorldGenForestBigTree bigTree;
	public static WorldGenEffectTree effectTree;
	
	@SuppressWarnings("unused")
	private static final String __OBFID = "CL_00000164";

	public BiomeDecoratorMod() 
	{
		coalGen = new WorldGenMinable(Blocks.coal_ore, 16, ModBlocks.lightStone);
		ironGen = new WorldGenMinable(Blocks.iron_ore, 8, ModBlocks.lightStone);
		goldGen = new WorldGenMinable(Blocks.gold_ore, 8, ModBlocks.lightStone);
		redstoneGen = new WorldGenMinable(Blocks.redstone_ore, 7, ModBlocks.lightStone);
		diamondGen = new WorldGenMinable(Blocks.diamond_ore, 7, ModBlocks.lightStone);
		lapisGen = new WorldGenMinable(Blocks.lapis_ore, 6, ModBlocks.lightStone);

		// TREES
		smallTree = new WorldGenForestTrees(true);
		bigTree = new WorldGenForestBigTree(true, 10, 1, 5);
		effectTree = new WorldGenEffectTree(true);

		// generates lakes and lava lakes in dimension.
		generateLakes = true;
	}

	public void decorateChunk(World world, Random random, BiomeGenBase biomeGenBase, int chunkX, int chunkZ) 
	{
		if (currentWorld != null) 
		{
			throw new RuntimeException("Already decorating!!");
		} else {
			currentWorld = world;
			randomGenerator = random;
			chunk_X = chunkX;
			chunk_Z = chunkZ;
			genDecorationsForBiome(biomeGenBase);
			currentWorld = null;
			randomGenerator = null;
		}
	}

	/**
	 * Decorate's biome.
	 * 
	 * @param biome
	 */
	protected void genDecorationsForBiome(BiomeGenBase biome) 
	{
		BiomeDecoratorHelper.decorateBiome(biome);
	}
}