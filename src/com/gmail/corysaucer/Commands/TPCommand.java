package com.gmail.corysaucer.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(args.length == 0) {
				player.sendMessage(ChatColor.RED + "Please specify a player to teleport to.");
				player.sendMessage(ChatColor.YELLOW + "To teleport to another player: /tp <playername>");
				player.sendMessage(ChatColor.YELLOW + "To teleport a player to another player: /tp <playername> <otherplayer>");
			}else if(args.length == 1) {
				Player target = Bukkit.getPlayer(args[0]);
				try {
				player.teleport(target.getLocation());
				} catch (NullPointerException e) {
				player.sendMessage(ChatColor.RED + "That player does not exist.");
				}
			}else if(args.length == 2) {
				Player playerToTP = Bukkit.getPlayer(args[0]);
				Player target = Bukkit.getPlayer(args[1]);
				try {
				playerToTP.teleport(target.getLocation());
				} catch (NullPointerException e) {
				player.sendMessage(ChatColor.RED + "That player does not exist.");
				}
				
			}
		}
		
		
		
		return true;
	}

}
