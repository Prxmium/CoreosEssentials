package com.gmail.corysaucer.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {
	
	@EventHandler
	public void onPlayerJoin (PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if(!player.isOnGround()) {
			player.hasPermission("coreo.fly");
			player.setAllowFlight(true);
			player.setFlying(true);
		}
		
		
		

	}

}
