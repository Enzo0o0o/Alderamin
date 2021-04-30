package fr.gentilgentil.plugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdTwitch implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player)sender;

            if(cmd.getName().equalsIgnoreCase("twitch")) {

                if(args.length == 0) {
                    player.sendMessage("§eLa commande est : §5/twitch <message>");
                }

                else{

                    StringBuilder bc = new StringBuilder();
                    for(String part: args) {
                        bc.append(part).append(" ");
                    }

                    Bukkit.broadcastMessage("§5[§dAnnonce Twitch : " + player.getName() + "§5] " + bc.toString());

                }


                return true;

            }

        }

        return false;
    }

}
