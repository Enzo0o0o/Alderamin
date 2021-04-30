package fr.gentilgentil.plugin.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class COMPASSListener implements Listener {

    @EventHandler
    public void OnJoin (PlayerJoinEvent event) {

        Player player = event.getPlayer();

        player.getInventory().clear();
        player.getInventory().addItem(new ItemStack(Material.COMPASS, 2304));
        player.setItemInHand(new ItemStack(Material.COMPASS, 124));
        player.updateInventory();
    }

}
