package com.zseltzer.zevadditions.commands;

import java.util.ArrayList;
import java.util.List;

import com.zseltzer.zevadditions.util.SetSuitTexture;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class CommandChangeSuit implements ICommand
{ 

    private final List aliases;
  
    protected String fullEntityName; 
    public static String suitName; 
  
    public CommandChangeSuit() 
    { 
        aliases = new ArrayList(); 
        aliases.add("suit"); 
        aliases.add("changeSuit"); 
        aliases.add("suitChange"); 
        aliases.add("superheroChange"); 
        aliases.add("superheroSuit"); 
        aliases.add("superheroSuitChange"); 
        aliases.add("changeSuperheroSuit"); 
        aliases.add("changeCostume");
        aliases.add("costumeChange");
        aliases.add("superheroCostume"); 
        aliases.add("superheroCostumeChange");
        aliases.add("changeSuperheroCostume"); 
    } 
  
    @Override 
    public int compareTo(Object o)
    { 
        return 0; 
    } 

    @Override 
    public String getCommandName() 
    { 
        return "changeSuit"; 
    } 

    @Override         
    public String getCommandUsage(ICommandSender var1) 
    { 
        return "changeSuit <text>"; 
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
    
        sender.addChatMessage(new ChatComponentText("Changing Suit to: [" + argString[0]  
        + "]")); 
            
        suitName = argString[0]; 
        
        SetSuitTexture.getSuitTexture(suitName);
         
        }     
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
