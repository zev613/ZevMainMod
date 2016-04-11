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

public class ItemWolverineCostume extends ItemArmor 
{
	public String textureName = "wolverine";

	 public ItemWolverineCostume( ArmorMaterial material, int ArmorType, String unlocalizedName) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModMarvelCostumes.wolverineHead || stack.getItem() == ModMarvelCostumes.wolverineChest || stack.getItem() == ModMarvelCostumes.wolverineBoots)
			{
				return Reference.MODID + ":textures/models/wolverine_1.png";
			}
			else if (stack.getItem() == ModMarvelCostumes.wolverinePants)
			{
				return Reference.MODID + ":textures/models/wolverine_2.png";
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
            if (boots.getItem() == ModMarvelCostumes.spidermanBoots && pants.getItem() == ModMarvelCostumes.spidermanPants && chest.getItem() == ModMarvelCostumes.spidermanChest && head.getItem() == ModMarvelCostumes.spidermanHead)
            {
			    player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 2));
			    player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 10, 2));
			    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 2));
			    player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 3));
			    player.addPotionEffect(new PotionEffect(Potion.jump.id, 10, 3));
			    player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10, 5));
		    }
		    else
		    {
			    player.removePotionEffect(Potion.fireResistance.id);
			    player.removePotionEffect(Potion.jump.id);
			    player.removePotionEffect(Potion.damageBoost.id);
			    player.removePotionEffect(Potion.moveSpeed.id);
			    player.removePotionEffect(Potion.resistance.id);
			    player.removePotionEffect(Potion.regeneration.id);
		    }
	}
}
