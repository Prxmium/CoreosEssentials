package com.gmail.corysaucer.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPAllCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if (Bukkit.getServer().getOnlinePlayers().size() == 1) {
				player.sendMessage(ChatColor.YELLOW + "No other players are on the server.");
			}else if(Bukkit.getServer().getOnlinePlayers().size() > 1) {
				int numOfPlayers = 0;
				for (Player p : Bukkit.getServer().getOnlinePlayers()) {
				p.teleport(player.getLocation());
				numOfPlayers++;
				}
				player.sendMessage(ChatColor.GREEN + "Teleported all " + (numOfPlayers -1) + " players to your location.");
			}
			
		}
		
		
		
		
		
		
		return true;
	}
	

}
