package fr.gentilgentil.plugin.commands;

import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CmdVoteGraine implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("voteGraine")){

                ItemStack customSeeds = new ItemStack(Material.SEEDS, 1);
                ItemMeta propertiesCustomSeeds = customSeeds.getItemMeta();
                propertiesCustomSeeds.setDisplayName("§4Graine d'Aldéramin");
                propertiesCustomSeeds.setLore(Arrays.asList("Cette graine", "te permettra d'ouvrir", "la box Alderamin"));
                propertiesCustomSeeds.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10000, true);
                customSeeds.setItemMeta(propertiesCustomSeeds);
                player.getInventory().addItem(customSeeds);
                return true;
            }

        }

        return false;

    }

}


