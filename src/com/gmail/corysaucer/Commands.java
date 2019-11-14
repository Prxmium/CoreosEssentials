package com.gmail.corysaucer;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Commands implements CommandExecutor {
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		//Giving item with custom name and lore
		if(sender instanceof Player) {	
		if(command.getName().equalsIgnoreCase("book")) {
		ItemStack item = new ItemStack(Material.BOOK, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("Aaron Smells!!");
		
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.LIGHT_PURPLE + "Brandon also smells.");
		lore.add(ChatColor.LIGHT_PURPLE + "Cory is a handsome man.");
		
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		Inventory inventory = ((Player)sender).getInventory();
		inventory.addItem(item);
		return true;
	}
		//Gives an OP set of items
		if(command.getName().equalsIgnoreCase("opkit")) {
			if(sender instanceof Player);
			ItemStack helm = new ItemStack(Material.DIAMOND_HELMET, 1);
			ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
			ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
			ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
			ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE, 1);
			ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
			ItemStack shovel = new ItemStack(Material.DIAMOND_SHOVEL, 1);
			ItemStack shield = new ItemStack(Material.SHIELD, 1);
			ItemMeta helmmeta = helm.getItemMeta();
			ItemMeta chestmeta = chest.getItemMeta();
			ItemMeta legsmeta = legs.getItemMeta();
			ItemMeta bootsmeta = boots.getItemMeta();
			ItemMeta swordmeta = sword.getItemMeta();
			ItemMeta pickmeta = sword.getItemMeta();
			ItemMeta axemeta = sword.getItemMeta();
			ItemMeta shovelmeta = sword.getItemMeta();
			ItemMeta shieldmeta = sword.getItemMeta();
			helmmeta.setDisplayName(ChatColor.DARK_RED + "Cool Helmet Name");
			helmmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true); //Enchantment, Level, ignore restrictions t/f
			helmmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
			helmmeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
			helmmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
			helmmeta.addEnchant(Enchantment.OXYGEN, 5, true);
			helmmeta.addEnchant(Enchantment.THORNS, 5, true);
			helmmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			helmmeta.addEnchant(Enchantment.MENDING, 1, true);
			chestmeta.setDisplayName(ChatColor.DARK_RED + "Cool Chestplate Name");
			chestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			chestmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
			chestmeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
			chestmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
			chestmeta.addEnchant(Enchantment.THORNS, 5, true);
			chestmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			chestmeta.addEnchant(Enchantment.MENDING, 1, true);
			legsmeta.setDisplayName(ChatColor.DARK_RED + "Cool Leggings Name");
			legsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			legsmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
			legsmeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
			legsmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
			legsmeta.addEnchant(Enchantment.THORNS, 5, true);
			legsmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			legsmeta.addEnchant(Enchantment.MENDING, 1, true);
			bootsmeta.setDisplayName(ChatColor.DARK_RED + "Cool Boots Name");
			bootsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			bootsmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
			bootsmeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
			bootsmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
			bootsmeta.addEnchant(Enchantment.THORNS, 5, true);
			bootsmeta.addEnchant(Enchantment.DEPTH_STRIDER, 5, true);
			bootsmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			bootsmeta.addEnchant(Enchantment.MENDING, 1, true);
			swordmeta.setDisplayName(ChatColor.DARK_RED + "Cool Sword Name");
			swordmeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
			swordmeta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 5, true);
			swordmeta.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
			swordmeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
			swordmeta.addEnchant(Enchantment.SWEEPING_EDGE, 5, true);
			swordmeta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
			swordmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			swordmeta.addEnchant(Enchantment.MENDING, 1, true);
			pickmeta.setDisplayName(ChatColor.DARK_RED + "Cool Pickaxe Name");
			pickmeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
			pickmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
			pickmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			pickmeta.addEnchant(Enchantment.MENDING, 1, true);
			axemeta.setDisplayName(ChatColor.DARK_RED + "Cool Axe Name");
			axemeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
			axemeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
			axemeta.addEnchant(Enchantment.DURABILITY, 5, true);
			axemeta.addEnchant(Enchantment.MENDING, 1, true);
			shovelmeta.setDisplayName(ChatColor.DARK_RED + "Cool Shovel Name");
			shovelmeta.addEnchant(Enchantment.DIG_SPEED, 5, true);
			shovelmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
			shovelmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			shovelmeta.addEnchant(Enchantment.MENDING, 1, true);
			shieldmeta.setDisplayName(ChatColor.DARK_RED + "Cool Shield Name");
			shieldmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
			shieldmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 5, true);
			shieldmeta.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
			shieldmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 5, true);
			shieldmeta.addEnchant(Enchantment.THORNS, 5, true);
			shieldmeta.addEnchant(Enchantment.DURABILITY, 5, true);
			shieldmeta.addEnchant(Enchantment.MENDING, 1, true);
			helm.setItemMeta(helmmeta);
			chest.setItemMeta(chestmeta);
			legs.setItemMeta(legsmeta);
			boots.setItemMeta(bootsmeta);
			sword.setItemMeta(swordmeta);
			pick.setItemMeta(pickmeta);
			axe.setItemMeta(axemeta);
			shovel.setItemMeta(shovelmeta);
			shield.setItemMeta(shieldmeta);
			Inventory inventory = ((Player)sender).getInventory();
			inventory.addItem(helm, chest, legs, boots, pick, axe, shovel, shield, sword);
			return true;			
		}
}
		//Heal command
		if(command.getName().equalsIgnoreCase("heal")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.setHealth(20);
				sender.sendMessage(ChatColor.GREEN + "You have been healed.");
				return true;
						}else{
						sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
						return true;
				}
		}
			return true;
	}

}
