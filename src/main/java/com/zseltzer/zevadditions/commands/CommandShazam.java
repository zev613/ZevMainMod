package com.zseltzer.zevadditions.commands;

import com.zseltzer.zevadditions.superheroes.ModDCCostumes;
import com.zseltzer.zevadditions.util.HarmlessLightningBolt;
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

public class CommandShazam implements ICommand
{
    private final List aliases;

    public static int shazamActivatedCount = 0;
    //When Shazam has his powers powers.
    public static boolean isPlayerShazam = false;
    //When Black Adam has his suit on, and therefore has his powers, but has not said Shazam yet, so has not died.
    public static boolean isPlayerBlackAdam = false;
    //When Black Adam has said Shazam (for the first time, soon will die)
    public static boolean blackAdamActivated = false;
    //When Shazam has been activated (toggle ON), and now has his powers.
    public static boolean shazamCommandActivated = false;
    //When says Shazam for the second time (toggle OFF) and does not have his powers anymore.
    public static boolean shazamCommandDeactivated = false;

    public CommandShazam()
    {
        aliases = new ArrayList();
        aliases.add("shazam");
        aliases.add("shazam!");
        aliases.add("Shazam");
        aliases.add("shazamMorph");
        aliases.add("Shazam!");
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

    @Override
    public String getCommandName()
    {
        return "shazam!";
    }

    @Override
    public String getCommandUsage(ICommandSender var1)
    {
        return "shazam!";
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
            if (!par2World.isRemote && !isPlayerShazam && !isPlayerBlackAdam && !player.inventory.hasItemStack(new ItemStack(ModDCCostumes.blackAdamChest)) && !player.inventory.hasItemStack(new ItemStack(ModDCCostumes.shazamHead)))
            {
                par2World.playSoundAtEntity(player, "ambient.weather.thunder", 20.0F, 40.0F);
                par2World.addWeatherEffect(new HarmlessLightningBolt(par2World, player.posX, player.posY, player.posZ));
                String coloredTextActivate = EnumChatFormatting.YELLOW + "You now have the power of SHAZAM!!";
                sender.addChatMessage(new ChatComponentText(coloredTextActivate));
                ItemStack head = new ItemStack(ModDCCostumes.shazamHead);
                ItemStack chest = new ItemStack(ModDCCostumes.shazamChest);
                ItemStack pants = new ItemStack(ModDCCostumes.shazamPants);
                ItemStack boots = new ItemStack(ModDCCostumes.shazamBoots);
                    player.setCurrentItemOrArmor(1, boots);
                    player.setCurrentItemOrArmor(2, pants);
                    player.setCurrentItemOrArmor(3, chest);
                    player.setCurrentItemOrArmor(4, head);
                        shazamCommandActivated = true;
                        isPlayerShazam = true;
            }
            //TOGGLE SHAZAM OFF - LOSE SHAZAM POWERS (AND ISS NOT BLACK ADAM)
            else if (!par2World.isRemote && shazamCommandActivated && !isPlayerBlackAdam)
            {
                par2World.playSoundAtEntity(player, "ambient.weather.thunder", 20.0F, 40.0F);
                par2World.addWeatherEffect(new HarmlessLightningBolt(world, player.posX, player.posY, player.posZ));
                String coloredTextDeactivate = EnumChatFormatting.YELLOW + "You no longer have the power of SHAZAM.";
                sender.addChatMessage(new ChatComponentText(coloredTextDeactivate));
                player.capabilities.allowFlying = false;
                    player.setCurrentItemOrArmor(1, null);
                    player.setCurrentItemOrArmor(2, null);
                    player.setCurrentItemOrArmor(3, null);
                    player.setCurrentItemOrArmor(4, null);
                player.addPotionEffect(new PotionEffect(11, 7, 1, false));
                shazamCommandDeactivated = true;
                        isPlayerShazam = false;
                //LOSE POWERS, AND PROTECT FROM FALLING WHILE FLYING
                if (player.capabilities.isFlying && shazamCommandDeactivated && !isPlayerBlackAdam)
                {
                    //NO FALL DAMAGE WHILE PLAYER IS FLYING IN THE AIR
                    while(player.capabilities.isFlying)
                    {
                        player.fallDistance = 0.0F;
                    }

                }
                //TURN BACK ON FALL DAMAGE ONCE PLAYER IS NOT IN AIR
                else if (!player.capabilities.isFlying)
                {
                    player.fallDistance = 1.0F;
                }
            }
            //TOGGLES OFF BLACK ADAM, IF PLAYER IS ALREADY BLACK ADAM AND HAS NOT ACTIVATED THIS COMMAND BEFORE>
            else if (!par2World.isRemote && isPlayerBlackAdam && !blackAdamActivated && !isPlayerShazam && player.inventory.hasItemStack(new ItemStack(ModDCCostumes.blackAdamChest)))
            {
                blackAdamActivated = true;
                System.out.println("You are going to be killed, you cant transform while being Black Adam without dying.");
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

                                blackAdamActivated = false;
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