package fr.gentilgentil.plugin.commands;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdDuel implements CommandExecutor {

    private Map<Player, Player> players = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player){
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("duel"));
            player.sendMessage("Le duel arrive bientot !");
            
            if (args.length == 0) {
                player.sendMessage("§b/duel <joueur>");
                return true;
            }

            if(args.length == 1) {
                String targetName = args[0];

                if(args[0].equalsIgnoreCase("oui")) {

                    if(players.containsKey(player)) {
                        player.sendMessage("§bLe duel se lance !");

                        Player firstPlayerTarget = players.get(player);
                        firstPlayerTarget.sendMessage("§bLe duel se lance !");
                        Bukkit.broadcastMessage("§b[§aDuel§b] Un duel est en cour ! Fait /tpduel pour assister au combat !");
                        
                        player.teleport(new Location(Bukkit.getWorld("world"), 304, 4, -1));
                        firstPlayerTarget.teleport(new Location(Bukkit.getWorld("world"), 304, 4, -1));
                        
                        //player.teleport(new Location(Bukkit.getWorld("world"), 778, 219, -132));
                        //firstPlayerTarget.teleport(new Location(Bukkit.getWorld("world"), 727, 219, -131));

                        players.remove(player);
                    }
                        
                }

                else if(args[0].equalsIgnoreCase("non")) {
                    if(players.containsKey(player)) {
                        player.sendMessage("§bTu viens de refuser le duel...");

                        Player firstPlayerTarget = players.get(player);
                        firstPlayerTarget.sendMessage("§bLe joueur §c" + player.getName()+"§b a refusé le duel!");

                        players.remove(player);

                    }
                }

                else if(Bukkit.getPlayer(targetName) != null) {
                    Player target = Bukkit.getPlayer(targetName);

                    if(players.containsKey(target)) {
                        player.sendMessage("§bAttention ce joueur a deja une demande de duel en cours");
                        return true;
                    }

                    players.put(target, player);
                    player.sendMessage("§bTu viens de demander en duel §c" + targetName);
                    target.sendMessage("§bTu viens de recevoir une demande de duel de §c" + player.getName());
                    target.sendMessage("§bfait §2/duel oui §bpour accepter le duel !");
                    target.sendMessage("§bou §2/duel non §bpour le refuser !");
                }

                else {
                    player.sendMessage("§bLe joueur §c" + targetName+"§b n'est pas connecté sur aldéramin");
                }

                return true;

            }
            
        }

        return false;
    }

}