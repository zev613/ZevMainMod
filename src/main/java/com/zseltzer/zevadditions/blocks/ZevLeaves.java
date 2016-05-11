package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import java.util.ArrayList;
import java.util.Random;
/*
public abstract class ZevLeaves extends ZevBlockLeavesBase implements IShearable {
    int[] zevLeavesArray1;
    //field_150128_a

    @SideOnly(Side.CLIENT)
    int zevLeavesArray_2;
    //field_150127_b
    IIcon[][] numOfBlockLeaves = new IIcon[2][];

    public ZevLeaves()
    {
        super(Material.leaves, false);
        this.setTickRandomly(true);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGrass);
        this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

    //
    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = 0.5D;
        double d1 = 1.0D;
        return ColorizerFoliage.getFoliageColor(d0, d1);
    }
    //

     //Returns the color this block should be rendered. Used by leaves.

    //
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int colorNum)
    {
        return ColorizerFoliage.getFoliageColorBasic();
    }
    //

     //Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     //when first determining what to render.

    //
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess blockAccess, int num1, int num2, int num3)
    {
        int l = 0;
        int i1 = 0;
        int j1 = 0;

        for (int k1 = -1; k1 <= 1; ++k1)
        {
            for (int l1 = -1; l1 <= 1; ++l1)
            {
                int i2 = blockAccess.getBiomeGenForCoords(num1 + l1, num3 + k1).getBiomeFoliageColor(num1 + l1, num2, num3 + k1);
                l += (i2 & 16711680) >> 16;
                i1 += (i2 & 65280) >> 8;
                j1 += i2 & 255;
            }
        }

        return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
    }
    //
    public void breakBlock(World world, int num_1, int num_2, int num_3, Block block1, int num_4)
    {
        byte b0 = 1;
        int i1 = b0 + 1;

        if (world.checkChunksExist(num_1 - i1, num_2 - i1, num_3 - i1, num_1 + i1, num_2 + i1, num_3 + i1))
        {
            for (int j1 = -b0; j1 <= b0; ++j1)
            {
                for (int k1 = -b0; k1 <= b0; ++k1)
                {
                    for (int l1 = -b0; l1 <= b0; ++l1)
                    {
                        Block block = world.getBlock(num_1 + j1, num_2 + k1, num_3 + l1);
                        if (block.isLeaves(world, num_1 + j1, num_2 + k1, num_3 + l1))
                        {
                            block.beginLeavesDecay(world, num_1 + j1, num_2 + k1, num_3 + l1);
                        }
                    }
                }
            }
        }
    }

     //Ticks the block if it's been scheduled

    public void updateTick(World world, int updateNum1, int updateNum2, int updateNum3, Random rand)
    {
        if (!world.isRemote)
        {
            int l = world.getBlockMetadata(updateNum1, updateNum2, updateNum3);

            if ((l & 8) != 0 && (l & 4) == 0)
            {
                byte b0 = 4;
                int i1 = b0 + 1;
                byte b1 = 32;
                int j1 = b1 * b1;
                int k1 = b1 / 2;

                if (this.zevLeavesArray1 == null)
                {
                    this.zevLeavesArray1 = new int[b1 * b1 * b1];
                }

                int l1;

                if (world.checkChunksExist(updateNum1 - i1, updateNum2 - i1, updateNum3 - i1, updateNum1 + i1, updateNum2 + i1, updateNum3 + i1))
                {
                    int i2;
                    int j2;

                    for (l1 = -b0; l1 <= b0; ++l1)
                    {
                        for (i2 = -b0; i2 <= b0; ++i2)
                        {
                            for (j2 = -b0; j2 <= b0; ++j2)
                            {
                                Block block = world.getBlock(updateNum1 + l1, updateNum2 + i2, updateNum3 + j2);

                                if (!block.canSustainLeaves(world, updateNum1 + l1, updateNum2 + i2, updateNum3 + j2))
                                {
                                    if (block.isLeaves(world, updateNum1 + l1, updateNum2 + i2, updateNum3 + j2))
                                    {
                                        this.zevLeavesArray1[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -2;
                                    }
                                    else
                                    {
                                        this.zevLeavesArray1[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -1;
                                    }
                                }
                                else
                                {
                                    this.zevLeavesArray1[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = 0;
                                }
                            }
                        }
                    }

                    for (l1 = 1; l1 <= 4; ++l1)
                    {
                        for (i2 = -b0; i2 <= b0; ++i2)
                        {
                            for (j2 = -b0; j2 <= b0; ++j2)
                            {
                                for (int k2 = -b0; k2 <= b0; ++k2)
                                {
                                    if (this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1] == l1 - 1)
                                    {
                                        if (this.zevLeavesArray1[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
                                        {
                                            this.zevLeavesArray1[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.zevLeavesArray1[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
                                        {
                                            this.zevLeavesArray1[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] == -2)
                                        {
                                            this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] == -2)
                                        {
                                            this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] == -2)
                                        {
                                            this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] = l1;
                                        }

                                        if (this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] == -2)
                                        {
                                            this.zevLeavesArray1[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] = l1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                l1 = this.zevLeavesArray1[k1 * j1 + k1 * b1 + k1];

                if (l1 >= 0)
                {
                    world.setBlockMetadataWithNotify(updateNum1, updateNum2, updateNum3, l & -9, 4);
                }
                else
                {
                    this.removeLeaves(world, updateNum1, updateNum2, updateNum3);
                }
            }
        }
    }

     //A randomly called display update to be able to add particles or other items for display

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int displayNum1, int displayNum2, int displayNum3, Random rand)
    {
        if (world.canLightningStrikeAt(displayNum1, displayNum2 + 1, displayNum3) && !World.doesBlockHaveSolidTopSurface(world, displayNum1, displayNum2 - 1, displayNum3) && rand.nextInt(15) == 1)
        {
            double d0 = (double) ((float) displayNum1 + rand.nextFloat());
            double d1 = (double) displayNum2 - 0.05D;
            double d2 = (double) ((float) displayNum3 + rand.nextFloat());
            world.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

    private void removeLeaves(World world, int removeNum1, int removeNum2, int removeNum3)
    {
        this.dropBlockAsItem(world, removeNum1, removeNum2, removeNum3, world.getBlockMetadata(removeNum1, removeNum2, removeNum3), 0);
        world.setBlockToAir(removeNum1, removeNum2, removeNum3);
    }


     //Returns the quantity of items to drop on block destruction.

    public int quantityDropped(Random rand)
    {
        return rand.nextInt(20) == 0 ? 1 : 0;
    }

    public Item getItemDropped(int itemNum1, Random rand, int itemNum2)
    {
        return Item.getItemFromBlock(Blocks.sapling);
    }

     //Drops the block items with a specified chance of dropping the specified items

    public void dropBlockAsItemWithChance(World world, int dropNum1, int dropNum2, int dropNum3, int dropNum4, float dropFloat1, int dropNum5)
    {
        super.dropBlockAsItemWithChance(world, dropNum1, dropNum2, dropNum3, dropNum4, 1.0f, dropNum5);
    }

    protected void func_150124_c(World world, int num1, int num2, int num3, int num4, int num5)
    {
    }

    protected int func_150123_b(int num1)
    {
        return 20;
    }

     //Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     //block and l is the block's subtype/damage.

    public void harvestBlock(World world, EntityPlayer player, int harvestNum1, int harvestNum2, int harvestNum3, int harvestNum4)
    {
        {
            super.harvestBlock(world, player, harvestNum1, harvestNum2, harvestNum3, harvestNum4);
        }
    }

     //Determines the damage on the item the block drops. Used in cloth and wood.

    public int damageDropped(int damage)
    {
        return damage & 3;
    }

     //Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     //adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.

    public boolean isOpaqueCube()
    {
        return !this.leavesBaseArray1;
    }

     //Gets the block's texture. Args: side, meta

    @SideOnly(Side.CLIENT)
    public abstract IIcon getIcon(int side, int meta);

     //Pass true to draw this block using fancy graphics, or false for fast graphics.

    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean graphicBoolean)
    {
        this.leavesBaseArray1 = graphicBoolean;
        this.zevLeavesArray_2 = graphicBoolean ? 0 : 1;
    }

     //Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     //and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.

    protected ItemStack createStackedBlock(int NumOfStacked)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, NumOfStacked & 3);
    }

    public abstract String[] func_150125_e();

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }

    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {

        int i2 = world.getBlockMetadata(x, y, z);

        if ((i2 & 8) == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, i2 | 8, 4);
        }
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }

    @Override
    public boolean isLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }


    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        int chance = this.func_150123_b(metadata);

        if (fortune > 0)
        {
            chance -= 2 << fortune;
            if (chance < 10) chance = 10;
        }

        if (world.rand.nextInt(chance) == 0)
            ret.add(new ItemStack(this.getItemDropped(metadata, world.rand, fortune), 1, this.damageDropped(metadata)));

        chance = 200;
        if (fortune > 0)
        {
            chance -= 10 << fortune;
            if (chance < 40) chance = 40;
        }

        this.captureDrops(true);
        this.func_150124_c(world, x, y, z, metadata, chance); // Dammet mojang
        ret.addAll(this.captureDrops(false));
        return ret;
    }
}*/