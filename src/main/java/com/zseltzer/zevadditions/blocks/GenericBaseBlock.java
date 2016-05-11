package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GenericBaseBlock extends Block
{
    public GenericBaseBlock(String unlocalizedName, Material blockMaterial)
    {
        super(blockMaterial);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
        this.setResistance(25.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}