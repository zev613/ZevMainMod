package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModBlocks;
import com.zseltzer.zevadditions.init.ModItems;
import com.zseltzer.zevadditions.init.ModSlabs;
import com.zseltzer.zevadditions.init.ModStairs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class TreeRecipes
{
    public static void init()
    {
//Planks from Logs

        //Redwood
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 0), new ItemStack(ModBlocks.redwood_planks, 4));

        //Maple
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 1), new ItemStack(ModBlocks.maple_planks, 4));

        //Palm
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 2), new ItemStack(ModBlocks.palm_planks, 4));

        //Willow
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 3), new ItemStack(ModBlocks.willow_planks, 4));

        //Pine
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 4), new ItemStack(ModBlocks.pine_planks, 4));

        //Fir
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 5), new ItemStack(ModBlocks.fir_planks, 4));

        //Chestnut
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 6), new ItemStack(ModBlocks.chestnut_planks, 4));

        //Sequoia
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 7), new ItemStack(ModBlocks.sequoia_planks, 4));

        //Elm
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 8), new ItemStack(ModBlocks.elm_planks, 4));

        //Hickory
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 9), new ItemStack(ModBlocks.hickory_planks, 4));

        //Cedar
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 10), new ItemStack(ModBlocks.cedar_planks, 4));

        //Sycamore
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 11), new ItemStack(ModBlocks.sycamore_planks, 4));

        //Cypress
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 12), new ItemStack(ModBlocks.cypress_planks, 4));

        //Eucalyptus
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 13), new ItemStack(ModBlocks.eucalyptus_planks, 4));

        //Mahogany
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 14), new ItemStack(ModBlocks.mahogany_planks, 4));

        //Magnolia
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.logs, 1, 15), new ItemStack(ModBlocks.magnolia_planks, 4));

//Stairs from Planks, both directions

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.redwood_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.redwood_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.redwood_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.redwood_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.maple_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.maple_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.maple_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.maple_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.palm_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.palm_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.palm_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.palm_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.willow_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.willow_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.willow_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.willow_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.pine_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.pine_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.pine_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.pine_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.fir_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.fir_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.fir_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.fir_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.chestnut_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.chestnut_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.chestnut_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.chestnut_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.sequoia_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.sequoia_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.sequoia_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.sequoia_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.elm_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.elm_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.elm_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.elm_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.hickory_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.hickory_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.hickory_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.hickory_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.cedar_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.cedar_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.cedar_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.cedar_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.sycamore_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.sycamore_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.sycamore_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.sycamore_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.cypress_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.cypress_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.cypress_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.cypress_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.eucalyptus_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.eucalyptus_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.eucalyptus_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.eucalyptus_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.mahogany_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.mahogany_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.mahogany_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.mahogany_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.magnolia_planksStairs),
                "A  ",
                "AA ",
                "AAA",
                'A', ModBlocks.magnolia_planks);

        GameRegistry.addShapedRecipe(new ItemStack(ModStairs.magnolia_planksStairs),
                "  A",
                " AA",
                "AAA",
                'A', ModBlocks.magnolia_planks);
    }
}
