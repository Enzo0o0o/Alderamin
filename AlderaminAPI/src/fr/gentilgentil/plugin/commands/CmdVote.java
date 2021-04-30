package fr.gentilgentil.plugin.commands;

import fr.gentilgentil.plugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdVote implements CommandExecutor {

    private Main main;

    public CmdVote(Main main) {
        this.main = main;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player){
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("vote")){

                player.sendMessage(main.getConfig().getString("messages.vote").replace("&", "§"));
                return true;
            }

        }

        return false;

    }
}
