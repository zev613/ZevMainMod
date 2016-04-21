package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemReverseFlashCostume extends ItemArmor
{
    public String textureName = "reverseFlash";

    public ItemReverseFlashCostume( ArmorMaterial material, int ArmorType, String unlocalizedName)
    {
        super(material, 0, ArmorType);
        setUnlocalizedName(unlocalizedName);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(ModTabs.tabHeroCostumes);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if (stack.getItem() == ModDCCostumes.reverseFlashHead || stack.getItem() == ModDCCostumes.reverseFlashChest || stack.getItem() == ModDCCostumes.reverseFlashBoots)
        {
            return Reference.MODID + ":textures/models/reverseFlash_1.png";
        }
        else if (stack.getItem() == ModDCCostumes.reverseFlashPants)
        {
            return Reference.MODID + ":textures/models/reverseFlash_2.png";
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
        ItemStack boots = player.inventory.armorInventory[3];
        ItemStack pants = player.inventory.armorInventory[2];
        ItemStack chest = player.inventory.armorInventory[1];
        ItemStack head = player.inventory.armorInventory[0];

        if (boots != null && pants != null && chest != null)
            if (boots.getItem() == ModDCCostumes.reverseFlashBoots && pants.getItem() == ModDCCostumes.reverseFlashPants && chest.getItem() == ModDCCostumes.reverseFlashChest && head.getItem() == ModDCCostumes.reverseFlashHead)
            {
                player.fallDistance = 1.6F;
                if (player.isSprinting())
                {
                    player.capabilities.setPlayerWalkSpeed(0.6F);
                    player.stepHeight = 1.2F;
                    player.jumpMovementFactor = 0.4F;
                }
                else
                {
                    player.capabilities.setPlayerWalkSpeed(0.1f);
                    player.stepHeight = 0.6F;
                    player.jumpMovementFactor = 0.1F;
                }
            }
    }
}
