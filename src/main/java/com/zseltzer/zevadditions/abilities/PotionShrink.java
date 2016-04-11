package com.zseltzer.zevadditions.abilities;

import net.minecraft.potion.Potion;

public class PotionShrink extends Potion
{
    public PotionShrink(int par1, boolean par2, int par3)
    {
        super(par1, par2, par3);
    }

    public Potion setIconIndex(int par1, int par2)
    {
        super.setIconIndex(par1, par2);
        return this;
    }
}
