package com.zseltzer.zevadditions.events;

import com.zseltzer.zevadditions.proxies.ClientProxy;
import com.zseltzer.zevadditions.superheroes.costumes.ItemMartianManhunterCostume;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class ModEventHandler 
{
	@SubscribeEvent
	public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void throwEgg(PlayerInteractEvent event)
	{
		
	}

    /*if (event.player.getEquipmentInSlot(3) != null) System.out.println("Item "+event.player.getEquipmentInSlot(3).getItem());
    System.out.println("Target Item "+Mineturnedmain.Mark7Chestplate);

    System.out.println(event.player.getEquipmentInSlot(3) != null && event.player.getEquipmentInSlot(3).getItem() == Mineturnedmain.Mark7Chestplate);


    if (event.player.getEquipmentInSlot(3) != null && event.player.getEquipmentInSlot(3).getItem() == Mineturnedmain.Mark7Chestplate) {

    playersWithFlight.put(event.player, true);
    event.player.capabilities.allowFlying = true;

} else {

    if (!playersWithFlight.containsKey(event.player)) {
        playersWithFlight.put(event.player, false);
    }

    if (playersWithFlight.get(event.player)) {
        playersWithFlight.put(event.player, false);

        if (!event.player.capabilities.isCreativeMode) {
            event.player.capabilities.allowFlying = false;
            event.player.capabilities.isFlying = false;
            event.player.sendPlayerAbilities();
        }
    }
*/


/*
	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
	public void onEvent(InputEvent.KeyInputEvent event)
	{
		// DEBUG
		System.out.println("Key Input Event");

		// make local copy of key binding array
		KeyBinding[] keyBindings = ClientProxy.keyBindings;

		// check each enumerated key binding type for pressed and take appropriate action
		    //INVISIBILITY KEY TOGGLE
        if (keyBindings[0].isPressed())
		{
			// DEBUG
			System.out.println("Key binding ="+keyBindings[0].getKeyDescription());

			// do stuff for this key binding here
			// remember you may need to send packet to server
            ItemMartianManhunterCostume.keyInvisIsPressed = true;

            if (ItemMartianManhunterCostume.keyInvisIsPressed = true)
            {
                ItemMartianManhunterCostume.keyInvisIsPressed = false;
            }
        }
        //INTANGIBILITY KEY TOGGLE
        if (keyBindings[1].isPressed())
		{
			// DEBUG
			System.out.println("Key binding ="+keyBindings[1].getKeyDescription());

            // do stuff for this key binding here
            // remember you may need to send packet to server
            ItemMartianManhunterCostume.keyIntangIsPressed = true;

            if (ItemMartianManhunterCostume.keyIntangIsPressed = true)
            {
                ItemMartianManhunterCostume.keyIntangIsPressed = false;
            }
		}
	}
	*/
}
