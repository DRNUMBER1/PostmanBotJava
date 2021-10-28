package me.recior.postmanbot.bot;

import me.recior.postmanbot.Main;
import me.recior.postmanbot.bot.commands.helpCommand;
import me.recior.postmanbot.bot.commands.sizeCommand;

public class CommandRegisterer{

    public static void reg(){

        CommandUtil.registerCommand(new helpCommand());
        CommandUtil.registerCommand(new sizeCommand());


        CommandUtil.cmds.forEach(c -> {
            Main.log.info("Registered " + c.getName() + " Command!");
        });
    }


}
