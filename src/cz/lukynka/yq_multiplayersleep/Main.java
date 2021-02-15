package cz.lukynka.yq_multiplayersleep;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {

	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "----------------------------------------");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "Multiplayer Sleep");
		Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + "by " +ChatColor.GOLD +"LukynkaCZE " +ChatColor.YELLOW +"for " +ChatColor.GOLD +"yq__");
		Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD + "----------------------------------------");
		
		Bukkit.getServer().getPluginManager().registerEvents(new Sleep(this), this);
		new Help(this);
		
	}
	
}
