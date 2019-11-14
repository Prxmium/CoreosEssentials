package com.gmail.corysaucer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {
	
	@EventHandler
	
	
	//Turns placed TNT to air unless you have the specified permissions
	public void onTNTPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Location loc = block.getLocation();
		Material material = block.getType();
		if(player.hasPermission("coreo.tntplace")) {
		if(block.getType().equals(Material.TNT));
		
		return;
		}
		
		block.setType(Material.AIR);
		
	}
	
	public void onLavaPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Location loc = block.getLocation();
		Material material = block.getType();
		if(player.hasPermission("coreo.lavaplace")) {
		if(block.getType().equals(Material.LAVA));
		
		return;
		}
		
		block.setType(Material.AIR);
		
	}
	
	//Turns broken block to air before dropping specified material.
	public void onBlockBreakEvent(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Location loc = block.getLocation();
		Location centerOfBlock = loc.add(0.5, 0.5, 0.5);
		Material material = block.getType();
			if(material.equals(Material.GRASS_BLOCK)) {
				ItemStack diamond = new ItemStack(Material.DIAMOND);
				block.getWorld().dropItemNaturally(centerOfBlock, diamond);
				
			}
		
	}
	
}
