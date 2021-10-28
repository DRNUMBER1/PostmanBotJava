package me.recior.postmanbot.bot.commands;

import me.recior.postmanbot.bot.Command;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class sizeCommand extends Command {

    public sizeCommand() {
        super("size", "Shows your pp size ;)");
    }

    @Override
    public void call(Member member, TextChannel textChannel, Message message){
        String name = member.getNickname();
        int max = 12;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            if(rand < 7)
                textChannel.sendMessage("Hey " + name + " your size is " + rand + "// Lmao your small kiddo. Go watch some hentai.").queue();
            else {
                textChannel.sendMessage("Hey " + name + " your size is " + rand + "// Big PP gang.").queue();
            }
        }
    }
}
