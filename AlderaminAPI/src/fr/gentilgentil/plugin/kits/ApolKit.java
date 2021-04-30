package fr.gentilgentil.plugin.kits;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class ApolKit implements CommandExecutor {

    public Map<String, Long> cooldowns = new HashMap<String, Long>();

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player){
            Player player = (Player)sender;

            if(cmd.getName().equalsIgnoreCase("ApolKit")){

                int seconds = 86400;
                long timeLeft =((cooldowns.getOrDefault(player.getName(), 0l) / 1000) + seconds) - (System.currentTimeMillis() / 1000);
                if (timeLeft > 0){

                    long timeLeftBased = timeLeft;
                    long timeLeftSeconds = timeLeftBased%60;
                    long timeLeftMinutes = (timeLeftBased/60)%60;
                    long timeLeftHeures = (timeLeftBased/60)/60;

                    //Instant instantTimeLeft = Instant.ofEpochSecond((cooldowns.getOrDefault(player.getName(), 0l) + seconds) - System.currentTimeMillis());
                    //SimpleDateFormat format = new SimpleDateFormat("YYYY MM WW DD HH:mm:SS");
                    //String timeFormatted = format.format(Date.from(instantTimeLeft));

                    player.sendMessage("§aIl te reste §c" + timeLeftHeures + "h " + timeLeftMinutes + "min "+ timeLeftSeconds + "s §apour recevoir ton kit §6Apollon §a!");
                }
                else {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4837 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4838 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4839 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4840 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4836 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4835 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4834 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4833 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 4832 1 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 322 8 ");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " 320 64 ");
                    player.sendMessage("§aTu viens de recevoir ton kit §6Apollon §a!");
                    cooldowns.put(player.getName(), System.currentTimeMillis());
                }

                return true;

            }

        }

        return false;

    }

}