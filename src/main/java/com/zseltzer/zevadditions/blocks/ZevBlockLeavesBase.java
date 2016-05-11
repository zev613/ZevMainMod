package com.zseltzer.zevadditions.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
/*
public class ZevBlockLeavesBase extends Block
{
    boolean leavesBaseArray1;
    //field_150121_P

    ZevBlockLeavesBase(Material material, boolean bool)
    {
        super(material);
        this.leavesBaseArray1 = bool;
    }

     //Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     //adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.

    public boolean isOpaqueCube()
    {
        return false;
    }

     //Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     //coordinates.  Args: blockAccess, x, y, z, side

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
        Block block = blockAccess.getBlock(x, y, z);
        return !(!this.leavesBaseArray1 && block == this) && super.shouldSideBeRendered(blockAccess, x, y, z, side);
    }
}
*/