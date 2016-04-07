package com.zseltzer.zevadditions.proxies;

import com.zseltzer.zevadditions.entities.EntityBear;
import com.zseltzer.zevadditions.entities.ModelBear;
import com.zseltzer.zevadditions.entities.RenderBear;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ClientProxy extends CommonProxy
{

@Override
public void registerRenderers() 
{
	RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0.8F));
    LanguageRegistry.instance().addStringLocalization("potion.customPotion", "Potion name here");

}
}