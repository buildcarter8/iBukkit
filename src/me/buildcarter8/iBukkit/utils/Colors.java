package me.buildcarter8.iBukkit.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;

/*
* Copyright (c) 2011-2016, Steven Lawson
* Copyright (c) 2012-2016, Jerom van der Sar
*  
* Licensed under the TotalFreedom General License (TFGL) Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* https://github.com/TotalFreedom/License/blob/master/LICENSE.md
*/
public class Colors 
{

	private static final Random RANDOM = new Random();
	public static final List<ChatColor> CHAT_COLOR_POOL = Arrays.asList(
            ChatColor.DARK_BLUE,
            ChatColor.DARK_GREEN,
            ChatColor.DARK_AQUA,
            ChatColor.DARK_RED,
            ChatColor.DARK_PURPLE,
            ChatColor.GOLD,
            ChatColor.BLUE,
            ChatColor.GREEN,
            ChatColor.AQUA,
            ChatColor.RED,
            ChatColor.LIGHT_PURPLE,
            ChatColor.YELLOW);
	//Allows random chat colors
    public static ChatColor randChatColor()
    {
        return CHAT_COLOR_POOL.get(RANDOM.nextInt(CHAT_COLOR_POOL.size()));
    }
    
    
}