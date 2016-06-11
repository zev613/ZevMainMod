package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSilverArmor extends ItemArmor
{
    public String textureName = "silver";

    public ItemSilverArmor( ArmorMaterial material, int ArmorType, String name)
    {
        super(material, 0, ArmorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabArmory);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModArmory.silverHelmet || stack.getItem() == ModArmory.silverChestplate || stack.getItem() == ModArmory.silverBoots)
        {
            return Reference.MODID + ":textures/models/armor/silver_1.png";
        }
        else if (stack.getItem() == ModArmory.silverLeggings)
        {
            return Reference.MODID + ":textures/models/armor/silver_2.png";
        }
        else
        {
            return null;
        }
    }
}
