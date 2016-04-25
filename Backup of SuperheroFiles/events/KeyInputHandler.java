package com.zseltzer.zevadditions.events;

import com.zseltzer.zevadditions.keybindings.KeyBindings;
import com.zseltzer.zevadditions.superheroes.costumes.ItemMartianManhunterCostume;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler
{

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if(KeyBindings.ping.isPressed())
            System.out.println("ping");

        if(KeyBindings.pong.isPressed())
            System.out.println("pong");

        if(KeyBindings.invisibility.isPressed())
        {
            ItemMartianManhunterCostume.keyInvisIsPressed = true;
        }

        if(KeyBindings.intangibility.isPressed())
        {
            ItemMartianManhunterCostume.keyIntangIsPressed = true;
        }
    }
}
