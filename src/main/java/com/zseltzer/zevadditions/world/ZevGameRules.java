package com.zseltzer.zevadditions.world;
/*
import net.minecraft.nbt.NBTTagCompound;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ZevGameRules
{
    private TreeMap theGameRules = new TreeMap();

    public ZevGameRules()
    {
        this.addGameRule("doFireTick", "true");
        this.addGameRule("mobGriefing", "true");
        this.addGameRule("keepInventory", "false");
        this.addGameRule("doMobSpawning", "true");
        this.addGameRule("doMobLoot", "true");
        this.addGameRule("doTileDrops", "true");
        this.addGameRule("commandBlockOutput", "true");
        this.addGameRule("naturalRegeneration", "true");
        this.addGameRule("doDaylightCycle", "true");
    }

     //Define a game rule and its default value.

    public void addGameRule(String addRuleString1, String addRuleString2)
    {
        this.theGameRules.put(addRuleString1, new com.zseltzer.zevadditions.world.ZevGameRules.Value(addRuleString2));
    }

    public void setOrCreateGameRule(String setRuleString1, String setRuleString2)
    {
        com.zseltzer.zevadditions.world.ZevGameRules.Value value = (com.zseltzer.zevadditions.world.ZevGameRules.Value)this.theGameRules.get(setRuleString1);

        if (value != null)
        {
            value.setValue(setRuleString2);
        }
        else
        {
            this.addGameRule(setRuleString1, setRuleString2);
        }
    }

     //Gets the string Game Rule value.

    public String getGameRuleStringValue(String getRuleString1)
    {
        com.zseltzer.zevadditions.world.ZevGameRules.Value value = (com.zseltzer.zevadditions.world.ZevGameRules.Value)this.theGameRules.get(getRuleString1);
        return value != null ? value.getGameRuleStringValue() : "";
    }

     //Gets the boolean Game Rule value.

    public boolean getGameRuleBooleanValue(String getRuleString2)
    {
        com.zseltzer.zevadditions.world.ZevGameRules.Value value = (com.zseltzer.zevadditions.world.ZevGameRules.Value)this.theGameRules.get(getRuleString2);
        return value != null ? value.getGameRuleBooleanValue() : false;
    }


     //Return the defined game rules as NBT.

    public NBTTagCompound writeGameRulesToNBT()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        Iterator iterator = this.theGameRules.keySet().iterator();

        while (iterator.hasNext())
        {
            String s = (String)iterator.next();
            com.zseltzer.zevadditions.world.ZevGameRules.Value value = (com.zseltzer.zevadditions.world.ZevGameRules.Value)this.theGameRules.get(s);
            nbttagcompound.setString(s, value.getGameRuleStringValue());
        }

        return nbttagcompound;
    }

     //Set defined game rules from NBT.

    public void readGameRulesFromNBT(NBTTagCompound NBTRead_1)
    {
        Set set = NBTRead_1.func_150296_c();
        Iterator iterator = set.iterator();

        while (iterator.hasNext())
        {
            String s = (String)iterator.next();
            String s1 = NBTRead_1.getString(s);
            this.setOrCreateGameRule(s, s1);
        }
    }

     //Return the defined game rules.

    public String[] getRules()
    {
        return (String[])this.theGameRules.keySet().toArray(new String[0]);
    }

    //Return whether the specified game rule is defined.

    public boolean hasRule(String p_82765_1_)
    {
        return this.theGameRules.containsKey(p_82765_1_);
    }

    static class Value
    {
        private String valueString;
        private boolean valueBoolean;
        private int valueInteger;
        private double valueDouble;

        public Value(String p_i1949_1_)
        {
            this.setValue(p_i1949_1_);
        }

         //Set this game rule value.

        public void setValue(String par1Str)
        {
            this.valueString = p_82757_1_;
            this.valueBoolean = Boolean.parseBoolean(p_82757_1_);

            try
            {
                this.valueInteger = Integer.parseInt(p_82757_1_);
            }
            catch (NumberFormatException numberformatexception1)
            {
                ;
            }

            try
            {
                this.valueDouble = Double.parseDouble(p_82757_1_);
            }
            catch (NumberFormatException numberformatexception)
            {
                ;
            }
        }

         //Gets the GameRule's value as String.

        public String getGameRuleStringValue()
        {
            return this.valueString;
        }

         //Gets the GameRule's value as boolean.

        public boolean getGameRuleBooleanValue()
        {
            return this.valueBoolean;
        }
    }
}
*/