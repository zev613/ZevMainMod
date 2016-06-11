package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static net.minecraft.block.material.Material.*;

public class GenericBaseBlock extends Block
{
    public GenericBaseBlock(String name, Material blockMaterial)
    {
        super(blockMaterial);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":" + name);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.5F);
        this.setResistance(25.0F);
        if (blockMaterial == Material.rock)
        {
            this.setHarvestLevel("pickaxe", 2);
        }
        else if (blockMaterial == Material.ground)
        {
            this.setHarvestLevel("shovel", 2);
        }
        else if (blockMaterial == Material.wood)
        {
            this.setHarvestLevel("axe", 2);
        }
        else if (blockMaterial == Material.cloth)
        {
            this.setHarvestLevel("axe", 2);
        }
        else if (blockMaterial == Material.packedIce)
        {
            this.setHarvestLevel("pickaxe", 2);
        }
        else if (blockMaterial == Material.clay)
        {
            this.setHarvestLevel("shovel", 2);
        }
        else if (blockMaterial == Material.sand)
        {
            this.setHarvestLevel("shovel", 2);
        }
        else if (blockMaterial == Material.glass)
        {
            this.setHarvestLevel("pickaxe", 1);
        }
        else if (blockMaterial == Material.iron)
        {
            this.setHarvestLevel("pickaxe", 3);
        }
    }
}