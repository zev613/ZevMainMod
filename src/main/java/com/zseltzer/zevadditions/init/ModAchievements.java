package com.zseltzer.zevadditions.init;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievements
{
    public static Achievement craftSapphire;
    public static Achievement pickupSecond;
    public static Achievement smeltRubyIngot;
    public static Achievement dropItem;

    public static AchievementPage zevPage;

    public static void init()
    {
        craftSapphire = new Achievement("", "CraftSapphire", 0, 0, ModArmory.sapphireHelmet, null);

        pickupSecond = new Achievement("", "PickupSecond", 2, 2, ModItems.amethystIngot, craftSapphire);

        smeltRubyIngot = new Achievement("", "SmeltRubyIngot", 2, 0, ModItems.rubyIngot, craftSapphire);

        dropItem = new Achievement("", "dropItem", 4, 0, Items.arrow, null);

        zevPage = new AchievementPage("ZevAdditions Achievements", craftSapphire, smeltRubyIngot, pickupSecond, dropItem);
        AchievementPage.registerAchievementPage(zevPage);

        /*
            = new Achievement("string", "string", int, int, Item, Achievement);
         First String is only for advanced Achievements.
         First two ints determine where on Achievement Page, requires some tinkering to get in right place.
         (0,0) will place the Achievement directly on Top of "Taking Inventory"
         Item afterwards is for what icon it will have on the Achievement Page.
         */
    }
}