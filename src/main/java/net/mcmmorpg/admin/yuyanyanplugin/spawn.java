package net.mcmmorpg.admin.yuyanyanplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * SpawnとSetSpawnの実装
 * @author kojima1021
 */
public class spawn implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	  //spawn
	  if(cmd.getName().equalsIgnoreCase("spawn")&& (sender instanceof Player)){
          if(!sender.hasPermission("yuyanyan.user.spawn")){
              sender.sendMessage(ChatColor.GOLD + "[ゆーやん生活鯖]"
              + ChatColor.RED + "あなたは、このコマンドを実行する権限を所有していません。(yuyanyan.user.spawn)");
              return true;
          }
	    ((Player)sender).teleport( ((Player)sender).getWorld().getSpawnLocation() );
        sender.sendMessage(ChatColor.GOLD + "[ゆーやん生活鯖]"
        + ChatColor.RESET + "Spawnへテレポートしました。");
	    return true;
	  }
	  //setspawn
	  if(cmd.getName().equalsIgnoreCase("setspawn")&& (sender instanceof Player)){
          if(!sender.hasPermission("yuyanyan.admin.setspawn")){
              sender.sendMessage(ChatColor.GOLD + "[ゆーやん生活鯖]"
              + ChatColor.RED + "あなたは、このコマンドを実行する権限を所有していません。(yuyanyan.admin.setspawn)");
              return true;
          }
	    ((Player)sender).getWorld().setSpawnLocation( ((Player)sender).getLocation().getBlockX(),((Player)sender).getLocation().getBlockY(),((Player)sender).getLocation().getBlockZ() );
        sender.sendMessage(ChatColor.GOLD + "[ゆーやん生活鯖]"
        + ChatColor.RESET + "Spawnポイントをセットしました。");
	    return true;
	  }
	return false;
}
}
