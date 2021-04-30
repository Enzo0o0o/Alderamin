package fr.gentilgentil.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdTpDuel implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player){
            Player player = (Player)sender;

            if(cmd.getName().equalsIgnoreCase("tpduel")){
                player.sendMessage("L'arene arrive bientot ! ");
                player.teleport(new Location(Bukkit.getWorld("world"), 304, 4, 10));
                //player.teleport(new Location(Bukkit.getWorld("world"), 728, 227, -132));
                return true;
            }

        }

        return false;
    }

}
