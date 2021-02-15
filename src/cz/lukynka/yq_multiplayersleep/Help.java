package cz.lukynka.yq_multiplayersleep;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Help implements CommandExecutor {

	private Main plugin;
	
	public Help(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("multiplayersleep").setExecutor(this);

	}
		
		
		
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("hmm.. konzole ne :P");
				return true;
		}
			
			Player player = (Player) sender;
			player.sendMessage(ChatColor.GOLD +"----------------------------------------");
			player.sendMessage(ChatColor.GOLD +"Multiplayer Sleep");
			player.sendMessage(ChatColor.YELLOW + "by " +ChatColor.GOLD +"LukynkaCZE " +ChatColor.YELLOW +"for " +ChatColor.GOLD +"yq__");
			player.sendMessage(" ");
			player.sendMessage(ChatColor.GRAY +"Pro pøeskoèení noci staèí aby spal pouze jeden hráè!");
			player.sendMessage(ChatColor.GOLD +"----------------------------------------");
			player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 10, 2);
		
			return false;
	}
}
