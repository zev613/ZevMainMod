package com.zseltzer.zevadditions.keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings
{
    // Declare two KeyBindings, ping and pong
    public static KeyBinding ping;
    public static KeyBinding pong;

    public static void init()
    {
            // Define the "ping" binding, with (unlocalized) name "key.ping" and
            // the category with (unlocalized) name "key.categories.mymod" and
            // key code 24 ("O", LWJGL constant: Keyboard.KEY_O)

        ping = new KeyBinding("key.ping", Keyboard.KEY_O, "key.categories.zevadditons");

        // Define the "pong" binding, with (unlocalized) name "key.pong" and
            // the category with (unlocalized) name "key.categories.mymod" and
            // key code 25 ("P", LWJGL constant: Keyboard.KEY_P)

        pong = new KeyBinding("key.pong", Keyboard.KEY_P, "key.categories.zevadditions");

            // Register both KeyBindings to the ClientRegistry

        ClientRegistry.registerKeyBinding(ping);
        ClientRegistry.registerKeyBinding(pong);
    }
}