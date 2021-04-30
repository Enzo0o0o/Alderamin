package fr.gentilgentil.plugin.commands;

import fr.gentilgentil.plugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdDiscord implements CommandExecutor {

    private Main main;

    public CmdDiscord(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("discord")){
                player.sendMessage(main.getConfig().getString("messages.discord").replace("&", "§"));
                return true;
            }

        }

        return false;
    }

}
