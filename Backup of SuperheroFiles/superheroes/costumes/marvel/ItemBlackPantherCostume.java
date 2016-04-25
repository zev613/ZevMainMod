package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBlackPantherCostume extends ItemArmor 
{
	public String textureName = "blackPanther";

	 public ItemBlackPantherCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.blackPantherHead || stack.getItem() == ModMarvelCostumes.blackPantherChest || stack.getItem() == ModMarvelCostumes.blackPantherBoots)
			{
				return Reference.MODID + ":textures/models/blackPanther_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.blackPantherPants)
			{
				return Reference.MODID + ":textures/models/blackPanther_2.png";
			}
			else
			{
				return null;
			}	
		}

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);
        ItemStack boots = player.inventory.armorInventory[0];
        ItemStack pants = player.inventory.armorInventory[1];
        ItemStack chest = player.inventory.armorInventory[2];
        ItemStack head = player.inventory.armorInventory[3];

        if (boots != null && pants != null && chest != null)
            if (boots.getItem() == ModMarvelCostumes.blackPantherBoots && pants.getItem() == ModMarvelCostumes.blackPantherPants && chest.getItem() == ModMarvelCostumes.blackPantherChest && head.getItem() == ModMarvelCostumes.blackPantherHead)
            {
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 10, 2));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10, 2));
            }

		else
        {
			player.removePotionEffect(Potion.fireResistance.id);
			player.removePotionEffect(Potion.regeneration.id);
			player.removePotionEffect(Potion.jump.id);
			player.removePotionEffect(Potion.damageBoost.id);
			player.removePotionEffect(Potion.moveSpeed.id);
			player.removePotionEffect(Potion.resistance.id);
            player.removePotionEffect(Potion.nightVision.id);
        }
	}
}
