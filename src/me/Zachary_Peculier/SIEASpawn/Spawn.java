package me.Zachary_Peculier.SIEASpawn;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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
		 		player.teleport(player.getWorld().getSpawnLocation());
		 	}
		 	return true;
	    }
	
}
