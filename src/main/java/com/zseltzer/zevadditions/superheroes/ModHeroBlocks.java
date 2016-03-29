package com.zseltzer.zevadditions.superheroes;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.superheroes.blocks.GenericHeroBlock;

import net.minecraft.block.Block;

public class ModHeroBlocks 
{

	public static Block kryptoniteOre = new GenericHeroBlock("kryptoniteOre");
	
	public static Block kryptoniteBlock = new GenericHeroBlock("kryptoniteBlock");
	
	public static Block adamantiumOre = new GenericHeroBlock("adamantiumOre");

	public static Block adamantiumBlock = new GenericHeroBlock("adamantiumBlock");
	
	public static Block bronzeOre = new GenericHeroBlock("bronzeOre");

	public static Block bronzeBlock = new GenericHeroBlock("bronzeBlock");

	public static Block vibraniumOre = new GenericHeroBlock("vibraniumOre");
	
	public static Block redDiamondOre = new GenericHeroBlock("redDiamondOre");

	public static Block platinumOre = new GenericHeroBlock("platinumOre");

	public static Block tesseract = new GenericHeroBlock("tesseract");

	
	public static void init()
	{
	
		RegisterHelper.registerBlock(kryptoniteOre);
		
		RegisterHelper.registerBlock(kryptoniteBlock);
		
		RegisterHelper.registerBlock(adamantiumOre);
		
		RegisterHelper.registerBlock(adamantiumBlock);
		
		RegisterHelper.registerBlock(bronzeOre);
		
		RegisterHelper.registerBlock(bronzeBlock);
		
		RegisterHelper.registerBlock(vibraniumOre);
		
		RegisterHelper.registerBlock(redDiamondOre);

		RegisterHelper.registerBlock(platinumOre);

		RegisterHelper.registerBlock(tesseract);
	}
}
