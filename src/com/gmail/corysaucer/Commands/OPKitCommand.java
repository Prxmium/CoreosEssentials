package com.gmail.corysaucer.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.gmail.corysaucer.Config;

public class OPKitCommand implements CommandExecutor {
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
			//Gives an OP set of items
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
		
		
			if(sender instanceof Player) {
			Player player = (Player) sender;
			player.hasPermission("coreo.opkit");	
			command.getName().equalsIgnoreCase("opkit");
			helmmeta.setDisplayName(Config.get().getString("OPKitHelmetName"));
			helmmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true); //Enchantment, Level, ignore restrictions t/f
			helmmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
			helmmeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
			helmmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
			helmmeta.addEnchant(Enchantment.OXYGEN, 10, true);
			helmmeta.addEnchant(Enchantment.THORNS, 10, true);
			helmmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			helmmeta.addEnchant(Enchantment.MENDING, 1, true);
			chestmeta.setDisplayName(Config.get().getString("OPKitChestplateName"));
			chestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
			chestmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
			chestmeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
			chestmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
			chestmeta.addEnchant(Enchantment.THORNS, 10, true);
			chestmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			chestmeta.addEnchant(Enchantment.MENDING, 1, true);
			legsmeta.setDisplayName(Config.get().getString("OPKitLeggingsName"));
			legsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
			legsmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
			legsmeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
			legsmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
			legsmeta.addEnchant(Enchantment.THORNS, 10, true);
			legsmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			legsmeta.addEnchant(Enchantment.MENDING, 1, true);
			bootsmeta.setDisplayName(Config.get().getString("OPKitBootsName"));
			bootsmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
			bootsmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
			bootsmeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
			bootsmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
			bootsmeta.addEnchant(Enchantment.THORNS, 10, true);
			bootsmeta.addEnchant(Enchantment.DEPTH_STRIDER, 10, true);
			bootsmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			bootsmeta.addEnchant(Enchantment.MENDING, 1, true);
			swordmeta.setDisplayName(Config.get().getString("OPKitSwordName"));
			swordmeta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
			swordmeta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);
			swordmeta.addEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);
			swordmeta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
			swordmeta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
			swordmeta.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
			swordmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			swordmeta.addEnchant(Enchantment.MENDING, 1, true);
			pickmeta.setDisplayName(Config.get().getString("OPKitPickaxeName"));
			pickmeta.addEnchant(Enchantment.DIG_SPEED, 10, true);
			pickmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
			pickmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			pickmeta.addEnchant(Enchantment.MENDING, 1, true);
			axemeta.setDisplayName(Config.get().getString("OPKitAxeName"));
			axemeta.addEnchant(Enchantment.DIG_SPEED, 10, true);
			axemeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
			axemeta.addEnchant(Enchantment.DURABILITY, 10, true);
			axemeta.addEnchant(Enchantment.MENDING, 1, true);
			shovelmeta.setDisplayName(Config.get().getString("OPKitShovelName"));
			shovelmeta.addEnchant(Enchantment.DIG_SPEED, 10, true);
			shovelmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
			shovelmeta.addEnchant(Enchantment.DURABILITY, 10, true);
			shovelmeta.addEnchant(Enchantment.MENDING, 1, true);
			shieldmeta.setDisplayName(Config.get().getString("OPKitShieldName"));
			shieldmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
			shieldmeta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
			shieldmeta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
			shieldmeta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
			shieldmeta.addEnchant(Enchantment.THORNS, 10, true);
			shieldmeta.addEnchant(Enchantment.DURABILITY, 10, true);
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
			player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			return true;
		}else{
			sender.sendMessage(ChatColor.RED + "You don't meet the conditions required to run this command.");
			return true;
		}
			
		}
		
		
		
	} 
		




