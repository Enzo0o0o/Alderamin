package fr.gentilgentil.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdGrades implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player){
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("grades")){

                player.sendMessage("§aGrade Apollon :\n" +
                        "\n" +
                        "\n" +
                        ">>> Préfix \"§6Apollon§a\" en jeu\n" +
                        "\n" +
                        "\n" +
                        ">>> 3 homes\n" +
                        "\n" +
                        "\n" +
                        ">>> /apolkit pour obtenir le kit Apollon" +
                        "\n" +
                        "\n" +
                        ">>> 200 blocs de claims offerts ( claims perso )\n" +
                        "\n" +
                        "\n" +
                        ">>> /ec");

                player.sendMessage("\n" +
                        "§aGrade Arès :\n" +
                        "\n" +
                        "\n" +
                        ">>> Préfix \"Arès\" en jeu\n" +
                        "\n" +
                        "\n" +
                        ">>> 5 homes\n" +
                        "\n" +
                        "\n" +
                        ">>> /areskit pour obtenir le kit Ares" +
                        "\n" +
                        "\n" +
                        ">>> 500 blocs de claims offerts ( claims perso )\n" +
                        "\n" +
                        "\n" +
                        ">>> /ec\n" +
                        "\n" +
                        "\n" +
                        ">>> /craft");

                player.sendMessage("\n" +
                        "§aGrade Poséidon :\n" +
                        "\n" +
                        "\n" +
                        ">>> Préfix \"§bPoseidon§a\" en jeu\n" +
                        "\n" +
                        "\n" +
                        ">>> 10 homes\n" +
                        "\n" +
                        "\n" +
                        ">>> /posekit pour obtenir le kit Poseidon" +
                        "\n" +
                        "\n" +
                        ">>> 1000 blocs de claims offerts ( claims perso )\n" +
                        "\n" +
                        "\n" +
                        ">>> /feed ( rempli la barre de nourriture )\n" +
                        "\n" +
                        "\n" +
                        ">>> /fly\n" +
                        "\n" +
                        "\n" +
                        ">>> /nick\n" +
                        "\n" +
                        "\n" +
                        ">>> /craft\n" +
                        "\n" +
                        "\n" +
                        ">>> /ec\n" +
                        "\n" +
                        "\n" +
                        ">>> /back");

                player.sendMessage("\n" +
                        "§aGrade Zeus :\n" +
                        "\n" +
                        "\n" +
                        ">>> Préfix \"§eZeus§a\" en jeu\n" +
                        "\n" +
                        "\n" +
                        ">>> 15 homes\n" +
                        "\n" +
                        "\n" +
                        ">>> /zeuskit pour obtenir le kit Zeus" +
                        "\n" +
                        "\n" +
                        ">>> 1500 blocs de claims offerts ( claims perso )\n" +
                        "\n" +
                        "\n" +
                        ">>> /feed ( rempli la barre de nourriture )\n" +
                        "\n" +
                        "\n" +
                        ">>> /fly\n" +
                        "\n" +
                        "\n" +
                        ">>> /speed\n" +
                        "\n" +
                        "\n" +
                        ">>> /nick\n" +
                        "\n" +
                        "\n" +
                        ">>> /craft\n" +
                        "\n" +
                        "\n" +
                        ">>> /ec\n" +
                        "\n" +
                        "\n" +
                        ">>> /back");

                player.sendMessage("\n" +
                        "§aGrade Hadès :\n" +
                        "\n" +
                        "\n" +
                        ">>> Préfix \"§4Hadès§a\" en jeu\n" +
                        "\n" +
                        "\n" +
                        ">>> 20 homes\n" +
                        "\n" +
                        "\n" +
                        ">>> /hadeskit pour obtenir le kit Hades" +
                        "\n" +
                        "\n" +
                        ">>> 2000 blocs de claims offerts ( claims perso )\n" +
                        "\n" +
                        "\n" +
                        ">>> /heal ( rempli la barre de nourriture et de vie)\n" +
                        "\n" +
                        "\n" +
                        ">>> /fly\n" +
                        "\n" +
                        "\n" +
                        ">>> /speed\n" +
                        "\n" +
                        "\n" +
                        ">>> /repair ( répare les objets vanilla )\n" +
                        "\n" +
                        "\n" +
                        ">>> /ec\n" +
                        "\n" +
                        "\n" +
                        ">>> /craft\n" +
                        "\n" +
                        "\n" +
                        ">>> /back\n" +
                        "\n" +
                        "\n" +
                        ">>> /nick");
                return true;
            }

        }

        return false;
    }
}
