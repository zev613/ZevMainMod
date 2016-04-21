package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBoosterGoldCostume extends ItemArmor 
{
	public String textureName = "boosterGold";

	 public ItemBoosterGoldCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.boosterGoldHead || stack.getItem() == ModDCCostumes.boosterGoldChest || stack.getItem() == ModDCCostumes.boosterGoldBoots)
			{
				return Reference.MODID + ":textures/models/boosterGold_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.boosterGoldPants)
			{
				return Reference.MODID + ":textures/models/boosterGold_2.png";
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
			if (boots.getItem() == ModDCCostumes.boosterGoldBoots && pants.getItem() == ModDCCostumes.boosterGoldPants && chest.getItem() == ModDCCostumes.boosterGoldChest && head.getItem() == ModDCCostumes.boosterGoldHead)
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
