package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GenericWoodBlock extends Block 
{

	public GenericWoodBlock(String unlocalizedName)
	{
		
		super(Material.wood);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
        this.setStepSound(soundTypeWood);
        this.setHardness(2F);
	  	this.setResistance(10.0F);
	  	this.setHarvestLevel("axe", 2);

	}
	
}


