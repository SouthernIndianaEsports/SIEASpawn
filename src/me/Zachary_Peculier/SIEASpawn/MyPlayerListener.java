package me.Zachary_Peculier.SIEASpawn;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MyPlayerListener
{
	public static Spawn plugin;
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();
        if (player.hasPlayedBefore())
        {
            event.setJoinMessage(ChatColor.GREEN + player.getName() + ChatColor.RESET + " / " + ChatColor.DARK_GRAY + "has logged in!");
        }
        else
        {
            event.setJoinMessage(ChatColor.GOLD + "Welcome " + player.getName() + " to USI Factions!");
        }
    }
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event)
	{
		Player player = event.getPlayer();
		event.setQuitMessage(ChatColor.GREEN + player.getName() + ChatColor.RESET + " / " + ChatColor.DARK_GRAY + "has logged out!");
	}
}
