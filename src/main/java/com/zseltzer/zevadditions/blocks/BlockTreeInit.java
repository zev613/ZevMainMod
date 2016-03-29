package com.zseltzer.zevadditions.blocks;

import scala.reflect.internal.StdNames.TypeNames;

public class BlockTreeInit 
{
	
	public static void init()
	{
	    final String[] typeNames = new String[] {"light", "cherry", "redwood", "maple", "willow", "pine", "fir", "palm"};
		
	    final String prefix = "_leaves";
		
	    final String prefix_O = "_leaves_opaque";
	    	    
	    String[][] leafNames_temp = new String[typeNames.length][typeNames.length];
	    for(int i = 0; i < typeNames.length; i++)
	        {
	    		//leafNames[i][i] = leafNames_1[i];
	          //for(int y = 0; y < typeNames.length; y++)
	          //{
	    	leafNames_temp[0][i] = typeNames[i] + prefix;
	    	leafNames_temp[1][i] = typeNames[i] + prefix_O;

	          //}
	        }
	}
	
}
