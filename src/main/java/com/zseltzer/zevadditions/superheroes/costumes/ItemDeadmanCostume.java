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

public class ItemDeadmanCostume extends ItemArmor 
{
	public String textureName = "deadman";

	 public ItemDeadmanCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.deadmanHead || stack.getItem() == ModDCCostumes.deadmanChest || stack.getItem() == ModDCCostumes.deadmanBoots)
			{
				return Reference.MODID + ":textures/models/deadman_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.deadmanPants)
			{
				return Reference.MODID + ":textures/models/deadman_2.png";
			}
			else
			{
				return null;
			}	
		}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (itemStack.getItem().equals(ModDCCostumes.deadmanPants) && itemStack.getItem().equals(ModDCCostumes.deadmanHead) && itemStack.getItem().equals(ModDCCostumes.deadmanChest) && itemStack.getItem().equals(ModDCCostumes.deadmanBoots))
		{

                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0F;
            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 10, 5));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10, 4));
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 3));
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 1));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 5));

        }
		else
		{
                player.capabilities.allowFlying = false;
                player.fallDistance = 2.0F;
            player.removePotionEffect(Potion.invisibility.id);
			player.removePotionEffect(Potion.nightVision.id);
            player.removePotionEffect(Potion.regeneration.id);
            player.removePotionEffect(Potion.moveSpeed.id);
            player.removePotionEffect(Potion.resistance.id);

		}
	}
}
