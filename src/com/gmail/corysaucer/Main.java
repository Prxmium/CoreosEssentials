package com.gmail.corysaucer;

import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.corysaucer.Commands.CreativeCommand;
import com.gmail.corysaucer.Commands.FeedCommand;
import com.gmail.corysaucer.Commands.FlyCommand;
import com.gmail.corysaucer.Commands.HealCommand;
import com.gmail.corysaucer.Commands.OPKitCommand;
import com.gmail.corysaucer.Commands.ReloadCommand;
import com.gmail.corysaucer.Commands.SurvivalCommand;
import com.gmail.corysaucer.Commands.TPAllCommand;
import com.gmail.corysaucer.Commands.TPCommand;
import com.gmail.corysaucer.Events.OnBucketEmpty;
import com.gmail.corysaucer.Events.OnPlayerJoin;
import com.gmail.corysaucer.Events.OnTNTPlace;

public final class Main extends JavaPlugin {
	EventHandler eventHandler = new EventHandler();
	@Override
	public void onEnable() {
		//Startup logic
		System.out.println("CoreosEssentials has started!");
		this.getServer().getPluginManager().registerEvents(new EventHandler(), this);
		this.getServer().getPluginManager().registerEvents(new OnTNTPlace(), this);
		this.getServer().getPluginManager().registerEvents(new OnBucketEmpty(), this);
		this.getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
		
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
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("gmc").setExecutor(new CreativeCommand());
		getCommand("feed").setExecutor(new FeedCommand());
		getCommand("gms").setExecutor(new SurvivalCommand());
		getCommand("tp").setExecutor(new TPCommand());
		getCommand("tpall").setExecutor(new TPAllCommand());
		
	
	}

	@Override
	public void onDisable() {
		System.out.println("CoreosEssentials has been disabled!");
	}
}
