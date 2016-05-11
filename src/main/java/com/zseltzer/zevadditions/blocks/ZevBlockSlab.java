package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class ZevBlockSlab extends BlockSlab
{
    private static final float HARDNESS = 2.0f;
    private static final float RESISTANCE = 10.0f;
    public static String NAME;
    public static boolean STACKED;

    public ZevBlockSlab(final boolean stacked, final String unlocalizedName)
    {
        super(stacked, Material.rock);
        NAME = unlocalizedName;
        this.useNeighborBrightness = !stacked;
        setHardness(HARDNESS);
        setResistance(RESISTANCE);
        setStepSound(soundTypeStone);
        this.setBlockTextureName(Reference.MODID + ":" + unlocalizedName);
        if (stacked == false)
        {
            setCreativeTab(ModTabs.tabNewSlabs);
            setBlockName(unlocalizedName + "_Slab");
            STACKED = false;
        }
        else if (stacked == true)
        {
            setBlockName(unlocalizedName + "_DoubleSlab");
            setCreativeTab(null);
            STACKED = true;
        }
    }

    public final String getId()
    {
        String result = "";
        if (STACKED == true)
        {
            result = "_Double";
            return getUnlocalizedName() + result + "_Slab";
        }
        else
        {
            return getUnlocalizedName() + result + "_Slab";
        }
    }

    @Override
    public final String func_150002_b(final int metadata)
    {
        return this.getUnlocalizedName();
    }

    protected final boolean isStacked()
    {
        return this.field_150004_a;
    }
}