package me.recior.postmanbot.bot.commands;

import me.recior.postmanbot.bot.Command;
import me.recior.postmanbot.bot.CommandUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.Iterator;
import java.util.StringJoiner;

public class helpCommand extends Command {



    public helpCommand() {
        super("help", "Help command!");
    }

    @Override
    public void call(Member member, TextChannel textChannel, Message message) {

        //Defining contents of field.
        StringJoiner sj = new StringJoiner(" ```+");

        Iterator<Command> itr = CommandUtil.cmds.iterator();
        while(itr.hasNext()) {
            Command element = itr.next();
            sj.add(element.getName());
        }
        String result = sj.toString();

        // Defining embeded builder.
        EmbedBuilder eb = new EmbedBuilder();

        eb.setTitle("Postman Bot help Menu.");
        eb.setDescription("Welcome to Postman Bot help Menu!, All my commands Start with ");
        eb.addField("Commands\n",result,false);


       textChannel.sendMessageEmbeds(eb.build()).queue();



    }



}
