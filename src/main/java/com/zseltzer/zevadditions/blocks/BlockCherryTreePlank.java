package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCherryTreePlank extends Block 
{

    public BlockCherryTreePlank(String name) 
    {
        super(Material.wood);
        setHardness(2.0F);
        setResistance(5.0F);
        this.setBlockName(name + "_planks");
        this.setBlockTextureName("zevadditions:" + name + "_planks");
        setCreativeTab(ModTabs.tabNewBlocks);
    }

    @Override
    public boolean isOpaqueCube() 
    {
        return true;
    }
}
