package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKidFlashCostume extends ItemArmor 
{
	public String textureName = "kidFlash";

	 public ItemKidFlashCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.kidFlashHead || stack.getItem() == ModDCCostumes.kidFlashChest || stack.getItem() == ModDCCostumes.kidFlashBoots)
			{
				return Reference.MODID + ":textures/models/kidFlash_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.kidFlashPants)
			{
				return Reference.MODID + ":textures/models/kidFlash_2.png";
			}
			else
			{
				return null;
			}	
		}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		if (itemStack.getItem().equals(ModDCCostumes.kidFlashPants))
			player.fallDistance = 1.4F;
		//player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 75));
		if (player.isSprinting())
		{
			player.capabilities.setPlayerWalkSpeed(0.3F);
			player.stepHeight = 1.1F;
			player.jumpMovementFactor = 0.3F;
		}
		else
		{
			player.capabilities.setPlayerWalkSpeed(0.1f);
			player.stepHeight = 0.6F;
			player.jumpMovementFactor = 0.1F;
		}
	}
}
