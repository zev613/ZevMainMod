package com.zseltzer.zevadditions.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import com.zseltzer.zevadditions.blocks.BlockBOPLog;

public class ItemBlockLog extends ItemBlock
{
    public ItemBlockLog(Block block)
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
    BlockBOPLog block = (BlockBOPLog)field_150939_a;
    return /*super.getUnlocalizedName() + "_" + */block.getWoodType(itemStack.getItemDamage()) + "_log";
}
}
