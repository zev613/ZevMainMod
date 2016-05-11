package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class StorageBlock extends Block
{
    private String name;

    public StorageBlock(String unlocalizedName, Material blockMaterial, Item storedItem) {
        super(blockMaterial);
        this.name = unlocalizedName;
        setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(unlocalizedName);
        stepSound = soundTypeStone;
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));

        if (blockMaterial == Material.rock)
        {
            this.setHardness(5.0F);
            this.setResistance(30.0F);
        }
        else
        {
            this.setHardness(2.5F);
            this.setResistance(10.0F);
        }
    }
}