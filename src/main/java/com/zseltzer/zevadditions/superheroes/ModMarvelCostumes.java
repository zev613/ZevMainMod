package com.zseltzer.zevadditions.superheroes;

import com.zseltzer.zevadditions.RegisterHelper;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemAntmanCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemBlackPantherCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemCaptainAmericaCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemCaptainMarvelCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemDaredevilCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemDeadpoolCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemMsMarvelCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemSpidermanCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemVisionCostume;
import com.zseltzer.zevadditions.superheroes.costumes.marvel.ItemWolverineCostume;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMarvelCostumes 
{	
	
//SPIDERMAN COSTUME 	
	static ArmorMaterial SPIDERMAN_COSTUME = EnumHelper.addArmorMaterial
		("SPIDERMAN_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//BLACK PANTHER COSTUME	
	static ArmorMaterial BLACK_PANTHER_COSTUME = EnumHelper.addArmorMaterial
			("BLACK_PANTHER_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);

//CAPTAIN AMERICA COSTUME	
	static ArmorMaterial CAPTAIN_AMERICA_COSTUME = EnumHelper.addArmorMaterial
			("CAPTAIN_AMERICA_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//ANT MAN COSTUME	
	static ArmorMaterial ANT_MAN_COSTUME = EnumHelper.addArmorMaterial
			("ANT_MAN_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);	

//VISION COSTUME	
	static ArmorMaterial VISION_COSTUME = EnumHelper.addArmorMaterial
			("VISION_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//DEADPOOL COSTUME	
	static ArmorMaterial DEADPOOL_COSTUME = EnumHelper.addArmorMaterial
			("DEADPOOL_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);	

//DAREDEVIL COSTUME	
	static ArmorMaterial DAREDEVIL_COSTUME = EnumHelper.addArmorMaterial
			("DAREDEVIL_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);		

//CAPTAIN MARVEL COSTUME	
	static ArmorMaterial CAPTAIN_MARVEL_COSTUME = EnumHelper.addArmorMaterial
			("CAPTAIN_MARVEL_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);	
	
//MS MARVEL COSTUME	
	static ArmorMaterial MS_MARVEL_COSTUME = EnumHelper.addArmorMaterial
			("MS_MARVEL_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//WOLVERINE COSTUME	
	static ArmorMaterial WOLVERINE_COSTUME = EnumHelper.addArmorMaterial
			("WOLVERINE_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
/*
//BEAST COSTUME	
	static ArmorMaterial BEAST_COSTUME = EnumHelper.addArmorMaterial
			("BEAST_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//STORM COSTUME	
	static ArmorMaterial STORM_COSTUME = EnumHelper.addArmorMaterial
			("STORM_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
	
//CYCLOPS COSTUME	
	static ArmorMaterial CYCLOPS_COSTUME = EnumHelper.addArmorMaterial
			("CYCLOPS_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);	
	
//NICK FURY COSTUME	
	static ArmorMaterial NICK_FURY_COSTUME = EnumHelper.addArmorMaterial
			("NICK_FURY_COSTUME", 20, new int[]{3, 7, 5, 2}, 14);
*/

//DC HERO COSTUMES DECLARATION
		
	//FLASH COSTUME SET	
		
	public static Item spidermanHead = new ItemSpidermanCostume(SPIDERMAN_COSTUME, 0, "spidermanHead");
	public static Item spidermanChest = new ItemSpidermanCostume(SPIDERMAN_COSTUME, 1, "spidermanChest");
	public static Item spidermanPants = new ItemSpidermanCostume(SPIDERMAN_COSTUME, 2, "spidermanPants");
	public static Item spidermanBoots = new ItemSpidermanCostume(SPIDERMAN_COSTUME, 3, "spidermanBoots");
	
	//DR FATE COSTUME SET
	
	public static Item blackPantherHead = new ItemBlackPantherCostume(BLACK_PANTHER_COSTUME, 0, "blackPantherHead");
	public static Item blackPantherChest = new ItemBlackPantherCostume(BLACK_PANTHER_COSTUME, 1, "blackPantherChest");
	public static Item blackPantherPants = new ItemBlackPantherCostume(BLACK_PANTHER_COSTUME, 2, "blackPantherPants");
	public static Item blackPantherBoots = new ItemBlackPantherCostume(BLACK_PANTHER_COSTUME, 3, "blackPantherBoots");
		
	//GREEN LANTERN COSTUME SET
	
	public static Item captainAmericaHead = new ItemCaptainAmericaCostume(CAPTAIN_AMERICA_COSTUME, 0, "captainAmericaHead");
	public static Item captainAmericaChest = new ItemCaptainAmericaCostume(CAPTAIN_AMERICA_COSTUME, 1, "captainAmericaChest");
	public static Item captainAmericaPants = new ItemCaptainAmericaCostume(CAPTAIN_AMERICA_COSTUME, 2, "captainAmericaPants");
	public static Item captainAmericaBoots = new ItemCaptainAmericaCostume(CAPTAIN_AMERICA_COSTUME, 3, "captainAmericaBoots");
	
	//GREEN ARROW COSTUME SET
	
	public static Item antmanHead = new ItemAntmanCostume(ANT_MAN_COSTUME, 0, "antmanHead");
	public static Item antmanChest = new ItemAntmanCostume(ANT_MAN_COSTUME, 1, "antmanChest");
	public static Item antmanPants = new ItemAntmanCostume(ANT_MAN_COSTUME, 2, "antmanPants");
	public static Item antmanBoots = new ItemAntmanCostume(ANT_MAN_COSTUME, 3, "antmanBoots");

	//VISION COSTUME SET
	
	public static Item visionHead = new ItemVisionCostume(VISION_COSTUME, 0, "visionHead");
	public static Item visionChest = new ItemVisionCostume(VISION_COSTUME, 1, "visionChest");
	public static Item visionPants = new ItemVisionCostume(VISION_COSTUME, 2, "visionPants");
	public static Item visionBoots = new ItemVisionCostume(VISION_COSTUME, 3, "visionBoots");
	
	//DEADPOOL COSTUME SET
	
	public static Item deadpoolHead = new ItemDeadpoolCostume(DEADPOOL_COSTUME, 0, "deadpoolHead");
	public static Item deadpoolChest = new ItemDeadpoolCostume(DEADPOOL_COSTUME, 1, "deadpoolChest");
	public static Item deadpoolPants = new ItemDeadpoolCostume(DEADPOOL_COSTUME, 2, "deadpoolPants");
	public static Item deadpoolBoots = new ItemDeadpoolCostume(DEADPOOL_COSTUME, 3, "deadpoolBoots");
	
	//DAREDEVIL COSTUME SET
	
	public static Item daredevilHead = new ItemDaredevilCostume(DAREDEVIL_COSTUME, 0, "daredevilHead");
	public static Item daredevilChest = new ItemDaredevilCostume(DAREDEVIL_COSTUME, 1, "daredevilChest");
	public static Item daredevilPants = new ItemDaredevilCostume(DAREDEVIL_COSTUME, 2, "daredevilPants");
	public static Item daredevilBoots = new ItemDaredevilCostume(DAREDEVIL_COSTUME, 3, "daredevilBoots");

	//CAPTAIN MARVEL COSTUME SET
	
		public static Item captainMarvelHead = new ItemCaptainMarvelCostume(CAPTAIN_MARVEL_COSTUME, 0, "captainMarvelHead");
		public static Item captainMarvelChest = new ItemCaptainMarvelCostume(CAPTAIN_MARVEL_COSTUME, 1, "captainMarvelChest");
		public static Item captainMarvelPants = new ItemCaptainMarvelCostume(CAPTAIN_MARVEL_COSTUME, 2, "captainMarvelPants");
		public static Item captainMarvelBoots = new ItemCaptainMarvelCostume(CAPTAIN_MARVEL_COSTUME, 3, "captainMarvelBoots");
	
	//MS MARVEL COSTUME SET
	
		public static Item msMarvelHead = new ItemMsMarvelCostume(MS_MARVEL_COSTUME, 0, "msMarvelHead");
		public static Item msMarvelChest = new ItemMsMarvelCostume(MS_MARVEL_COSTUME, 1, "msMarvelChest");
		public static Item msMarvelPants = new ItemMsMarvelCostume(MS_MARVEL_COSTUME, 2, "msMarvelPants");
		public static Item msMarvelBoots = new ItemMsMarvelCostume(MS_MARVEL_COSTUME, 3, "msMarvelBoots");
		
	//WOLVERINE COSTUME SET
		
		public static Item wolverineHead = new ItemWolverineCostume(WOLVERINE_COSTUME, 0, "wolverineHead");
		public static Item wolverineChest = new ItemWolverineCostume(WOLVERINE_COSTUME, 1, "wolverineChest");
		public static Item wolverinePants = new ItemWolverineCostume(WOLVERINE_COSTUME, 2, "wolverinePants");
		public static Item wolverineBoots = new ItemWolverineCostume(WOLVERINE_COSTUME, 3, "wolverineBoots");

	public static void init()
	{
		//HERO COSTUME REGISTRY
		
	//SPIDERMAN COSTUME SET
		
		RegisterHelper.registerItem(spidermanHead);
		RegisterHelper.registerItem(spidermanChest);
		RegisterHelper.registerItem(spidermanPants);
		RegisterHelper.registerItem(spidermanBoots);
		
	//BLACK PANTHER COSTUME SET
		
		RegisterHelper.registerItem(blackPantherHead);
		RegisterHelper.registerItem(blackPantherChest);
		RegisterHelper.registerItem(blackPantherPants);
		RegisterHelper.registerItem(blackPantherBoots);
		
	//CAPTAIN AMERICA COSTUME SET
		
		RegisterHelper.registerItem(captainAmericaHead);
		RegisterHelper.registerItem(captainAmericaChest);
		RegisterHelper.registerItem(captainAmericaPants);
		RegisterHelper.registerItem(captainAmericaBoots);
		
	//GREEN ARROW COSTUME SET
		
		RegisterHelper.registerItem(antmanHead);
		RegisterHelper.registerItem(antmanChest);
		RegisterHelper.registerItem(antmanPants);
		RegisterHelper.registerItem(antmanBoots);
		
	//VISION COSTUME SET
		
		RegisterHelper.registerItem(visionHead);
		RegisterHelper.registerItem(visionChest);
		RegisterHelper.registerItem(visionPants);
		RegisterHelper.registerItem(visionBoots);
		
	//DEADPOOL COSTUME SET
		
		RegisterHelper.registerItem(deadpoolHead);
		RegisterHelper.registerItem(deadpoolChest);
		RegisterHelper.registerItem(deadpoolPants);
		RegisterHelper.registerItem(deadpoolBoots);
		
	//DAREDEVIL COSTUME SET
		
		RegisterHelper.registerItem(daredevilHead);
		RegisterHelper.registerItem(daredevilChest);
		RegisterHelper.registerItem(daredevilPants);
		RegisterHelper.registerItem(daredevilBoots);
		
	//CAPTAIN MARVEL COSTUME SET
		
		RegisterHelper.registerItem(captainMarvelHead);
		RegisterHelper.registerItem(captainMarvelChest);
		RegisterHelper.registerItem(captainMarvelPants);
		RegisterHelper.registerItem(captainMarvelBoots);
	
		
	//MS MARVEL COSTUME SET
		
		RegisterHelper.registerItem(msMarvelHead);
		RegisterHelper.registerItem(msMarvelChest);
		RegisterHelper.registerItem(msMarvelPants);
		RegisterHelper.registerItem(msMarvelBoots);
		
	//WOLVERINE COSTUME SET
		
		RegisterHelper.registerItem(wolverineHead);
		RegisterHelper.registerItem(wolverineChest);
		RegisterHelper.registerItem(wolverinePants);
		RegisterHelper.registerItem(wolverineBoots);
	}
}
