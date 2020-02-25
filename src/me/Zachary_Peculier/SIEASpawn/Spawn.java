package me.Zachary_Peculier.SIEASpawn;

import java.util.List;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Spawn extends JavaPlugin
{
	public final java.util.logging.Logger logger = Logger.getLogger("Minecraft");
	public static Spawn plugin;

	@Override
	public void onDisable()
	{
		PluginDescriptionFile pdFile = this.getDescription();
		this.logger.info(pdFile.getName() + " Version " + pdFile.getVersion() + " Has Been Deactivated!");
	}

	public void onEnable()
	{
		PluginDescriptionFile pdFile = this.getDescription();
		this.logger.info(pdFile.getName() + " Version " + pdFile.getVersion() + " Has Been Activated!");
		getServer().getWorld("factionseb2").setSpawnLocation(0, 69, -0);
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player player = (Player) sender;

		if(commandLabel.equalsIgnoreCase("spawn"))
		{
			final List<Entity> ent = (List<Entity>) player.getNearbyEntities(30.0, 10.0, 30.0);
			if(ent == null)
			{
				player.sendMessage(ChatColor.GOLD + "Welcome to the SafeZone!");
				player.teleport(getServer().getWorld("factionseb2").getSpawnLocation());
			}
			else
			{
				player.sendMessage(ChatColor.DARK_GRAY + "You may not teleport at this time! Someone is nearby!");
			}
		}
		return true;
	}

}
