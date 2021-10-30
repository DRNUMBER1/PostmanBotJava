package me.recior.postmanbot.bot.util;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

public class Cmd {

    String[] args;
    Member member;
    Message msg;
    TextChannel textChannel;

    public Cmd(String[] args, Member member, Message msg, TextChannel textChannel) {
        this.args = args;
        this.member = member;
        this.msg = msg;
        this.textChannel = textChannel;
    }

    public Member getMember(){
        return this.member;
    }

    public Message getMessage(){
        return this.msg;
    }

    public TextChannel getChannel(){
        return this.textChannel;
    }

    public String[] getArgs(){
        return this.args;
    }
}
