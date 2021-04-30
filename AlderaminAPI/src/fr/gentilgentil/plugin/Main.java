package fr.gentilgentil.plugin;

import fr.gentilgentil.plugin.commands.*;
import fr.gentilgentil.plugin.kits.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        System.out.println("AlderaminAPI ON !");
        getCommand("voteGraine").setExecutor(new CmdVoteGraine());
        getCommand("StuffDeGentilGentil").setExecutor(new CmdStuff2Gentil());
        getCommand("vote").setExecutor(new CmdVote(this));
        getCommand("twitch").setExecutor(new CmdTwitch());
        getCommand("duel").setExecutor(new CmdDuel());
        getCommand("tpduel").setExecutor(new CmdTpDuel());
        getCommand("tpshops").setExecutor(new CmdTpShops());
        getCommand("discord").setExecutor(new CmdDiscord(this));
        //les commands juste en bas ce sont les kits//
        getCommand("AldeKit").setExecutor(new AldeKit());
        getCommand("ApolKit").setExecutor(new ApolKit());
        getCommand("AresKit").setExecutor(new AresKit());
        getCommand("PoseKit").setExecutor(new PoseKit());
        getCommand("ZeusKit").setExecutor(new ZeusKit());
        getCommand("HadesKit").setExecutor(new HadesKit());
        //c'etait tous les kits//
        getCommand("Grades").setExecutor(new CmdGrades());
    }

    @Override
    public void onDisable() {
        System.out.println("AlderaminAPI OFF !");
    }
}
