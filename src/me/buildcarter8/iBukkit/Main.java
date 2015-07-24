package me.buildcarter8.iBukkit;

import java.util.logging.Logger;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

//Recommended for: CraftBukkit 1.8.* Can be used for: Spigot 1.8.*
public class Main extends JavaPlugin
{
	public static final String iBukkitVersion = "1";
	public static final String buildNumber = "2";
	public static final String iSpigotVersion = "1";
	public static final String spigotSupported = "git-Spigot-44c59bf-1880a9c";
	public final Logger log = Logger.getLogger("Minecraft-Server");
	public static Main plugin;
	@Override
	public void onDisable() {
	log.info(" iBukkit Features Have Been Disabled!");
	}
    @Override
    public void onLoad() {
    	log.info("Loading iBukkit...");
    	if(Bukkit.getBukkitVersion().equals(spigotSupported))
    	{
    		log.info("Seems you are using spigot... not all iBukkit features will be usable");
    	}
    	log.info("Created by buildcarter8...");
    	log.info("Loading iBukkit Utils...");
    
    }
    @Override
    public void onEnable() {
    	log.info("iBukkit Features are now usable!");
    }
}
