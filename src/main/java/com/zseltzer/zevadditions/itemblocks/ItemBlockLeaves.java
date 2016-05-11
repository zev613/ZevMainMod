package com.zseltzer.zevadditions.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import com.zseltzer.zevadditions.blocks.BlockBOPLeaves;

public class ItemBlockLeaves extends ItemBlock
{
    public ItemBlockLeaves(Block block)
    {
        super(block);

        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        //TODO:								   linkedBlock
        BlockBOPLeaves block = (BlockBOPLeaves)field_150939_a;

        return super.getUnlocalizedName() + "_" + block.getLeafType(itemStack.getItemDamage()) + "_leaves";
    }
}
