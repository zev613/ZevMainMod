package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class ZevBlockSlab extends BlockSlab 
{
    
     //The unlocalized name.
     
    public static String NAME;

     //Hardness value for the material.
     
    private static final float HARDNESS = 2.0f;

     //Resistance value for the material.
    
    private static final float RESISTANCE = 10.0f;

    public static boolean STACKED;
    
     //Initializes a new instance of the BlockStainedBrickSlab class.
     //@param stacked set to true if stacked double.
     //@param brickColor the color of the stain from 0-15.
     
    public ZevBlockSlab(final boolean stacked, final String unlocalizedName) 
    {
        super(stacked, Material.rock);
        this.NAME = unlocalizedName;
   	 		//System.out.println("The unlocalizedName is: " + NAME);
        this.useNeighborBrightness = !stacked;
        setHardness(HARDNESS);
        setResistance(RESISTANCE);
        setStepSound(soundTypeStone);
        this.setBlockTextureName("zevadditions:" + unlocalizedName);
        if (stacked == false) 
        {
            setCreativeTab(ModTabs.tabNewSlabs);
            setBlockName(unlocalizedName + "_Slab");
       	 	this.STACKED = false;
            //System.out.println("The current textureName for this inst. is: " + getTextureName());
       	 	//System.out.println("If that result, " + getTextureName() + "   Is the same as this: " + NAME + "_Slab  , then it worked right.");
        }
        else if(stacked == true)
        {
            setBlockName(unlocalizedName + "_DoubleSlab");
            setCreativeTab(null);
            this.STACKED = true;
       	 	//System.out.println("The current textureName for this inst. is: " + getTextureName());
       	 	//System.out.println("If that result, " + getTextureName() + "   Is the same as this: " + NAME + "_Double_Slab  , then it worked right.");
        }
    }

     //Gets the ID for the game registry.
     //@return the unique id for the registry.
     
    public final String getId() 
    {
        String result = "";
        if (this.STACKED == true) 
        {
            result = "_Double";
            return getUnlocalizedName() + result + "_Slab";
        }
        else
        {
            return getUnlocalizedName() + result + "_Slab";
        }

    }

     //Gets the unlocalized name based on metadata/damage.
     //@param metadata block metadata.
     //@return the unlocalized name.
     
    @Override
    public final String func_150002_b(final int metadata) 
    {
        return this.getUnlocalizedName();
    }

    
     //Helper to get if the slab is stacked.
     //@return true if stacked.
     
    protected final boolean isStacked() 
    {
        return this.field_150004_a;
    }
}
