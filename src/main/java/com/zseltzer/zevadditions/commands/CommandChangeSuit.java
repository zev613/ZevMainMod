package com.zseltzer.zevadditions.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.zseltzer.zevadditions.Reference;
import com.zseltzer.zevadditions.items.SuperheroTestArmor;
import com.zseltzer.zevadditions.util.SetSuitTexture;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class CommandChangeSuit implements ICommand
{ 

    private final List aliases;
  
    //protected String fullEntityName; 
    public static String suitName = "superSuitDefault"; 
  
    public CommandChangeSuit() 
    { 
        aliases = new ArrayList(); 
        aliases.add("changeSuit"); 
        aliases.add("changeCostume");
        aliases.add("costumeChange");
        aliases.add("suitChange");
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
            //System.out.println("Not processing on Client side"); 
        } 
        else 
        { 
            //System.out.println("Processing on Server side"); 
            if(argString.length == 0) 
            { 
                sender.addChatMessage(new ChatComponentText("Invalid argument")); 
                return; 
            } 
    
            File f = new File("assets/zevadditions/textures/models/superheroSuits/" + argString[0] + ".png");
            if(f.exists() && !f.isDirectory()) 
            { 
            	sender.addChatMessage(new ChatComponentText("Changing your suit to " + argString[0] + "."));
                suitName = argString[0];
            }
            
            else
            {
            	sender.addChatMessage(new ChatComponentText("You did not pick a valid option. Please try again."));
            }
           
        //System.out.println("The current suitName value is: " + suitName + ".");
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

