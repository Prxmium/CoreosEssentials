package com.gmail.corysaucer;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	
	private static File file;
	private static FileConfiguration customFile;
	
	// Finds or generates a config file
	public static void setup() {
		file = new File(Bukkit.getServer().getPluginManager().getPlugin("CoreosEssentials").getDataFolder(), "config.yml");
		
		if(!file.exists()) {
			try {
			file.createNewFile();
			}catch (IOException e) {
				
			}
			
		}
		
		customFile = YamlConfiguration.loadConfiguration(file);
		
	}
	
	public static FileConfiguration get() {
		return customFile;
	}
	
	public static void save() {
		try {
		customFile.save(file);	
		}catch (IOException e) {
			System.out.println("Config could not be saved.");
		}
		
	}
	
	public static void reload() {
		customFile = YamlConfiguration.loadConfiguration(file);
	}
	
}
