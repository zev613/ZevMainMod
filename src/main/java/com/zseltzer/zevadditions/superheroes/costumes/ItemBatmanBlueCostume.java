package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBatmanBlueCostume extends ItemArmor
{
    public String textureName = "batmanBlue";

    public ItemBatmanBlueCostume( ArmorMaterial material, int ArmorType, String unlocalizedName)
    {
        super(material, 0, ArmorType);
        setUnlocalizedName(unlocalizedName);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabHeroCostumes);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModDCCostumes.batmanBlueHead || stack.getItem() == ModDCCostumes.batmanBlueChest || stack.getItem() == ModDCCostumes.batmanBlueBoots)
        {
            return Reference.MODID + ":textures/models/batmanBlue_1.png";
        }
        else if (stack.getItem() == ModDCCostumes.batmanBluePants)
        {
            return Reference.MODID + ":textures/models/batmanBlue_2.png";
        }
        else
        {
            return null;
        }
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        super.onArmorTick(world, player, itemStack);
        ItemStack boots = player.inventory.armorInventory[0];
        ItemStack pants = player.inventory.armorInventory[1];
        ItemStack chest = player.inventory.armorInventory[2];
        ItemStack head = player.inventory.armorInventory[3];

        if (boots != null && pants != null && chest != null)
            if (boots.getItem() == ModDCCostumes.batmanBlueBoots && pants.getItem() == ModDCCostumes.batmanBluePants && chest.getItem() == ModDCCostumes.batmanBlueChest && head.getItem() == ModDCCostumes.batmanBlueHead)
            {

            }
    }
}
