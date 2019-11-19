package com.gmail.corysaucer;

import org.bukkit.plugin.PluginManager;
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
import com.gmail.corysaucer.Listeners.BlockBreakListener;
import com.gmail.corysaucer.Listeners.CustomListeners;

public final class Main extends JavaPlugin {
	EventHandler eventHandler = new EventHandler();
	@Override
	public void onEnable() {
		//Startup logic
		PluginManager pm = getServer().getPluginManager();
		System.out.println("[CE] Coreo's Essentials has started!");
		pm.registerEvents(new EventHandler(), this);
		pm.registerEvents(new OnTNTPlace(), this);
		pm.registerEvents(new OnBucketEmpty(), this);
		pm.registerEvents(new OnPlayerJoin(), this);
		pm.registerEvents(new OnPlayerJoin(), this);
		pm.registerEvents(new CustomListeners(), this);
		pm.registerEvents(new BlockBreakListener(), this);
		
		
		
		this.saveResource("config.yml", false);
		
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
		Config.get().addDefault("Player-Join-Message", "&c$player &bjoined the Server");
		Config.get().addDefault("Player-Leave-Message", "&c$player &bleft the Server");
		Config.get().options().copyDefaults(true);
		this.saveResource("config.yml", false);
		
		getCommand("cereload").setExecutor(new ReloadCommand());
		getCommand("heal").setExecutor(new HealCommand());
		getCommand("opkit").setExecutor(new OPKitCommand());
		getCommand("fly").setExecutor(new FlyCommand());
		getCommand("gmc").setExecutor(new CreativeCommand());
		getCommand("gms").setExecutor(new SurvivalCommand());
		getCommand("gma").setExecutor(new SurvivalCommand());
		getCommand("gmsp").setExecutor(new SurvivalCommand());
		getCommand("feed").setExecutor(new FeedCommand());
		getCommand("tp").setExecutor(new TPCommand());
		getCommand("tpall").setExecutor(new TPAllCommand());
		
	
	}

	@Override
	public void onDisable() {
		System.out.println("[CE] Coreo's Essentials has been disabled!");
	}
}
