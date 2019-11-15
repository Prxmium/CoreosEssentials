package com.gmail.corysaucer.Commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		if(sender instanceof Player) {
			player.hasPermission("coreo.fly");
			command.getName().equalsIgnoreCase("fly");
			if(player.isFlying()) {
				player.setAllowFlight(false);
				player.setFlying(false);
			}else{
				player.setAllowFlight(true);
				player.setFlying(true);
				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			}
		}
		
		
		
		
		return true;
	}

}
