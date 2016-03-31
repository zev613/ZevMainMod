package com.zseltzer.zevadditions.commands;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.zseltzer.zevadditions.util.SetSuitTexture;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.SimpleReloadableResourceManager;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class CommandSuitDefault implements ICommand
{ 

    private final List aliases;
  
    protected String fullEntityName; 
    public static String suitName; 
  
    public CommandSuitDefault() 
    { 
        aliases = new ArrayList(); 
        aliases.add("resetSuit");
        aliases.add("suitReset"); 
        aliases.add("defaultSuit");
        aliases.add("resetCostume");
        aliases.add("suitDefault");
        aliases.add("suitDisable"); 
        aliases.add("disableSuit");
        aliases.add("resetSuperSuit"); 
        aliases.add("resetSuperhero"); 
        aliases.add("suitGeneric"); 
        aliases.add("costumeDisable");
        aliases.add("suitTurnOff");
        aliases.add("genericSuit"); 
        aliases.add("changeSuitDefault"); 
        aliases.add("superheroDefault"); 
        aliases.add("superSuitDisable"); 
        aliases.add("superheroDisable"); 
        aliases.add("superheroSuitDisable");
        aliases.add("superheroReset"); 
        aliases.add("superSuitReset"); 
        aliases.add("suitGeneric"); 

    } 
  
    @Override 
    public int compareTo(Object o)
    { 
        return 0; 
    } 

    @Override 
    public String getCommandName() 
    { 
        return "resetSuit"; 
    } 

    @Override         
    public String getCommandUsage(ICommandSender var1) 
    { 
        return "resetSuit"; 
    } 

    @Override 
    public List getCommandAliases() 
    { 
        return this.aliases;
    } 

    @Override 
    public void processCommand(ICommandSender sender, String[] argString)
    { 
        World world = sender.getEntityWorld(); 
    
        if (world.isRemote) 
        { 
            System.out.println("Not processing on Client side"); 
        } 
        else 
        { 
            System.out.println("Processing on Server side"); 
            if(argString.length == 0) 
            { 
                sender.addChatMessage(new ChatComponentText("Invalid argument")); 
                return; 
            } 
    
            sender.addChatMessage(new ChatComponentText("Setting suit back to normal.")); 
            
            suitName = "superheroDefault";
            
            SetSuitTexture.getSuitTexture(suitName);

            /*
            if (EntityList.stringToClassMapping.containsKey(fullEntityName))
            {    
            	conjuredEntity = EntityList.createEntityByName(fullEntityName, world);  
                conjuredEntity.setPosition(sender.getPlayerCoordinates().posX,       
                sender.getPlayerCoordinates().posY, 
                sender.getPlayerCoordinates().posZ); 
                world.spawnEntityInWorld(conjuredEntity); 
            
            } 
            else 
            { 
                sender.addChatMessage(new ChatComponentText("Suit " + suitName + " could not be found. Please try a different one.")); 
            }
            */
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
        // TODO Auto-generated method stub 
        return null; 
    } 

    @Override 
    public boolean isUsernameIndex(String[] var1, int var2) 
    { 
        // TODO Auto-generated method stub 
        return false;
    } 
}