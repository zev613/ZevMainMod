package com.zseltzer.zevadditions.superheroes.tools;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class HeroItemPickaxe extends ItemPickaxe
{

public final ToolMaterial toolMaterial;
	
	public HeroItemPickaxe(ToolMaterial EnumToolMaterial, String name)
	{
		super(EnumToolMaterial);
		this.toolMaterial = EnumToolMaterial;
		this.setUnlocalizedName(name);
		this.setCreativeTab(ModTabs.tabHeroItems);
		this.setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5) + ".png");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
	
}