package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

import static net.minecraft.block.material.Material.*;

public class GenericDropItemBlock extends Block
{
    public static Item itemDropped;

    public GenericDropItemBlock(String name, Material blockMaterial, Item dropItem)
    {
        super(blockMaterial);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(name);
        this.setBlockTextureName(Reference.MODID + ":" + name);
        this.itemDropped = dropItem;
        this.setHardness(2.5F);
        this.setResistance(25.0F);
        if (blockMaterial == Material.rock)
        {
            this.setHarvestLevel("pickaxe", 2);
            this.setStepSound(soundTypeStone);
        }
        else if (blockMaterial == Material.ground)
        {
            this.setHarvestLevel("shovel", 2);
            this.setStepSound(soundTypeGrass);
        }
        else if (blockMaterial == Material.wood)
        {
            this.setHarvestLevel("axe", 2);
            this.setStepSound(soundTypeWood);
        }
        else if (blockMaterial == Material.cloth)
        {
            this.setHarvestLevel("axe", 2);
            this.setStepSound(soundTypeCloth);
        }
        else if (blockMaterial == Material.packedIce)
        {
            this.setHarvestLevel("pickaxe", 2);
            this.setStepSound(soundTypeStone);
        }
        else if (blockMaterial == Material.clay)
        {
            this.setHarvestLevel("shovel", 2);
            this.setStepSound(soundTypeSand);
        }
        else if (blockMaterial == Material.sand)
        {
            this.setHarvestLevel("shovel", 2);
            this.setStepSound(soundTypeSand);
        }
        else if (blockMaterial == Material.glass)
        {
            this.setHarvestLevel("pickaxe", 1);
            this.setStepSound(soundTypeGlass);
        }
        else if (blockMaterial == Material.iron)
        {
            this.setHarvestLevel("pickaxe", 3);
            this.setStepSound(soundTypeMetal);
        }
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2)
    {
        return itemDropped;
    }
}