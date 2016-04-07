package com.zseltzer.zevadditions.commands;

import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.util.HarmlessLightningBolt;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.ICommand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;

import java.util.ArrayList;
import java.util.List;

public class CommandBlackAdam implements ICommand
{
    private final List aliases;

    //When Shazam has his powers powers.
    //public static boolean isPlayerShazam = false;
    //When Black Adam has his suit on, and therefore has his powers, but has not said Shazam yet, so has not died.
    public static boolean isPlayerBlackAdam = false;
    //When Black Adam has said Shazam (for the first time, soon will die)
    public static boolean blackAdamChangeActivated = false;
    //When Shazam has been activated (toggle ON), and now has his powers.
    //public static boolean shazamCommandActivated = false;
    //When says Shazam for the second time (toggle OFF) and does not have his powers anymore.
    //public static boolean shazamCommandDeactivated = false;

    public CommandBlackAdam()
    {
        aliases = new ArrayList();
        aliases.add("blackAdam");
        aliases.add("blackAdam!");
        aliases.add("BlackAdam");
        aliases.add("blackAdam!");
        aliases.add("BLACKADAM");
        aliases.add("BLACKADAM!");
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

    @Override
    public String getCommandName()
    {
        return "blackAdam!";
    }

    @Override
    public String getCommandUsage(ICommandSender var1)
    {
        return "blackAdam!";
    }

    @Override
    public List getCommandAliases()
    {
        return this.aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] argString)
    {
        if (sender instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) sender;
            World par2World = player.worldObj;

            World world = sender.getEntityWorld();

            //TOGGLE ON - GAIN SHAZAM POWERS (ONLY IF PLAYER IS NOT ALREADY SHAZAM OR BLACK ADAM
            if (!par2World.isRemote && isPlayerBlackAdam && !blackAdamChangeActivated && player.inventory.hasItemStack(new ItemStack(ModDCCostumes.blackAdamChest)))
            {
                blackAdamChangeActivated = true;
                System.out.println("You are going to be killed, you can't transform while being Black Adam without dying.");
                par2World.playSoundAtEntity(player, "ambient.weather.thunder", 20.0F, 40.0F);
                par2World.addWeatherEffect(new HarmlessLightningBolt(world, player.posX, player.posY, player.posZ));
                player.capabilities.allowFlying = false;
                player.capabilities.setPlayerWalkSpeed(0.1F);
                player.capabilities.setFlySpeed(0.F);
                player.jumpMovementFactor = 0.1F;
                par2World.playSoundAtEntity(player, "random.explode", 20.0F, 40.0F);

                int timeBeforeDying = 0;
                for (int i = 0; i < 100; ++i)
                {
                    ++timeBeforeDying;
                }
                if (timeBeforeDying == 175)
                {
                    String coloredTextWarning = EnumChatFormatting.YELLOW + "Black Adam cannot transform without dying, he is more than 5000 years old.";
                    sender.addChatMessage(new ChatComponentText(coloredTextWarning));
                    isPlayerBlackAdam = false;
                    player.setCurrentItemOrArmor(1, null);
                    player.setCurrentItemOrArmor(2, null);
                    player.setCurrentItemOrArmor(3, null);
                    player.setCurrentItemOrArmor(4, null);
                    par2World.playSoundAtEntity(player, "ambient.weather.thunder", 20.0F, 40.0F);
                    par2World.addWeatherEffect(new HarmlessLightningBolt(world, player.posX, player.posY, player.posZ));
                    System.out.print("Killing player!");
                        player.setHealth(0.0F);

                }
            }
        }
    }



    @Override
    public boolean canCommandSenderUseCommand(ICommandSender var1)
    {
        return true;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender var1, String[] var2)
    {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] var1, int var2)
    {
        return false;
    }
}