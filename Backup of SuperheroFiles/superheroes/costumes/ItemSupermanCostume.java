package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSupermanCostume extends ItemArmor 
{
	public String textureName = "superman";

    public static boolean isPlayerSuperman = false;

	 public ItemSupermanCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
            super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.supermanHead || stack.getItem() == ModDCCostumes.supermanChest || stack.getItem() == ModDCCostumes.supermanBoots)
			{
				return Reference.MODID + ":textures/models/superman_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.supermanPants)
			{
				return Reference.MODID + ":textures/models/superman_2.png";
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

            if(boots != null && pants != null && chest != null)
                if(boots.getItem() == ModDCCostumes.supermanBoots && pants.getItem() == ModDCCostumes.supermanPants && chest.getItem() == ModDCCostumes.supermanChest && head.getItem() == ModDCCostumes.supermanHead)
            {
                    isPlayerSuperman = true;
                player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
                player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0F;
                player.jumpMovementFactor = 0.3F;
                player.capabilities.setPlayerWalkSpeed(0.2F);
                player.capabilities.setFlySpeed(0.3F);

            }
            else
            {
               isPlayerSuperman = false;
                player.capabilities.allowFlying = false;
                player.fallDistance = 2.0F;
                player.capabilities.setPlayerWalkSpeed(0.1F);
                player.capabilities.setFlySpeed(0.1F);
                player.removePotionEffect(Potion.jump.id);
                player.removePotionEffect(Potion.resistance.id);
                player.removePotionEffect(Potion.fireResistance.id);
                player.removePotionEffect(Potion.waterBreathing.id);
                player.removePotionEffect(Potion.damageBoost.id);
                player.removePotionEffect(Potion.moveSpeed.id);
                player.removePotionEffect(Potion.regeneration.id);
            }
        }

}
