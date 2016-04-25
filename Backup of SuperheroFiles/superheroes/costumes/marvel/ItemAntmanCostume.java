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

public class ItemAntmanCostume extends ItemArmor 
{
	public String textureName = "antman";

	 public ItemAntmanCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.antmanHead || stack.getItem() == ModMarvelCostumes.antmanChest || stack.getItem() == ModMarvelCostumes.antmanBoots)
			{
				return Reference.MODID + ":textures/models/antman_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.antmanPants)
			{
				return Reference.MODID + ":textures/models/antman_2.png";
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
			if (boots.getItem() == ModMarvelCostumes.antmanBoots && pants.getItem() == ModMarvelCostumes.antmanPants && chest.getItem() == ModMarvelCostumes.antmanChest && head.getItem() == ModMarvelCostumes.antmanHead) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 100));
				player.jumpMovementFactor = 0.2F;
				//player.jumpMovementFactor = player.jumpMovementFactor / 2;
				player.stepHeight = 0.26F;
				//player.height = 0.5F;
				//player.width = 0.5F;
				player.height = player.height / 2;
				player.width = player.width / 2;
				//player.boundingBox.maxY = player.getBoundingBox().minY + (player.height);
				player.eyeHeight = player.getDefaultEyeHeight() / 2;
				player.noClip = false;
				player.fallDistance = player.fallDistance * 2;
			}
	}
}
