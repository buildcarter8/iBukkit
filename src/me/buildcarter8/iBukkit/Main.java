package me.buildcarter8.iBukkit;

import java.util.logging.Logger;
import me.buildcarter8.iBukkit.utils.Messages;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

//Recommended for: CraftBukkit 1.8.* Can be used for: Spigot 1.8.6
public class Main extends JavaPlugin
{
	public static final String iBukkitVersion = "3";
	public static final String buildNumber = "0";
	public static final String SpigotVersion = "1.8.6" + "1.8.7";
	public static final String spigot = "Spigot-1.8.6+";
	public static final String pluginfile = "plugin.yml";
	public final Logger log = Logger.getLogger("Minecraft-Server");
	public static Main plugin;
	@Override
	public void onDisable() {
	log.info(" iBukkit Features Have Been Disabled!");
	}
    @Override
    public void onLoad() {
    	log.info("Loading iBukkit...");
    	log.info("Created by buildcarter8...");
    	log.info("Loading iBukkit Utils...");
    
    }
    @Override
    public void onEnable() {
    	log.info("iBukkit Features are now usable!");
    }
    //TODO: Code it better
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		 Player player = (Player) sender;
		 if(cmd.getName().equalsIgnoreCase("ibukkit"))
		 {
			 sender.sendMessage(ChatColor.AQUA + "iBukkit -- Version " + iBukkitVersion + "." + buildNumber);
			 sender.sendMessage(ChatColor.AQUA + "iBukkit was designed to help the average developer and make it easier for him/her");
		 }
		return true;
		 
    }
		 
}
