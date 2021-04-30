package fr.gentilgentil.plugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CmdStuff2Gentil implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player){
            Player player = (Player)sender;

            if (cmd.getName().equalsIgnoreCase("StuffDeGentilGentil")) {

                ItemStack DiamondHelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
                ItemMeta propertiesDiamondHelmet = DiamondHelmet.getItemMeta();
                propertiesDiamondHelmet.setDisplayName("§4Casque de GentilGentil");
                propertiesDiamondHelmet.setLore(Arrays.asList("le casque de Gentil", "ne doit jamais tombé entre", "les mains des joueurs"));
                propertiesDiamondHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10000, true);
                propertiesDiamondHelmet.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10000, true);
                propertiesDiamondHelmet.addEnchant(Enchantment.PROTECTION_FIRE, 10000, true);
                propertiesDiamondHelmet.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1000, true);
                propertiesDiamondHelmet.addEnchant(Enchantment.PROTECTION_FALL, 10000, true);
                propertiesDiamondHelmet.addEnchant(Enchantment.DURABILITY, 10000, true);
                DiamondHelmet.setItemMeta(propertiesDiamondHelmet);
                player.getInventory().setHelmet(DiamondHelmet);

                ItemStack DiamondChestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
                ItemMeta propertiesDiamondChestplate = DiamondChestplate.getItemMeta();
                propertiesDiamondChestplate.setDisplayName("§4Plastron de Jango");
                propertiesDiamondChestplate.setLore(Arrays.asList("Pareil que pour","le casque..."));
                propertiesDiamondChestplate.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10000, true);
                propertiesDiamondChestplate.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10000, true);
                propertiesDiamondChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 10000, true);
                propertiesDiamondChestplate.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1000, true);
                propertiesDiamondChestplate.addEnchant(Enchantment.PROTECTION_FALL, 10000, true);
                propertiesDiamondChestplate.addEnchant(Enchantment.DURABILITY, 10000, true);
                DiamondChestplate.setItemMeta(propertiesDiamondChestplate);
                player.getInventory().setChestplate(DiamondChestplate);

                ItemStack DiamondLeggins = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
                ItemMeta propertiesDiamondLeggins = DiamondChestplate.getItemMeta();
                propertiesDiamondLeggins.setDisplayName("§4Jambieres de Lucifer");
                propertiesDiamondLeggins.setLore(Arrays.asList("Pareil que pour","le plastron..."));
                propertiesDiamondLeggins.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10000, true);
                propertiesDiamondLeggins.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10000, true);
                propertiesDiamondLeggins.addEnchant(Enchantment.PROTECTION_FIRE, 10000, true);
                propertiesDiamondLeggins.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1000, true);
                propertiesDiamondLeggins.addEnchant(Enchantment.PROTECTION_FALL, 10000, true);
                propertiesDiamondLeggins.addEnchant(Enchantment.DURABILITY, 10000, true);
                DiamondLeggins.setItemMeta(propertiesDiamondLeggins);
                player.getInventory().setLeggings(DiamondLeggins);

                ItemStack DiamondBoots = new ItemStack(Material.DIAMOND_BOOTS, 1);
                ItemMeta propertiesDiamondBoots = DiamondBoots.getItemMeta();
                propertiesDiamondBoots.setDisplayName("§4Bottes de La V2 d'Alderamin");
                propertiesDiamondBoots.setLore(Arrays.asList("Pareil que pour","les jambieres..."));
                propertiesDiamondBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10000, true);
                propertiesDiamondBoots.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10000, true);
                propertiesDiamondBoots.addEnchant(Enchantment.PROTECTION_FIRE, 10000, true);
                propertiesDiamondBoots.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1000, true);
                propertiesDiamondBoots.addEnchant(Enchantment.PROTECTION_FALL, 10000, true);
                propertiesDiamondBoots.addEnchant(Enchantment.DURABILITY, 10000, true);
                DiamondBoots.setItemMeta(propertiesDiamondBoots);
                player.getInventory().setBoots(DiamondBoots);

                return true;
            }

        }

        return false;

    }

}
