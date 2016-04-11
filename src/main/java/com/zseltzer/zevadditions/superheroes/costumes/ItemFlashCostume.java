package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Main;
import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModItems;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFlashCostume extends ItemArmor 
{
	public String textureName = "flash";

	 public ItemFlashCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.flashHead || stack.getItem() == ModDCCostumes.flashChest || stack.getItem() == ModDCCostumes.flashBoots)
			{
				return Reference.MODID + ":textures/models/flash_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.flashPants)
			{
				return Reference.MODID + ":textures/models/flash_2.png";
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
            if (boots.getItem() == ModDCCostumes.flashBoots && pants.getItem() == ModDCCostumes.flashPants && chest.getItem() == ModDCCostumes.flashChest && head.getItem() == ModDCCostumes.flashHead)
            {
                player.fallDistance = 1.5F;
			    player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 2));
			    player.addPotionEffect(new PotionEffect(Potion.jump.id, 10, 2));

			if (player.isSprinting())
            {
                player.capabilities.setPlayerWalkSpeed(0.6F);
                player.stepHeight = 1.1F;
                player.jumpMovementFactor = 0.3F;
            } else

            {
                player.capabilities.setPlayerWalkSpeed(0.1f);
                player.stepHeight = 0.6F;
                player.jumpMovementFactor = 0.1F;
            }
        }
	}
}