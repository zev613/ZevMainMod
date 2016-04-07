package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.commands.CommandBlackAdam;
import com.zseltzer.zevadditions.commands.CommandShazam;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBlackAdamCostume extends ItemArmor 
{
	public String textureName = "blackAdam";

	 public ItemBlackAdamCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.blackAdamHead || stack.getItem() == ModDCCostumes.blackAdamChest || stack.getItem() == ModDCCostumes.blackAdamBoots)
			{
				return Reference.MODID + ":textures/models/blackAdam_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.blackAdamPants)
			{
				return Reference.MODID + ":textures/models/blackAdam_2.png";
			}
			else
			{
				return null;
			}	
		}

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (CommandBlackAdam.blackAdamChangeActivated== false && itemStack.getItem().equals(ModDCCostumes.blackAdamHead) && itemStack.getItem().equals(ModDCCostumes.blackAdamChest) && itemStack.getItem().equals(ModDCCostumes.blackAdamPants) && itemStack.getItem().equals(ModDCCostumes.blackAdamBoots))
        {
            CommandBlackAdam.isPlayerBlackAdam = true;
            player.capabilities.allowFlying = true;
            player.fallDistance = 0.0F;
            player.capabilities.setFlySpeed(0.4F);
            player.capabilities.setPlayerWalkSpeed(0.3F);
            player.setHealth(player.getMaxHealth() + 6.0F);
            player.jumpMovementFactor = 0.3F;
            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 15, 2, false));
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 15, 2, false));
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 15, 2, false));
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 15, 2, false));
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 15, 2, false));
            player.addPotionEffect(new PotionEffect(Potion.resistance.id, 15, 2, false));
        }
        else
        {
            CommandShazam.isPlayerBlackAdam = false;
            player.capabilities.allowFlying = false;
            player.fallDistance = 2.0F;
            player.setHealth(player.getMaxHealth());
            player.capabilities.setFlySpeed(0.1F);
            player.capabilities.setPlayerWalkSpeed(0.1F);
            player.jumpMovementFactor = 0.1F;
        }
    }
}
