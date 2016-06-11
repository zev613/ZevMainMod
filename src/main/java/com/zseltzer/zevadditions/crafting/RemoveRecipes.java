package com.zseltzer.zevadditions.crafting;

import com.zseltzer.zevadditions.init.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/*
public class RemoveRecipes
{
    //public static ItemStack purpleDye = new ItemStack(Items.dye, 2, 5);
    public static void removeRecipe()
    {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> remover = recipes.iterator();

            while(remover.hasNext())
            {
                ItemStack itemstack = remover.next().getRecipeOutput();
                if (itemstack != null && itemstack.getItem() == Items.book)
                    remover.remove();
            }
    }
}
*/