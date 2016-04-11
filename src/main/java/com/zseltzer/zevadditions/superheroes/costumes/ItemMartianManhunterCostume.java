package com.zseltzer.zevadditions.superheroes.costumes;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemMartianManhunterCostume extends ItemArmor 
{
	public String textureName = "martianManhunter";

    public static boolean keyInvisIsPressed = false;

	public static boolean keyIntangIsPressed = false;

	public static boolean INVISIBLE = false;

	public static boolean INTANGIBLE = false;

    public static boolean isPlayerMartian = false;

    public static boolean martianOnFire = false;

	public ItemMartianManhunterCostume( ArmorMaterial material, int ArmorType, String unlocalizedName)
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(unlocalizedName);
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabHeroCostumes);
		}
	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
			if (stack.getItem() == ModDCCostumes.martianManhunterHead || stack.getItem() == ModDCCostumes.martianManhunterChest || stack.getItem() == ModDCCostumes.martianManhunterBoots)
            {
				return Reference.MODID + ":textures/models/martianManhunter_1.png";
			} else if (stack.getItem() == ModDCCostumes.martianManhunterPants)
            {
				return Reference.MODID + ":textures/models/martianManhunter_2.png";
			} else
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
            if (boots.getItem() == ModDCCostumes.martianManhunterBoots && pants.getItem() == ModDCCostumes.martianManhunterPants && chest.getItem() == ModDCCostumes.martianManhunterChest && head.getItem() == ModDCCostumes.martianManhunterHead)
            {
                isPlayerMartian = true;
                player.capabilities.allowFlying = true;
                player.jumpMovementFactor = 0.2F;
                player.fallDistance = 0.0F;
                player.addPotionEffect(new PotionEffect(Potion.jump.id, 10, 2));
                player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 10, 2));
                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 2));
                player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 10, 2));
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 2));
                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 2));
            }

            if (isPlayerMartian && keyInvisIsPressed)
            {
                player.setInvisible(true);
                INVISIBLE = true;
            }

            if (isPlayerMartian && !keyInvisIsPressed)
            {
                player.setInvisible(false);
                INVISIBLE = false;
            }

            if (isPlayerMartian && keyIntangIsPressed && INVISIBLE && keyInvisIsPressed)
            {
                player.noClip = true;
                INTANGIBLE = true;
            }

            if (isPlayerMartian && !keyIntangIsPressed)
            {
                player.noClip = false;
                INTANGIBLE = false;
            }

            if (isPlayerMartian && player.isBurning())
            {
                martianOnFire = true;
                player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 1));
                player.addPotionEffect(new PotionEffect(Potion.weakness.id, 10, 1));
                player.addPotionEffect(new PotionEffect(Potion.harm.id, 10, 1));
            }

            if (isPlayerMartian && !player.isBurning())
            {
                martianOnFire = false;
                player.removePotionEffect(Potion.moveSlowdown.id);
                player.removePotionEffect(Potion.weakness.id);
                player.removePotionEffect(Potion.harm.id);

            }
    }
}
