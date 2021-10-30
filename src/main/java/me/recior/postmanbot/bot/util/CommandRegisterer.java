package me.recior.postmanbot.bot.util;

import me.recior.postmanbot.Main;
import me.recior.postmanbot.bot.commands.utility.get;
import me.recior.postmanbot.bot.commands.utility.help;
import me.recior.postmanbot.bot.commands.fun.size;
import me.recior.postmanbot.bot.util.CommandUtil;

public class CommandRegisterer{

    //Called in the Main class (me.recior.postmanbot.||Main.java||), registers all commands.
    //TODO make it better..... bruh I am tired of writing this...
    public static void reg(){

        CommandUtil.registerCommand(new help());
        CommandUtil.registerCommand(new size());
        CommandUtil.registerCommand(new get());

        //Logging every cmd for registering, doesn't work but still works /shrug
         int i;
        for(i = 0; i < CommandUtil.cmds.size(); i++){
           String n = CommandUtil.cmds.get(i).getName();
           Main.log.info("Registered " + n + " Command!");
        }
    }


}
