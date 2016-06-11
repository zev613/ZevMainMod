package com.zseltzer.zevadditions.world;

import java.util.Random;

import com.zseltzer.zevadditions.blocks.BlockBOPSapling;
import com.zseltzer.zevadditions.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenRedwoodTree extends WorldGenAbstractTree
{
    private final Block wood;
    private final Block leaves;

    private final int woodMeta;
    private final int leavesMeta;

    private final int minTreeHeight;
    private final int randomTreeHeight;

    public WorldGenRedwoodTree(Block wood, Block leaves, int woodMeta, int leavesMeta, boolean doBlockNotify, int minTreeHeight, int randomTreeHeight)
    {
        super(doBlockNotify);

        this.wood = wood;
        this.leaves = leaves;

        this.woodMeta = woodMeta;
        this.leavesMeta = leavesMeta;

        this.minTreeHeight = minTreeHeight;
        this.randomTreeHeight = randomTreeHeight;
    }

    @Override
    public boolean generate(World world, Random random, int x, int y, int z)
    {
        int l = random.nextInt(this.randomTreeHeight) + this.minTreeHeight;
        boolean flag = true;

        if (y >= 1 && y + l + 1 <= 256)
        {
            byte b0;
            int k1;
            Block block;

            for (int i1 = y; i1 <= y + 1 + l; ++i1)
            {
                b0 = 7;

                if (i1 == y)
                {
                    b0 = 7;
                }

                if (i1 >= y + 1 + l - 2)
                {
                    b0 = 8;
                }

                for (int j1 = x - b0; j1 <= x + b0 && flag; ++j1)
                {
                    for (k1 = z - b0; k1 <= z + b0 && flag; ++k1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                            block = world.getBlock(j1, i1, k1);

                            if (!this.isReplaceable(world, j1, i1, k1))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                boolean isSoil = true;
                boolean hasSpace = true;

                for (int ix = -3; ix <= 3; ix++)
                {
                    for (int iz = -3; iz <= 3; iz++)
                    {
                        Block block2 = world.getBlock(x + ix, y - 1, z + iz);

                        if (!block2.canSustainPlant(world, x + ix, y - 1, z + iz, ForgeDirection.UP, (BlockBOPSapling) ModBlocks.saplings))
                        {
                            isSoil = false;
                            break;
                        }
                    }
                }

                for (int ix = -3; ix <= 3; ix++)
                {
                    for (int iy = 0; iy <= l; iy++)
                    {
                        for (int iz = -3; iz <= 3; iz++)
                        {
                            Block block2 = world.getBlock(x + ix, y + iy, z + iz);

                            if (!block2.isAir(world, x + ix, y + iy, z + iz))
                            {
                                hasSpace = false;
                                break;
                            }
                        }
                    }
                }

                if (isSoil && hasSpace && y < 256 - l - 1)
                {
                    for (int ix = -3; ix <= 3; ix++)
                    {
                        for (int iz = -3; iz <= 3; iz++)
                        {
                            if (((ix != -3 && ix != 3) || (iz >= -1 && iz <= 1)) && ((iz != -3 && iz != 3) || (ix >= -1 && ix <= 1)))
                            {
                                Block block2 = world.getBlock(x + ix, y - 1, z + iz);

                                block2.onPlantGrow(world, x + ix, y - 1, z + iz, x + ix, y - 1, z + iz);
                            }
                        }
                    }

                    b0 = 9;
                    byte b1 = 0;
                    int l1;
                    int i2;
                    int j2;
                    int i3;

                    for (k1 = y - b0 + l; k1 <= y + l; ++k1)
                    {
                        i3 = k1 - (y + l);
                        l1 = b1 + 1 - i3 / 4;

                        for (i2 = x - l1; i2 <= x + l1; ++i2)
                        {
                            j2 = i2 - x;

                            for (int k2 = z - l1; k2 <= z + l1; ++k2)
                            {
                                int l2 = k2 - z;

                                if (Math.abs(j2) != l1 || Math.abs(l2) != l1 || random.nextInt(2) != 0 && i3 != 0)
                                {
                                    Block block1 = world.getBlock(i2, k1, k2);

                                    if (block1.isAir(world, i2, k1, k2) || block1.isLeaves(world, i2, k1, k2))
                                    {
                                        //TODO: setBlockAndMetadata()
                                        this.setBlockAndNotifyAdequately(world, i2, k1, k2, this.leaves, this.leavesMeta);
                                        this.setBlockAndNotifyAdequately(world, i2, k1 + 6, k2, this.leaves, this.leavesMeta);
                                        this.setBlockAndNotifyAdequately(world, i2, k1 + 10, k2, this.leaves, this.leavesMeta);
                                    }
                                }
                            }
                        }
                    }

                    for (k1 = 0; k1 < l; ++k1)
                    {
                        block = world.getBlock(x, y + k1, z);

                        if (block.isAir(world, x, y + k1, z) || block.isLeaves(world, x, y + k1, z))
                        {
                            //1
                            this.setBlockAndNotifyAdequately(world, x, y + (l), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (l + 1), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (l + 2), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (l + 3), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (l), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (l), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + k1, z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 1, y + k1, z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + k1, z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + k1, z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + k1, z + 1, this.wood, this.woodMeta);

                            //2
                            this.setBlockAndNotifyAdequately(world, x - 1, y + (k1 / 2), z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + (k1 / 2), z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 1, y + (k1 / 2), z + 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + (k1 / 2), z + 1, this.wood, this.woodMeta);

                            //3
                            this.setBlockAndNotifyAdequately(world, x - 2, y + (k1 / 4), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 2, y + (k1 / 4), z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 2, y + (k1 / 4), z + 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 2, y + (k1 / 4), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 2, y + (k1 / 4), z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 2, y + (k1 / 4), z + 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (k1 / 4), z - 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 1, y + (k1 / 4), z - 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + (k1 / 4), z - 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (k1 / 4), z + 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 1, y + (k1 / 4), z + 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + (k1 / 4), z + 2, this.wood, this.woodMeta);

                            //4
                            this.setBlockAndNotifyAdequately(world, x - 2, y + (k1 / 6), z - 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 2, y + (k1 / 6), z + 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 2, y + (k1 / 6), z - 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 2, y + (k1 / 6), z + 2, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 3, y + (k1 / 6), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 3, y + (k1 / 6), z, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (k1 / 6), z - 3, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x, y + (k1 / 6), z + 3, this.wood, this.woodMeta);

                            //5
                            this.setBlockAndNotifyAdequately(world, x - 3, y + (k1 / 8), z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 3, y + (k1 / 8), z + 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 3, y + (k1 / 8), z - 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 3, y + (k1 / 8), z + 1, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 1, y + (k1 / 8), z - 3, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + (k1 / 8), z - 3, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x - 1, y + (k1 / 8), z + 3, this.wood, this.woodMeta);
                            this.setBlockAndNotifyAdequately(world, x + 1, y + (k1 / 8), z + 3, this.wood, this.woodMeta);
                        }
                    }

                    for (int i = 0; i < 90; ++i)
                    {
                        int randX = x - random.nextInt(8) + random.nextInt(8);
                        int randY = y + random.nextInt(64);
                        int randZ = z - random.nextInt(8) + random.nextInt(8);
                        new WorldGenBOPShrub(ModBlocks.logs, ModBlocks.leaves, 0, 0, ModBlocks.logs).generate(world, random, randX, randY, randZ);
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}