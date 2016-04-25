package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGreenLanternCostume extends ItemArmor 
{
	public String textureName = "greenLantern";

	 public ItemGreenLanternCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) {
         super(material, 0, ArmorType);
         setUnlocalizedName(unlocalizedName);
         setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
         setCreativeTab(ModTabs.tabHeroCostumes);
     }
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.greenLanternHead || stack.getItem() == ModDCCostumes.greenLanternChest || stack.getItem() == ModDCCostumes.greenLanternBoots)
			{
				return Reference.MODID + ":textures/models/greenLantern_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.flashPants)
			{
				return Reference.MODID + ":textures/models/greenLantern_2.png";
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
			if (boots.getItem() == ModDCCostumes.greenLanternBoots && pants.getItem() == ModDCCostumes.greenLanternPants && chest.getItem() == ModDCCostumes.greenLanternChest && head.getItem() == ModDCCostumes.greenLanternHead)
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