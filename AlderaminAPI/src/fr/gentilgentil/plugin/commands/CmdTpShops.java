package fr.gentilgentil.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdTpShops implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("tpshops")){
                player.teleport(new Location(Bukkit.getWorld("world"), 151, 47, -1.5));
                return true;
            }

        }

        return false;
    }

}
	