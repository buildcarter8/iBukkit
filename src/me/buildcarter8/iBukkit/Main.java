package me.buildcarter8.iBukkit;

import java.util.logging.Logger;

import me.buildcarter8.iBukkit.listeners.PlayerLogin;
import me.buildcarter8.iBukkit.utils.Ips;
import me.buildcarter8.iBukkit.utils.Messages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

//Recommended for: CraftBukkit 1.8.6 Can be used for: Spigot 1.8.6 and higher
public class Main extends JavaPlugin
{
	public static final String iBukkitVersion = "4";
	public static final String buildNumber = "0";
	public static final String SpigotVersion = "1.8.6" + "1.8.7" + "1.8.8" + "1.8.9"+ "1.9";
	public static final String spigot = "Spigot-1.8.8";
	public static final String pluginfile = "plugin.yml";
	public final Logger log = Logger.getLogger("Spigot-Server");
	public static Main plugin;
	@Override
	public void onDisable() {
	log.info(" iBukkit Features Have Been Disabled!");
	}
    @Override
    public void onLoad() {
    	log.info("Loading iBukkit...");
    	log.info("Created by buildcarter8...");
    	log.info("Recreated by Minedevelop ORG. Dec. 31. 2015");
    	log.info("Loading iBukkit Utils...");
    
    }
    @Override
    public void onEnable() {
    	log.info("iBukkit Features are now usable!");
    	final PluginManager pm = Bukkit.getServer().getPluginManager();
   	 pm.registerEvents(new PlayerLogin(), this);
    }
    //TODO: Code it better
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		 Player player = (Player) sender;
		 if(cmd.getName().equalsIgnoreCase("ibukkit"))
		 {
			 sender.sendMessage(ChatColor.AQUA + "iBukkit -- Version " + iBukkitVersion + "." + buildNumber);
			 sender.sendMessage(ChatColor.AQUA + "iBukkit was designed to help the average developer and make it easier for him/her");
		 }
		 else if(cmd.getName().equalsIgnoreCase("getIp"))
		 {
			 if(sender.isOp())
			 {
			 if (args.length == 0)
			 {
			 sender.sendMessage(ChatColor.RED + "Your ip is: " + Ips.getIp(player));
			 }
			 else if (args.length == 1) {
			        if (player.getServer().getPlayer(args[0]) != null) {
			          Player targetPlayer = player.getServer().getPlayer(args[0]);
			          sender.sendMessage(ChatColor.RED + targetPlayer.getName() + "'s ip is: " + Ips.getIp(targetPlayer));
			        }
			 }
			        else
			        	sender.sendMessage(ChatColor.RED + "NOPE");
			 
		 }
		return true;
		 
    }
		return true;
		 
}
    {
}
}
