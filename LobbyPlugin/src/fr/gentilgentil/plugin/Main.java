package fr.gentilgentil.plugin;

import org.bukkit.plugin.java.JavaPlugin;

import fr.gentilgentil.plugin.listeners.COMPASSListener;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("Plugin Lobby ON ! ");
		getServer().getPluginManager().registerEvents(new COMPASSListener(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin Lobby OFF ! ");
	}	

}
