package com.zseltzer.zevadditions.superheroes.items;

import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GenericHeroItem extends Item
{
	public GenericHeroItem(String unlocalizedName)
	{
		super();
		this.setCreativeTab(ModTabs.tabHeroItems);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5) + ".png");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

}
