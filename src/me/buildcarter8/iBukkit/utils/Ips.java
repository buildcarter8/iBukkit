package me.buildcarter8.iBukkit.utils;

import org.bukkit.OfflinePlayer;

public class Ips 
{
    public static String getIp(OfflinePlayer player)
    {
        if (player.isOnline())
        {
            return player.getPlayer().getAddress().getAddress().getHostAddress().trim();
        }
		return null;
}
}
