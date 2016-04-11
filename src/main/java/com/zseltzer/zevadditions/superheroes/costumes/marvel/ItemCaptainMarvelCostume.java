package com.zseltzer.zevadditions.superheroes.costumes.marvel;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.superheroes.ModMarvelCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCaptainMarvelCostume extends ItemArmor 
{
	public String textureName = "captainMarvel";

	 public ItemCaptainMarvelCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.captainMarvelHead || stack.getItem() == ModMarvelCostumes.captainMarvelChest || stack.getItem() == ModMarvelCostumes.captainMarvelBoots)
			{
				return Reference.MODID + ":textures/models/captainMarvel_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.captainMarvelPants)
			{
				return Reference.MODID + ":textures/models/captainMarvel_2.png";
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
			if (boots.getItem() == ModMarvelCostumes.captainMarvelBoots && pants.getItem() == ModMarvelCostumes.captainMarvelPants && chest.getItem() == ModMarvelCostumes.captainMarvelChest && head.getItem() == ModMarvelCostumes.captainMarvelHead)
            {
                player.capabilities.allowFlying = true;
                player.fallDistance = 0.0F;

            }
            else
            {
                player.capabilities.allowFlying = false;
                player.fallDistance = 2.0F;
            }
	}
}
