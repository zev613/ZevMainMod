package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlueLanternCostume extends ItemArmor 
{
	public String textureName = "blueLantern";

	 public ItemBlueLanternCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.blueLanternHead || stack.getItem() == ModDCCostumes.blueLanternChest || stack.getItem() == ModDCCostumes.blueLanternBoots)
			{
				return Reference.MODID + ":textures/models/blueLantern_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.blueLanternPants)
			{
				return Reference.MODID + ":textures/models/blueLantern_2.png";
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
			if (boots.getItem() == ModDCCostumes.blueLanternBoots && pants.getItem() == ModDCCostumes.blueLanternPants && chest.getItem() == ModDCCostumes.blueLanternChest && head.getItem() == ModDCCostumes.blueLanternHead)
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
