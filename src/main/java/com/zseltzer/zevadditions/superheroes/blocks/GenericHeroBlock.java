package com.zseltzer.zevadditions.superheroes.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GenericHeroBlock extends Block 
{
	
	public GenericHeroBlock(String unlocalizedName)
	{
		super(Material.rock);
        this.setCreativeTab(ModTabs.tabHeroBlocks);
        this.setBlockName(unlocalizedName);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
	  	this.setResistance(25.0F);
	  	this.setHarvestLevel("pickaxe", 2);

	}
	
}


