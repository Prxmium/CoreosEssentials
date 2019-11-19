package com.gmail.corysaucer.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import com.gmail.corysaucer.Events.SpawnerBreakEvent;

public class BlockBreakListener implements Listener {
	
	
	@EventHandler
	public void OnBlockBreak (BlockBreakEvent event) {
		Block blockBroken = event.getBlock();
		if (blockBroken.getType().equals(Material.SPAWNER)) {
			event.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH);
			event.getPlayer().hasPermission("coreo.silk");
			Bukkit.getServer().getPluginManager().callEvent(new SpawnerBreakEvent(event.getPlayer(), blockBroken));
		}else if(blockBroken.getType().equals(Material.SPAWNER) && event.getPlayer().getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH) && !event.getPlayer().hasPermission("coreo.silk")) {
			event.getPlayer().sendMessage(ChatColor.RED + "You don't meet the requirements to silk touch spawners.");
			
		}
		
	}
			
}
