package me.recior.postmanbot.bot.commands.utility;

import me.recior.postmanbot.bot.Command;
import me.recior.postmanbot.bot.util.Cmd;
import me.recior.postmanbot.bot.util.CommandUtil;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;

import java.util.StringJoiner;

import static java.util.concurrent.TimeUnit.SECONDS;


/*
 *
 * Help command for the bot, who cares? Like everyone knows how to use the bot duh....
 *
 * */
public class help extends Command {

    //registering....
    public help() {
        super("help", "Help command!", new String[]{"welp"});
    }

    //calling....
    @Override
    public void call(Cmd c) {

        if(c.getArgs().length == 0){
            //Defining contents of field.
            StringJoiner sj = new StringJoiner("``+");
            //iterating over the commands
            int i;
            for (i = 0; i < CommandUtil.cmds.size(); i++) {
                // ``+element``,
                sj.add(CommandUtil.cmds.get(i).getName() + "``,");
            }
            String result = sj.toString();

            // Defining embedded builder.
            EmbedBuilder eb = new EmbedBuilder();
//embed titles
            eb.setTitle("Postman Bot help Menu.");
            eb.setDescription("Welcome to Postman Bot help Menu, All my commands Start with +, use +help <cmd> to get more information about the command!");
            eb.addField("Commands\n", "``+" + result, false);
            eb.setColor((int) Math.random());
            eb.setFooter("Postman Bot by - RECIOR");
            c.getChannel().sendMessageEmbeds(eb.build()).queue();
        }
          else if (c.getArgs().length < 2 || c.getArgs().length > 0) {
            for (int e = 0; e < CommandUtil.cmds.size(); e++) {
                if (c.getArgs()[0].equals(CommandUtil.cmds.get(e).getName()) || CommandUtil.isAlly(CommandUtil.cmds, c.getArgs()[0])) {

                    /*
                    String[] xg = CommandUtil.cmds.get(e).getAllies();

                    StringJoiner sj = new StringJoiner("``+");

                    for(int x = 0; x > xg.length; x++) {
                        c.getMessage().reply(xg[x]).queue();
                        sj.add(xg[x] + "``,");
                    }
                    String result = sj.toString();

                     */
                    String d = CommandUtil.cmds.get(e).getDescription();
                    String t = CommandUtil.cmds.get(e).getName();
                    EmbedBuilder ec = new EmbedBuilder();
                    ec.setTitle(t);
                    ec.setDescription(d);
                   // ec.addField("Allies","``+" + result, false);
                    ec.setColor((int) Math.random());
                    ec.setFooter("Postman Bot by - RECIOR");
                    c.getChannel().sendMessageEmbeds(ec.build()).queue();
                }
            }
        }
    }

}
