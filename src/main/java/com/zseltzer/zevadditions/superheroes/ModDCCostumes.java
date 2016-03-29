package com.zseltzer.zevadditions.superheroes;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.superheroes.costumes.ItemAquamanCostume;
import com.zseltzer.zevadditions.superheroes.costumes.ItemDrFateCostume;
import com.zseltzer.zevadditions.superheroes.costumes.ItemFlashCostume;
import com.zseltzer.zevadditions.superheroes.costumes.ItemGreenArrowCostume;
import com.zseltzer.zevadditions.superheroes.costumes.ItemGreenLanternCostume;
import com.zseltzer.zevadditions.superheroes.costumes.ItemShazamCostume;
import com.zseltzer.zevadditions.superheroes.costumes.ItemSpectreCostume;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModDCCostumes 
{	

/*
 
  THIS IS THE SECTION FOR DC COMICS
 	
 */
	
//FLASH COSTUME 	
	static ArmorMaterial FLASH_COSTUME = EnumHelper.addArmorMaterial
		("FLASH_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//DR FATE COSTUME	
	static ArmorMaterial DR_FATE_COSTUME = EnumHelper.addArmorMaterial
			("DR_FATE_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);

//GREEN LANTERN COSTUME	
	static ArmorMaterial GREEN_LANTERN_COSTUME = EnumHelper.addArmorMaterial
			("GREEN_LANTERN_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//GREEN ARROW COSTUME	
	static ArmorMaterial GREEN_ARROW_COSTUME = EnumHelper.addArmorMaterial
			("GREEN_ARROW_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);	

//SHAZAM COSTUME	
	static ArmorMaterial SHAZAM_COSTUME = EnumHelper.addArmorMaterial
			("SHAZAM_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//SPECTRE COSTUME	
	static ArmorMaterial SPECTRE_COSTUME = EnumHelper.addArmorMaterial
			("SPECTRE_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);	

//AQUAMAN COSTUME	
	static ArmorMaterial AQUAMAN_COSTUME = EnumHelper.addArmorMaterial
			("AQUMAN_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);		
			


//DC HERO COSTUMES DECLARATION
		

	//FLASH COSTUME SET	
		
	public static Item flashHead = new ItemFlashCostume(FLASH_COSTUME, 0, "flashHead");
	public static Item flashChest = new ItemFlashCostume(FLASH_COSTUME, 1, "flashChest");
	public static Item flashPants = new ItemFlashCostume(FLASH_COSTUME, 2, "flashPants");
	public static Item flashBoots = new ItemFlashCostume(FLASH_COSTUME, 3, "flashBoots");
	
	//DR FATE COSTUME SET
	
	public static Item drFateHead = new ItemDrFateCostume(DR_FATE_COSTUME, 0, "drFateHead");
	public static Item drFateChest = new ItemDrFateCostume(DR_FATE_COSTUME, 1, "drFateChest");
	public static Item drFatePants = new ItemDrFateCostume(DR_FATE_COSTUME, 2, "drFatePants");
	public static Item drFateBoots = new ItemDrFateCostume(DR_FATE_COSTUME, 3, "drFateBoots");
		
	//GREEN LANTERN COSTUME SET
	
	public static Item greenLanternHead = new ItemGreenLanternCostume(GREEN_LANTERN_COSTUME, 0, "greenLanternHead");
	public static Item greenLanternChest = new ItemGreenLanternCostume(GREEN_LANTERN_COSTUME, 1, "greenLanternChest");
	public static Item greenLanternPants = new ItemGreenLanternCostume(GREEN_LANTERN_COSTUME, 2, "greenLanternPants");
	public static Item greenLanternBoots = new ItemGreenLanternCostume(GREEN_LANTERN_COSTUME, 3, "greenLanternBoots");
	
	//GREEN ARROW COSTUME SET
	
	public static Item greenArrowHead = new ItemGreenArrowCostume(GREEN_ARROW_COSTUME, 0, "greenArrowHead");
	public static Item greenArrowChest = new ItemGreenArrowCostume(GREEN_ARROW_COSTUME, 1, "greenArrowChest");
	public static Item greenArrowPants = new ItemGreenArrowCostume(GREEN_ARROW_COSTUME, 2, "greenArrowPants");
	public static Item greenArrowBoots = new ItemGreenArrowCostume(GREEN_ARROW_COSTUME, 3, "greenArrowBoots");

	//SHAZAM COSTUME SET
	
	public static Item shazamHead = new ItemShazamCostume(SHAZAM_COSTUME, 0, "shazamHead");
	public static Item shazamChest = new ItemShazamCostume(SHAZAM_COSTUME, 1, "shazamChest");
	public static Item shazamPants = new ItemShazamCostume(SHAZAM_COSTUME, 2, "shazamPants");
	public static Item shazamBoots = new ItemShazamCostume(SHAZAM_COSTUME, 3, "shazamBoots");
	
	//SPECTRE COSTUME SET
	
	public static Item spectreHead = new ItemSpectreCostume(SPECTRE_COSTUME, 0, "spectreHead");
	public static Item spectreChest = new ItemSpectreCostume(SPECTRE_COSTUME, 1, "spectreChest");
	public static Item spectrePants = new ItemSpectreCostume(SPECTRE_COSTUME, 2, "spectrePants");
	public static Item spectreBoots = new ItemSpectreCostume(SPECTRE_COSTUME, 3, "spectreBoots");
	
	//AQUAMAN COSTUME SET
	
	public static Item aquamanHead = new ItemAquamanCostume(AQUAMAN_COSTUME, 0, "aquamanHead");
	public static Item aquamanChest = new ItemAquamanCostume(AQUAMAN_COSTUME, 1, "gaquamanChest");
	public static Item aquamanPants = new ItemAquamanCostume(AQUAMAN_COSTUME, 2, "aquamanPants");
	public static Item aquamanBoots = new ItemAquamanCostume(AQUAMAN_COSTUME, 3, "aquamanBoots");

	
public static void init()
{

//HERO COSTUME REGISTRY
		
	//FLASH COSTUME SET
		
		RegisterHelper.registerItem(flashHead);
		RegisterHelper.registerItem(flashChest);
		RegisterHelper.registerItem(flashPants);
		RegisterHelper.registerItem(flashBoots);
		
	//DR FATE COSTUME SET
		
		RegisterHelper.registerItem(drFateHead);
		RegisterHelper.registerItem(drFateChest);
		RegisterHelper.registerItem(drFatePants);
		RegisterHelper.registerItem(drFateBoots);
		
	//GREEN LANTERN COSTUME SET
		
		RegisterHelper.registerItem(greenLanternHead);
		RegisterHelper.registerItem(greenLanternChest);
		RegisterHelper.registerItem(greenLanternPants);
		RegisterHelper.registerItem(greenLanternBoots);
		
	//GREEN ARROW COSTUME SET
		
		RegisterHelper.registerItem(greenArrowHead);
		RegisterHelper.registerItem(greenArrowChest);
		RegisterHelper.registerItem(greenArrowPants);
		RegisterHelper.registerItem(greenArrowBoots);
		
	//SHAZAM COSTUME SET
		
		RegisterHelper.registerItem(shazamHead);
		RegisterHelper.registerItem(shazamChest);
		RegisterHelper.registerItem(shazamPants);
		RegisterHelper.registerItem(shazamBoots);
		
	//SPECTRE COSTUME SET
		
		RegisterHelper.registerItem(spectreHead);
		RegisterHelper.registerItem(spectreChest);
		RegisterHelper.registerItem(spectrePants);
		RegisterHelper.registerItem(spectreBoots);
		
	//AQUAMAN COSTUME SET
		
		RegisterHelper.registerItem(aquamanHead);
		RegisterHelper.registerItem(aquamanChest);
		RegisterHelper.registerItem(aquamanPants);
		RegisterHelper.registerItem(aquamanBoots);
		
}

}
