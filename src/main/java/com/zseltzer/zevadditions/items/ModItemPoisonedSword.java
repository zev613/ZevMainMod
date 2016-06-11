package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ModItemPoisonedSword extends ItemSword
{

    public final ToolMaterial toolMaterial;
    public static String potionInfoName;

    public ModItemPoisonedSword(ToolMaterial EnumToolMaterial)
    {
        super(EnumToolMaterial);
        toolMaterial = EnumToolMaterial;
        setCreativeTab(ModTabs.tabArmory);
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
    {
        stack.damageItem(1, player);

        enemy.addPotionEffect(new PotionEffect(Potion.poison.id, 20*30, 1));

        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }
}