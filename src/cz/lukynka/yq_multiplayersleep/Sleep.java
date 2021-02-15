package cz.lukynka.yq_multiplayersleep;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class Sleep extends BukkitRunnable implements Listener {

	Main plugin;
	
	public Sleep(Main plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerEnterBed(PlayerBedEnterEvent event) {
		long time = event.getPlayer().getWorld().getTime();
		if(time > 0 && time < 12300) {
			if(event.getPlayer().getWorld().hasStorm() == true) {
				event.getPlayer().getWorld().setStorm(false);
				Bukkit.broadcastMessage(ChatColor.WHITE +event.getPlayer().getName() +ChatColor.GRAY +" se vyspal/a a záhadnì pøestalo pršet!");
				event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 10, 2);
			} else {
			event.getPlayer().sendMessage(ChatColor.RED + "Nemùžeš spát ve dne nebo když prší!");
			event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 10, 1);
			}
		} else {
        event.getPlayer().getWorld().setTime(1);
      //  event.setCancelled(true);
        Bukkit.broadcastMessage(ChatColor.YELLOW +event.getPlayer().getName() +ChatColor.GOLD +" se vyspal/a.. dobré ráno!");
        event.getPlayer().getWorld().setStorm(false);
        event.getPlayer().setHealth(20);
        event.getPlayer().playSound(event.getPlayer().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 10, 2);
        event.getPlayer().setBedSpawnLocation((Location) event.getBed());
		}
	}


	public boolean day() {
	    long time = Bukkit.getServer().getWorld("world").getTime();

	    if(time > 0 && time < 12300) {
	        return true;
	    } else {
	        return false;
	    }
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
}
