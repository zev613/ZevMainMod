package com.zseltzer.zevadditions.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBronzeArmor extends ItemArmor
{
    public String textureName = "bronze";

    public ItemBronzeArmor( ArmorMaterial material, int ArmorType, String name)
    {
        super(material, 0, ArmorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabArmory);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModArmory.bronzeHelmet || stack.getItem() == ModArmory.bronzeChestplate || stack.getItem() == ModArmory.bronzeBoots)
        {
            return Reference.MODID + ":textures/models/armor/bronze_1.png";
        }
        else if (stack.getItem() == ModArmory.bronzeLeggings)
        {
            return Reference.MODID + ":textures/models/armor/bronze_2.png";
        }
        else
        {
            return null;
        }
    }
}