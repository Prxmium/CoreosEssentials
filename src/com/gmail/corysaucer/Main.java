package com.gmail.corysaucer;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
	Events eventHandler = new Events();
	@Override
	public void onEnable() {
		System.out.println("Plugin has started!");
		this.getServer().getPluginManager().registerEvents(eventHandler, this);
		getCommand("heal").setExecutor(new Commands());
		getCommand("book").setExecutor(new Commands());
		getCommand("opkit").setExecutor(new Commands());
	}

	@Override
	public void onDisable() {
		System.out.println("Plugin has been disabled!");
	}
}
