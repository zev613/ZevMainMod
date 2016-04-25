package com.zseltzer.zevadditions.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.zseltzer.zevadditions.Reference;

	//Custom logger to log all details from the mod to help with peoples issues.

public class GameLogger 
{
	public static GameLogger log = new GameLogger();

	static File zevAdditionsFolder;
	static File zevAdditionsLogFolder;
	static File configZevAdditionsFolder;
	
	private static String dir = System.getenv("AppData") + "/.minecraft/";

	private static boolean configured;

	private Logger myLog;

	//Configure the ZevAdditions logger

	private static void configureLogging() 
	{
		log.myLog = Logger.getLogger("ZEVADDITIONS-DIMENSION");
		configured = true;
	}

	public static void log(String targetLog, Level level, String msg, Object... data) 
	{
		Logger.getLogger(targetLog).log(level, String.format(msg, data));
	}

	public static void log(Level level, String msg) 
	{
		if (!configured) 
		{
			configureLogging();
		}
		log.myLog.log(level, String.format(msg));
	}

	public static void log(String targetLog, Level level, Throwable ex, String msg, Object... data) 
	{
		Logger.getLogger(targetLog).log(level, String.format(msg, data), ex);
	}

	public static void log(Level level, Throwable ex, String msg, Object... data) 
	{
		if (!configured) 
		{
			configureLogging();
		}
		log.myLog.log(level, String.format(msg, data), ex);
	}

	public static void severe(String msg, Object... data) 
	{
		log(Level.SEVERE, msg);
	}

	public static void warning(String msg, Object... data) 
	{
		log(Level.WARNING, msg);
	}

		//@param msg

	public static void info(String msg) 
	{
		log(Level.INFO, msg);
	}

	//Gets this ZevAdditions Logger.

	//@return

	public Logger getLogger() 
	{
		return myLog;
	}

	//Creates ZevAdditions folder.
	//Creates Config folder in ZevAdditions folder.

	public static void createFolders() 
	{
		zevAdditionsFolder = new File(dir, "ZevAdditions");
		zevAdditionsLogFolder = new File(dir + "ZevAdditions/zevadditionsLog/");
		configZevAdditionsFolder = new File(dir + "ZevAdditions/Configs/");
		
		if (zevAdditionsFolder.exists() != true || configZevAdditionsFolder.exists() != true) 
		{
			zevAdditionsFolder.mkdirs();
			zevAdditionsLogFolder.mkdirs();
			configZevAdditionsFolder.mkdirs();
		}
	}

	//Write text to the zevadditionsLog.log.

	//@param level
	//@param text

	public static void writeToFile(Level level, String text) 
	{
		File file;
		FileWriter writer;
		String newLine = System.getProperty("line.separator");
		try 
		{
			file = new File(zevAdditionsLogFolder, "Log.log");
			
			writer = new FileWriter(file, true);
			writer.write("[" + Reference.MODID + "]" + "[" + level + "]" + " : " + text + newLine);
			writer.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	//Gets Base file path

	public static String getFilePath()
	{
		return dir;
	}
}