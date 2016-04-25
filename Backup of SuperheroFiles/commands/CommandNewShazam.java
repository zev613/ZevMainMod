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

public class CommandNewShazam implements ICommand
{
    private final List aliases;

    //Number of times shazam has activated his powers.
    public static int shazamActivatedCount = 0;

    //When Shazam has his powers powers.
    public static boolean isPlayerShazam = false;

    //When Shazam has been activated (toggle ON), and now has his powers.
    public static boolean shazamCommandActivated = false;

    //When says Shazam for the second time (toggle OFF) and does not have his powers anymore.
    public static boolean shazamCommandDeactivated = false;

    public CommandNewShazam()
    {
        aliases = new ArrayList();
        aliases.add("shazam");
        aliases.add("shazam!");
        aliases.add("Shazam");
        aliases.add("Shazam!");
        aliases.add("SHAZAM");
        aliases.add("SHAZAM!");
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
            if (!shazamCommandActivated && !isPlayerShazam && !player.inventory.hasItemStack(new ItemStack(ModDCCostumes.shazamHead)) && !par2World.isRemote)
            {
                shazamCommandActivated = true;
                par2World.playSoundAtEntity(player, "ambient.weather.thunder", 20.0F, 40.0F);
                par2World.addWeatherEffect(new HarmlessLightningBolt(par2World, player.posX, player.posY, player.posZ));
                player.setHealth(player.getMaxHealth() + 3.0F);
                    player.setCurrentItemOrArmor(1, new ItemStack(ModDCCostumes.shazamBoots));
                    player.setCurrentItemOrArmor(2, new ItemStack(ModDCCostumes.shazamPants));
                    player.setCurrentItemOrArmor(3, new ItemStack(ModDCCostumes.shazamChest));
                    player.setCurrentItemOrArmor(4, new ItemStack(ModDCCostumes.shazamHead));
                        String textShazam_On = EnumChatFormatting.YELLOW + "You have the power of SHAZAM!!";
                        sender.addChatMessage(new ChatComponentText(textShazam_On));
                            //player.capabilities.allowFlying = true;
                            player.fallDistance = 0.0F;
                            player.capabilities.setFlySpeed(0.3F);
                            player.capabilities.setPlayerWalkSpeed(0.2F);
                            player.jumpMovementFactor = 0.2F;

                isPlayerShazam = true;
                shazamActivatedCount = shazamActivatedCount + 1;
            }
            else if (shazamCommandActivated && isPlayerShazam && !shazamCommandDeactivated && !par2World.isRemote)
            {
                shazamCommandActivated = false;
                par2World.playSoundAtEntity(player, "ambient.weather.thunder", 20.0F, 40.0F);
                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 30, 0));
                player.setHealth(player.getMaxHealth());
                par2World.addWeatherEffect(new HarmlessLightningBolt(par2World, player.posX, player.posY, player.posZ));
                player.setHealth(player.prevHealth);
                player.capabilities.allowFlying = false;
                    player.setCurrentItemOrArmor(1, null);
                    player.setCurrentItemOrArmor(2, null);
                    player.setCurrentItemOrArmor(3, null);
                    player.setCurrentItemOrArmor(4, null);
                        String textShazam_Off = EnumChatFormatting.YELLOW + "You no longer have the power of Shazam.";
                        sender.addChatMessage(new ChatComponentText(textShazam_Off));
                                player.capabilities.setFlySpeed(0.1F);
                                player.fallDistance = 2.0F;
                           /*
                            while(player.capabilities.isFlying)
                            {
                                player.addPotionEffect(new PotionEffect(Potion.resistance.id, 30, 0));
                            }
                            */
                                    player.removePotionEffect(Potion.fireResistance.id);
                                    player.removePotionEffect(Potion.moveSpeed.id);
                                    player.removePotionEffect(Potion.jump.id);
                                    player.removePotionEffect(Potion.regeneration.id);
                                    player.removePotionEffect(Potion.waterBreathing.id);
                                    player.removePotionEffect(Potion.damageBoost.id);
                                    player.removePotionEffect(Potion.resistance.id);
                                player.jumpMovementFactor = 0.1F;
                                player.capabilities.setPlayerWalkSpeed(0.1F);

                            shazamCommandDeactivated = true;
                            isPlayerShazam = false;
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