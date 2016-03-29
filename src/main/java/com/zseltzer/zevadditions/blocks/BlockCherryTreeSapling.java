package com.zseltzer.zevadditions.blocks;

import java.util.Random;

import com.zseltzer.zevadditions.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockCherryTreeSapling extends BlockBush 
{
	
	private static WorldGenerator tree;
	private static WorldGenerator treeBig;
	private static WorldGenerator effectTree;
	
	private static final int TYPES = 1;
	
    public BlockCherryTreeSapling(String name) 
    {
        super(Material.plants);
        float var3 = 0.4F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 2.0F, 0.5F + var3);
        this.setBlockName(name + "_sapling");
        this.setBlockTextureName("zevadditions:" + name + "_sapling");
        this.setCreativeTab(ModTabs.tabNewBlocks);
    }

	/**
     * Ticks the block if it's been scheduled
     */
    @Override
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (world.isRemote)
			return;

		if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0)
		{
			this.growTree(world, x, y, z, random);
		}
	}

	public void growTree(World world, int x, int y, int z, Random random)
	{
		int meta = world.getBlockMetadata(x, y, z) & TYPES;
		Object obj = null;
		int rnd = random.nextInt(10);

		if (obj == null) 
		{
			if (rnd < 5) 
			{
				obj = tree;
			}
			if (rnd >= 5) 
			{
				obj = treeBig;
			}
			if (rnd == 12) 
			{
				obj = effectTree;
			}
		}
		if (obj != null)
		{
			world.setBlockToAir(x, y, z);

			if (!((WorldGenerator) obj).generate(world, random, x, y, z))
			{
				world.setBlock(x, y, z, this, meta, 2);
			}
		}
	}

    /**
     * Attempts to grow a sapling into a tree
     */

    @Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer,
            int par6, float par7, float par8, float par9) 
    {
        ItemStack itemstack = par5EntityPlayer.inventory.getCurrentItem();
        if (itemstack != null && itemstack.getItem() == Items.dye) 
        {
            if (itemstack.getItemDamage() == 15) 
            {
                growTree(par1World, par2, par3, par4, par1World.rand);
                if (!par5EntityPlayer.capabilities.isCreativeMode) 
                {
                    itemstack.stackSize--;
                }
            }
        }
        super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
        return true;
    }

    @Override
    protected boolean canPlaceBlockOn(Block block) 
    {
        return block == Blocks.sand || block == Blocks.dirt || block == Blocks.grass;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    @Override
    public int damageDropped(int par1) 
    {
        return par1;
    }
}
