package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCaptainAmericaCostume extends ItemArmor 
{
	public String textureName = "captainAmerica";

	 public ItemCaptainAmericaCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.captainAmericaHead || stack.getItem() == ModMarvelCostumes.captainAmericaChest || stack.getItem() == ModMarvelCostumes.captainAmericaBoots)
			{
				return Reference.MODID + ":textures/models/captainAmerica_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.captainAmericaPants)
			{
				return Reference.MODID + ":textures/models/captainAmerica_2.png";
			}
			else
			{
				return null;
			}	
		}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (itemStack.getItem().equals(ModMarvelCostumes.captainAmericaPants) && itemStack.getItem().equals(ModMarvelCostumes.captainAmericaHead) && itemStack.getItem().equals(ModMarvelCostumes.captainAmericaChest) && itemStack.getItem().equals(ModMarvelCostumes.captainAmericaBoots))
		{

			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 2));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 3));
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 10, 2));
		}
		else
		{
			player.removePotionEffect(Potion.fireResistance.id);
			player.removePotionEffect(Potion.jump.id);
			player.removePotionEffect(Potion.damageBoost.id);
			player.removePotionEffect(Potion.moveSpeed.id);
			player.removePotionEffect(Potion.resistance.id);
		}
	}
}
