package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockVerticalSlab extends Block
{
    
    public static String NAME;

    private static final float HARDNESS = 2.0f;

    private static final float RESISTANCE = 10.0f;

    public BlockVerticalSlab(final String unlocalizedName) 
    {
        super(Material.rock);
        this.NAME = unlocalizedName;   	 	
        this.useNeighborBrightness = true;
        this.setHardness(HARDNESS);
        this.setResistance(RESISTANCE);
        setStepSound(soundTypeStone);
        this.setBlockTextureName("zevadditions:smoothStone");
        this.opaque = false;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
        this.setCreativeTab(ModTabs.tabMassBlocks);
        this.setLightOpacity(255);
    }
}
