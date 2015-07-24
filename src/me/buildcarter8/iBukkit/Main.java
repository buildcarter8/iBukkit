package me.buildcarter8.iBukkit;

import java.util.logging.Logger;


import org.bukkit.plugin.java.JavaPlugin;

//WARNING: THIS IS ONLY FOR CRAFTBUKKIT IF YOU ARE USING SPIGOT PLEASE DOWNLOAD SPIGOT BUILD
//Recommended for: CraftBukkit 1.8.6 Can be used for 1.8+
public class Main extends JavaPlugin
{
	public static final String iBukkitVersion = "1";
	public static final String buildNumber = "1";
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
}
