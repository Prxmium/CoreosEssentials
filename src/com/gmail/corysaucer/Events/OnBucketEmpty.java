package com.gmail.corysaucer.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class OnBucketEmpty implements Listener {
	
	@EventHandler
	//Sets Lava to air if player doesn't have perms
	public boolean onBucketEmpty(PlayerBucketEmptyEvent event) {
		Player player = event.getPlayer();
		Material bucket = event.getBucket();
		if(player.hasPermission("coreo.lavaplace")) {
			return true;
		}else{
		if(bucket.toString().contains("LAVA")) {
			event.setCancelled(true);
			
			return true;
		}
		
		}
		
		return true;
	}

}
