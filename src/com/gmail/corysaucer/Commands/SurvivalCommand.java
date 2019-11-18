package com.gmail.corysaucer.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
			player.hasPermission("coreo.survival");
			command.getName().equalsIgnoreCase("gms");
			player.setGameMode(GameMode.SURVIVAL);
		}else{
			sender.sendMessage(ChatColor.RED + "You don't meet the conditions required to run this command.");
		}
		
		return true;
	
	}

}
