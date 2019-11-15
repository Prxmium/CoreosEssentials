package com.gmail.corysaucer;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class Events implements Listener {
	
	@EventHandler
	
	//Turns placed TNT to air unless you have the specified permissions
	public void onTNTPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		if(player.hasPermission("coreo.tntplace")) {
		if(block.getType().equals(Material.TNT));
		
		return;
		}
		
		block.setType(Material.AIR);
		
	}
	
	public void onLavaPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		if(player.hasPermission("coreo.lavaplace")) {
		if(block.getType().equals(Material.LAVA));
		
		return;
		}
		
		block.setType(Material.AIR);
		
	}
	
	
}
