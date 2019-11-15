package com.gmail.corysaucer.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.corysaucer.Config;

public class ReloadCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		Config.reload();
		player.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "CE" + ChatColor.GRAY + "]" + ChatColor.WHITE + " Config reloaded.");
		return true;
	}
	
}
