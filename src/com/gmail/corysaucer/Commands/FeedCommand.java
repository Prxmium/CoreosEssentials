package com.gmail.corysaucer.Commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class FeedCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
			command.getName().equalsIgnoreCase("feed");
			player.hasPermission("coreo.feed");
			player.setFoodLevel(20);
			player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			return true;
		}else{
			sender.sendMessage(ChatColor.RED + "You don't meet the conditions required to run this command.");	
			return true;
			
		}
			
		
		
	}

}
