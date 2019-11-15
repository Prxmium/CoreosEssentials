package com.gmail.corysaucer;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.corysaucer.Commands.HealCommand;
import com.gmail.corysaucer.Commands.OPKitCommand;
import com.gmail.corysaucer.Commands.ReloadCommand;

public final class Main extends JavaPlugin {
	Events eventHandler = new Events();
	@Override
	public void onEnable() {
		//Startup logic
		System.out.println("CoreosEssentials has started!");
		this.getServer().getPluginManager().registerEvents(eventHandler, this);
		
		getConfig().options().copyDefaults();
		saveDefaultConfig();
		
		Config.setup();
		Config.get().addDefault("OPKitHelmetName", "Cool Helmet Name");
		Config.get().addDefault("OPKitChestplateName", "Cool Chestplate Name");
		Config.get().addDefault("OPKitLeggingsName", "Cool Leggings Name");
		Config.get().addDefault("OPKitBootsName", "Cool Boots Name");
		Config.get().addDefault("OPKitSwordName", "Cool Sword Name");
		Config.get().addDefault("OPKitPickaxeName", "Cool Pickaxe Name");
		Config.get().addDefault("OPKitAxeName", "Cool Axe Name");
		Config.get().addDefault("OPKitShovelName", "Cool Shovel Name");
		Config.get().addDefault("OPKitSwordName", "Cool Sword Name");
		Config.get().options().copyDefaults(true);
		Config.save();
		
		
		getCommand("cereload").setExecutor(new ReloadCommand());
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("opkit").setExecutor(new OPKitCommand());
		
	
	}

	@Override
	public void onDisable() {
		System.out.println("CoreosEssentials has been disabled!");
	}
}
