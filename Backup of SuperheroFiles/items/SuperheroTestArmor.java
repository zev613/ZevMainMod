package com.zseltzer.zevadditions.items;


import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.init.ModArmory;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SuperheroTestArmor extends ItemArmor
{
	
	//public static String simpleHeroName = "flash"; 
	public static String SIMPLENAME = CommandChangeSuit.suitName;
	private static String NAME;
	
	//public static String suitName = "superSuitDefault";
    //public static String customTexture;
	
	 public SuperheroTestArmor( ArmorMaterial material, int ArmorType, String name) 
		{
			super(material, 0, ArmorType);
			setUnlocalizedName(name);
			NAME = name;
			setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(ModTabs.tabNewItems);
		}

@Override	 
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
		{
			if (stack.getItem() == ModArmory.superheroHead || stack.getItem() == ModArmory.superheroChest || stack.getItem() == ModArmory.superheroBoots)
			{
				return "zevadditions:textures/models/superheroSuits/" + CommandChangeSuit.suitName + "_layer_1.png";
			}
			else if (stack.getItem() == ModArmory.superheroPants)
			{
				return "zevadditions:textures/models/superheroSuits/" + CommandChangeSuit.suitName + "_layer_2.png";
			}
			else
			{
				return null;
			}	
		}
/*
public static void getSimpleHeroName()
{
	if (CommandChangeSuit.suitName == "antman" ||CommandChangeSuit.suitName == "antman2" || CommandChangeSuit.suitName == "antman3" || CommandChangeSuit.suitName == "antmanClassic")
	{
		simpleHeroName = "antman";
	}
*/
		/*
	switch (CommandChangeSuit.suitName)
	{
		case "angel": simpleHeroName = "angel"; break;
		case "angelNew": simpleHeroName = "angel"; break;
		case "antman": simpleHeroName = "antman"; break;
		case "antman2": simpleHeroName = "antman"; break;
		case "antman3": simpleHeroName = "antman"; break;
		case "antmanClassic": simpleHeroName = "antman"; break;
		case "aquaman": simpleHeroName = "aquaman"; break;
		case "arkhamKnight": simpleHeroName = "redHood"; break;
		case "arnimZola": simpleHeroName = "arnimZola"; break;
		case "arsenal": simpleHeroName = "redArrow"; break;
		case "arsenalCW": simpleHeroName = "redArrow"; break;
		case "ATOM": simpleHeroName = "atom"; break;
		case "azrael": simpleHeroName = "azrael"; break;
		case "baneKnightfall": simpleHeroName = "bane"; break;
		case "baronZemo": simpleHeroName = "baronZemo"; break;
		case "batman": simpleHeroName = "batman"; break;
		case "batman1989": simpleHeroName = "batman"; break;
		case "batmanAnimatedSeries": simpleHeroName = "batman"; break;
		case "batmanArkhamOriginsXE": simpleHeroName = "batman"; break;
		case "batmanArmored": simpleHeroName = "batman"; break;
		case "batmanDarkKnight": simpleHeroName = "batman"; break;
		case "batmanDarkKnightReturns": simpleHeroName = "batman"; break;
		case "batmanDawnOfJustice": simpleHeroName = "batman"; break;
		case "batmanFlashpoint": simpleHeroName = "batman"; break;
		case "batmanNew52": simpleHeroName = "batman"; break;
		case "batroc": simpleHeroName = "batroc"; break;
		case "beast": simpleHeroName = "beast"; break;
		case "beastNew": simpleHeroName = "beast"; break;
		case "beastBoy": simpleHeroName = "beastBoy"; break;
		case "betaRayBill": simpleHeroName = "thor"; break;
		case "bishop": simpleHeroName = "bishop"; break;
		case "bizarro": simpleHeroName = "superman"; break;
		case "blackAdam": simpleHeroName = "shazam"; break;
		case "blackAdam2": simpleHeroName = "shazam"; break;
		case "blackBolt": simpleHeroName = "blackBolt"; break;
		case "blackBolt2": simpleHeroName = "blackBolt"; break;
		case "blackCanary": simpleHeroName = "blackCanary"; break;
		case "blackCat": simpleHeroName = "blackCat"; break;
		case "blackFlash": simpleHeroName = "zoom"; break;
		case "blackLightning": simpleHeroName = "blackLightning"; break;
		case "blackMask": simpleHeroName = "blackMask"; break;
		case "blackPanther": simpleHeroName = "blackPanther"; break;
		case "blackPanther2": simpleHeroName = "blackPanther"; break;
		case "blackWidow": simpleHeroName = "blackWidow"; break;
		case "blueBeetle": simpleHeroName = "blueBeetle"; break;
		case "braniac": simpleHeroName = "braniac"; break;
		case "braniac2": simpleHeroName = "braniac"; break;
		case "bullseye": simpleHeroName = "bullseye"; break;
		case "flash": simpleHeroName = "flash"; break;
		case "flash2": simpleHeroName = "flash"; break;
		case "flash3": simpleHeroName = "flash"; break;
		case "flash4": simpleHeroName = "flash"; break;
		case "flash5": simpleHeroName = "flash"; break;
		case "flashBlueLantern": simpleHeroName = "flash"; break;
		case "flashCW": simpleHeroName = "flash"; break;
		case "flashCW2": simpleHeroName = "flash"; break;
		case "flashCW3": simpleHeroName = "flash"; break;
		case "flashCW4": simpleHeroName = "flash"; break;
		case "kidFlashNew52": simpleHeroName = "flash"; break;
		case "kidFlashYoungJustice": simpleHeroName = "flash"; break;
		case "ironMan2": simpleHeroName = "ironMan"; break;
		case "ironManNew": simpleHeroName = "ironMan"; break;
		case "ironManMark46": simpleHeroName = "ironMan"; break;
		case "ironManStarboost": simpleHeroName = "ironMan"; break;
		default: simpleHeroName = "genericHero"; break;
	}
}
*/

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		ItemStack head = player.getCurrentArmor(3);
		ItemStack chest = player.getCurrentArmor(2);
		ItemStack pants = player.getCurrentArmor(1);
		ItemStack boots = player.getCurrentArmor(0);
		
		if(SIMPLENAME == "flash" && boots.getItem() == ModArmory.superheroBoots)
			player.fallDistance = 0.5F;
			if (player.isSprinting()) 
			{
				player.capabilities.setPlayerWalkSpeed(0.3F);
				player.stepHeight = 1.1F;
				player.jumpMovementFactor = 0.2F;
			}
			else 
			{
				player.capabilities.setPlayerWalkSpeed(0.1f);
				player.stepHeight = 0.6F;
				player.jumpMovementFactor = 0.1F;
			}
			//SuperPowerEffects.flash();	
	//player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 100));	
	//player.stepHeight = 1.1F;
	//player.jumpMovementFactor = 0.2F;
			/*
			if (player.posY == player.prevPosY)
			{
				player.noClip = true;
			}
			else 
			{
				player.noClip = false;
			}
			*/
	/*
	if (CommandChangeSuit.suitName == "antman" && itemStack.getItem().equals(ModArmory.superheroChest))    
		//SuperPowerEffects.antman();
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 100));	
			player.jumpMovementFactor = 0.2F;
			//player.jumpMovementFactor = player.jumpMovementFactor / 2;
			player.stepHeight = 0.26F;
			//player.height = 0.5F;
			//player.width = 0.5F;
			player.height = player.height / 2;
			player.width = player.width / 2;
			player.boundingBox.maxY = player.getBoundingBox().maxY /2;
			//player.boundingBox.maxY = player.getBoundingBox().minY + (player.height);
			player.eyeHeight = player.getDefaultEyeHeight() / 2;
			player.noClip = false;
			player.fallDistance = player.fallDistance * 2;

			player.height = player.height / 2;
			player.width = player.width / 2;
			player.boundingBox.maxY = player.boundingBox.minY + (player.height);
			player.eyeHeight = player.getEyeHeight() / 2; 
			player.jumpMovementFactor = player.jumpMovementFactor / 2;
			player.stepHeight = ((player.stepHeight - 0.1F) / 2) + 0.1F;
		*/
/*
	switch (simpleHeroName)
	{
		case "flash":  
			if (itemStack.getItem().equals(ModArmory.superheroBoots))
			    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 70));;
			    player.stepHeight = 1.1F;
			break;
		default: 
				System.out.println("No potion effects.");
			break;
	}
		 */
	/*
	if (CommandChangeSuit.suitName == "theFlash" || CommandChangeSuit.suitName == "theFlash6" || CommandChangeSuit.suitName == "theFlashShaded" || CommandChangeSuit.suitName == "theFlashShaded2" || CommandChangeSuit.suitName == "theFlashShaded")
	if (itemStack.getItem().equals(ModArmory.superheroBoots))
	    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 70));
 	*/     
	}
}