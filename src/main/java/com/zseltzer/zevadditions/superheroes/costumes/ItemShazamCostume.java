package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.commands.CommandNewShazam;
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

public class ItemShazamCostume extends ItemArmor 
{
	public String textureName = "shazam";

	 public ItemShazamCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModDCCostumes.shazamHead || stack.getItem() == ModDCCostumes.shazamChest || stack.getItem() == ModDCCostumes.shazamBoots)
			{
				return Reference.MODID + ":textures/models/shazam_1.png";
			}
			else if (stack.getItem() == ModDCCostumes.shazamPants)
			{
				return Reference.MODID + ":textures/models/shazam_2.png";
			}
			else
			{
				return null;
			}	
		}

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
        if (CommandNewShazam.isPlayerShazam && CommandNewShazam.shazamCommandActivated)
        {
            player.capabilities.allowFlying = true;
			//player.fallDistance = 0.0F;
            //player.capabilities.setFlySpeed(0.3F);
            //player.capabilities.setPlayerWalkSpeed(0.2F);
            //player.setHealth(player.getMaxHealth() + 3.0F);
                player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 15, 1, false));
                player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 15, 1, false));
                player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 15, 1, false));
                player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 15, 1, false));
                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 15, 1, false));
            //player.jumpMovementFactor = 0.2F;
        }
    }
}