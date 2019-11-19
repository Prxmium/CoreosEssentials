package com.gmail.corysaucer.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
		Player player = (Player) sender;
			if (player.hasPermission("coreo.survival")) {
				if(args.length == 0) {
					command.getName().equalsIgnoreCase("gms");
					player.setGameMode(GameMode.SURVIVAL);
					player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			
					}else if(args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if (target != null) {
							target.setGameMode(GameMode.SURVIVAL);
							player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
					
						}else{
							sender.sendMessage(ChatColor.RED + "Player not found.");
				}
				
			
				}
			
			}
			
			
			
		}
			
		return true;
	
	}

}
