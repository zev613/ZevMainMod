package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
/*
public class ZevLog extends ZevBlockLog
{
    public static final String[] woodLogTypeNames = new String[]{"maple", "redwood", "pine", "willow", "palm"};
    //field_150168_M

    //returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)

    public ZevLog()
    {
        this.setCreativeTab(ModTabs.tabNewBlocks);
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
        list.add(new ItemStack(item, 1, 4));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.logArray1_a = new IIcon[woodLogTypeNames.length];
        this.logArray2_b = new IIcon[woodLogTypeNames.length];

        for (int i = 0; i < this.logArray1_a.length; ++i)
        {
            this.logArray1_a[i] = icon.registerIcon(Reference.MODID + ":log_" + woodLogTypeNames[i]);
            this.logArray2_b[i] = icon.registerIcon(Reference.MODID + ":log_" + woodLogTypeNames[i] + "_top");
        }
    }
}*/
