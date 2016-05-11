package com.zseltzer.zevadditions.blocks;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class GenericSidedBlock extends BlockRotatedPillar
{
    @SideOnly(Side.CLIENT)
    protected IIcon side_Texture;
    @SideOnly(Side.CLIENT)
    protected IIcon top_Texture;

    public static String NAME;

    public GenericSidedBlock(String unlocalizedName, Material blockMaterial)
    {
        super(blockMaterial);
        this.setCreativeTab(ModTabs.tabNewBlocks);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        this.NAME = unlocalizedName;
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