package me.buildcarter8.iBukkit.utils;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
//import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

//This util refers to message sending and broadcasting from a plugin made easier
public class Messages 
{
	//Easier broadcasting a message
    public static void bcMessage(String message, ChatColor color)
    {
        for (Player player : Bukkit.getOnlinePlayers())
        {
            player.sendMessage((color == null ? "" : color) + message);
        }
    }
  public static void bcMessage(String message)
  {
	  Messages.bcMessage(message, null);
  }
  //Easier sending a player a message 

  public static void playerMsg(CommandSender sender, String message, Color gray)
     {
    //just type Messages.playerMsg(ChatColor.blah + blah)
      sender.sendMessage(gray + message);
  }
  public static void playerMsg(CommandSender sender, String message)
  {
      Messages.playerMsg(sender, message, Color.WHITE);
  }
  

  //Error messages
  public static String error = ChatColor.RED + "[iBukkit] Oops! there seems to be an error with that please contact the developer of the plugin with the command used";
}
