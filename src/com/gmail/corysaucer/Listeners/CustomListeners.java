package com.gmail.corysaucer.Listeners;

import org.bukkit.Material;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;

import com.gmail.corysaucer.Events.SpawnerBreakEvent;

public class CustomListeners implements Listener {

	@EventHandler
	public void onSpawnerBreak(SpawnerBreakEvent event) {
		
		
		ItemStack given_spawner = new ItemStack(Material.SPAWNER);
		CreatureSpawner cs = (CreatureSpawner) event.getSpawner().getState();
		BlockStateMeta meta = (BlockStateMeta) given_spawner.getItemMeta();
		CreatureSpawner csmeta = (CreatureSpawner) meta.getBlockState();
		
		csmeta.setSpawnedType(cs.getSpawnedType());
		meta.setBlockState(csmeta);
		given_spawner.setItemMeta(meta);
		
		
		
		event.getBreaker().getInventory().addItem(given_spawner);
		
	}
	
}
