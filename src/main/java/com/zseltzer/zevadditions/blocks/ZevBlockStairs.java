package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

public class ZevBlockStairs extends BlockStairs
{

    public ZevBlockStairs(Block blockTypeName, String unlocalizedName)
    {
        super(blockTypeName,0);
        this.setHardness(2.0F);
        this.setBlockName(unlocalizedName + "_Stairs");
        this.setCreativeTab(ModTabs.tabDecorations);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
    }
}