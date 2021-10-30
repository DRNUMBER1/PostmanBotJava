package me.recior.postmanbot.bot.commands.utility;

import me.recior.postmanbot.bot.Command;
import me.recior.postmanbot.bot.util.Cmd;

public class get extends Command {
    public get() {
        super("get", "set", new String[]{"cake"});
    }

    @Override
    public void call(Cmd c) {

        c.getMessage().reply(c.getArgs()[0]).queue();

    }
}
