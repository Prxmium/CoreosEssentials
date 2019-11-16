package com.gmail.corysaucer.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class OnTNTPlace implements Listener {
	
	@EventHandler
	//Turns placed TNT to air unless you have the specified permissions
	public boolean onTNTPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		if(player.hasPermission("coreo.tntplace")) {
			return true;
		}else{
		if(block.getType().equals(Material.TNT)) {
			block.setType(Material.AIR);	
		}
			
		}
		
		return true;
	}

}
