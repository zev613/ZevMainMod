package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class StorageSidedBlock extends BlockRotatedPillar
{
    @SideOnly(Side.CLIENT)
    protected IIcon side_Texture;

    @SideOnly(Side.CLIENT)
    protected IIcon top_Texture;

    private static String name;

    public StorageSidedBlock(String unlocalizedName, Material blockMaterial)
    {
        super(blockMaterial);
        this.name = unlocalizedName;
        setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(unlocalizedName);
        stepSound = soundTypeStone;
        setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));

        if (blockMaterial == Material.rock)
        {
            this.setHardness(5.0F);
            this.setResistance(30.0F);
        }
        else
        {
            this.setHardness(2.5F);
            this.setResistance(10.0F);
        }
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int side)
    {
        return this.side_Texture;
    }

    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int top)
    {
        return this.top_Texture;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister icon)
    {
        this.side_Texture = icon.registerIcon(this.getTextureName());
        this.top_Texture = icon.registerIcon(this.getTextureName() + "_top");
    }
}