package me.buildcarter8.iBukkit.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

//This util refers to message sending and broadcasting from a plugin made easier
public class Messages 
{
	//Easier broadcasting a message
  public static void bcMessage(String message, ChatColor chatcolor)
  {
	  Messages.bcMessage(message, null);
  }
  //Easier sending a player a message
  public static void playerMsg(CommandSender sender, String message, Color color)
  {
	  //just type Messages.playerMsg(ChatColor.blah + blah)
      sender.sendMessage(color + message);
  }
  //Error messages
  public static String error = ChatColor.RED + "[iBukkit] Oops! there seems to be an error with that please contact the developer of the plugin with the command used";
}
