package me.recior.postmanbot.bot;

import me.recior.postmanbot.Main;
import me.recior.postmanbot.bot.commands.helpCommand;
import me.recior.postmanbot.bot.commands.sizeCommand;

public class CommandRegisterer{


    //Called in the Main class (me.recior.postmanbot.||Main.java||), registers all commands.
    //TODO make it better..... bruh I am tired of writing this...
    public static void reg(){

        CommandUtil.registerCommand(new helpCommand());
        CommandUtil.registerCommand(new sizeCommand());

        //Logging every cmd for registering, doesn't work but still works /shrug
        CommandUtil.cmds.forEach(c -> Main.log.info("Registered " + c.getName() + " Command!"));
    }


}
