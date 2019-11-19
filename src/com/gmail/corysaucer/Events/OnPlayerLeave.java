package com.gmail.corysaucer.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.gmail.corysaucer.Config;

public class OnPlayerLeave implements Listener{
	
	
	@EventHandler
	public void playerLeaveMessage (PlayerQuitEvent event) {
		Player player = event.getPlayer();
		event.setQuitMessage(Config.get().getString("Player-Leave-Message").replace("$player", player.getName()).replaceAll("&", "§"));
		
	}

}
