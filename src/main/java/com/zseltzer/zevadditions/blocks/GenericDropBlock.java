package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

import static net.minecraft.block.material.Material.*;

public class GenericDropBlock extends Block
{
    public String nameBlock;

    public Item blockItem;

    public GenericDropBlock(String name, Material blockMaterial)
    {
        super(blockMaterial);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(name);
        this.nameBlock = name;
        this.setBlockTextureName(Reference.MODID + ":" + name);
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

    public Item getItemDropped(int meta, Random rand, int fortune)
    {
        if (this.nameBlock == "chert")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.chertCobble);
        }
        else if (this.nameBlock == "dacite")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.daciteCobble);
        }
        else if (this.nameBlock == "gabbro")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.gabbroCobble);
        }
        else if (this.nameBlock == "hardenedSandstone")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.hardenedSandstoneCobble);
        }
        else if (this.nameBlock == "limestone")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.limestoneCobble);
        }
        else if (this.nameBlock == "marble")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.marbleCobble);
        }
        else if (this.nameBlock == "quartzStone")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.quartzStoneCobble);
        }
        else if (this.nameBlock == "redRock")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.redRockCobble);
        }
        else if (this.nameBlock == "rhyolite")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.rhyoliteCobble);
        }
        else if (this.nameBlock == "schist")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.schistCobble);
        }
        else if (this.nameBlock == "shale")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.shaleCobble);
        }
        else if (this.nameBlock == "slate")
        {
            this.blockItem = Item.getItemFromBlock(ModBlocks.slateCobble);
        } else
        {
            this.blockItem = Item.getItemFromBlock(this);
        }
        return this.blockItem;
    }
}