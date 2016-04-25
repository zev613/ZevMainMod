package com.zseltzer.zevadditions.proxies;

import com.zseltzer.zevadditions.entities.EntityBear;
import com.zseltzer.zevadditions.entities.ModelBear;
import com.zseltzer.zevadditions.entities.RenderBear;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy
{

    public static KeyBinding[] keyBindings;

    public void init()
    {
        // declare an array of key bindings
        keyBindings = new KeyBinding[2];

        // instantiate the key bindings
        keyBindings[0] = new KeyBinding("key.invisibility.desc", Keyboard.KEY_P, "key.zevadditions.category");
        keyBindings[1] = new KeyBinding("key.intangibility.desc", Keyboard.KEY_H, "key.zevadditions.category");

        // register all the key bindings
        for (int i = 0; i < keyBindings.length; ++i)
        {
            ClientRegistry.registerKeyBinding(keyBindings[i]);
        }
    }

    @Override
    public void registerRenderers()
    {
	    RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0.8F));
        //LanguageRegistry.instance().addStringLocalization("potion.customPotion", "Potion name here");
    }
}