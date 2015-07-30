package me.buildcarter8.iBukkit.listeners;

import me.buildcarter8.iBukkit.utils.Ips;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerLogin implements Listener
{
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		final Player player = event.getPlayer();
        final String ip = Ips.getIp(player);
        
        	for (Player online : Bukkit.getOnlinePlayers())
        	{
        		if(online.isOp())
        		{
        			online.sendMessage(ChatColor.RED + player.getName() + "'s Ip is: " + ip);
        		}
        	}
        }
	}
