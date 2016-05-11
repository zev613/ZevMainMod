package com.zseltzer.zevadditions.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockSapling extends ItemBlock
{
    //private static final String[] saplings = new String[] {"redwood", "maple", "palm", "willow", "pine", "fir"/*, "cherry", "bamboo"*/, "chestnut", "sequoia", "elm", "hickory", "cedar", "sycamore", "cypress", "hemlock"/*, "hawthorn", "myrtle"*/, "mahogany"};
    private static final String[] saplings = new String[] {"redwood", "maple", "palm", "willow", "pine", "fir", "chestnut", "sequoia", "elm", "hickory", "cedar", "sycamore", "cypress", "hemlock", "mahogany", "hawthorn"};
    private static final int MAX = 16;

    public ItemBlockSapling(Block block)
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
        int meta = itemStack.getItemDamageForDisplay() > MAX ? 0 : itemStack.getItemDamageForDisplay();
        return super.getUnlocalizedName() + "_" + (new StringBuilder()).append(saplings[meta]).append("_sapling").toString();
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        //TODO:	linkedBlock   getIcon
        return field_150939_a.getIcon(0, meta);
    }
}