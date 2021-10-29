package me.recior.postmanbot.bot.commands;

import me.recior.postmanbot.bot.Command;
import me.recior.postmanbot.bot.CommandUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.Iterator;
import java.util.StringJoiner;


/*
*
* Help command for the bot, who cares? Like everyone knows how to use the bot duh....
*
* */
public class helpCommand extends Command {

    //registering....
    public helpCommand() {
        super("help", "Help command!");
    }

    //calling....
    @Override
    public void call(Member member, TextChannel textChannel, Message message) {

        //Defining contents of field.
        StringJoiner sj = new StringJoiner("``+");

        //iterating over the commands
        for (Command element : CommandUtil.cmds) {
            sj.add(element.getName() + ",");
        }
        String result = sj.toString();

        // Defining embedded builder.
        EmbedBuilder eb = new EmbedBuilder();
//embed titles
        eb.setTitle("Postman Bot help Menu.");
        eb.setDescription("Welcome to Postman Bot help Menu!, All my commands Start with ");
        eb.addField("Commands\n",result + "``",false);


       textChannel.sendMessageEmbeds(eb.build()).queue();



    }



}
