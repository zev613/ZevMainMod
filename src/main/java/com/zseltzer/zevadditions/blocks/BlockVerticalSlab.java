package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockVerticalSlab extends Block
{
    /**
     * The unlocalized name.
     */
    public static String NAME;

    /**
     * Hardness value for the material.
     */
    private static final float HARDNESS = 2.0f;

    /**
     * Resistance value for the material.
     */
    private static final float RESISTANCE = 10.0f;

    /**
     * Initializes a new instance of the BlockStainedBrickSlab class.
     * @param stacked set to true if stacked double.
     * @param brickColor the color of the stain from 0-15.
     */
    public BlockVerticalSlab(final String unlocalizedName) 
    {
        super(Material.rock);
        this.NAME = unlocalizedName;   	 	
        this.useNeighborBrightness = true;
        this.setHardness(HARDNESS);
        this.setResistance(RESISTANCE);
        setStepSound(soundTypeStone);
        this.setBlockTextureName("zevadditions:smoothStone");
        this.opaque = false;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
        this.setCreativeTab(ModTabs.tabMassBlocks);
        this.setLightOpacity(255);
        /*
        if (!stacked) 
        {
            setCreativeTab(ModTabs.tabNewSlabs);
            setBlockName(NAME + "_Slab");
            setBlockTextureName(
                    Reference.MODID +":" + NAME);
            
       	 	System.out.println("The current textureName for this inst. is: " + getTextureName());
       	 	System.out.println("If that result, " + getTextureName() + "   Is the same as this: " + NAME + "_Slab  , then it worked right.");
        }
        else if(stacked)
        {
            setBlockName(NAME + "_Double_Slab");
            setCreativeTab(null);
            setBlockTextureName(
            		Reference.MODID +":" + NAME);
            
       	 	System.out.println("The current textureName for this inst. is: " + getTextureName());
       	 	System.out.println("If that result, " + getTextureName() + "   Is the same as this: " + NAME + "_Double_Slab  , then it worked right.");
        }
        */
    }
}
