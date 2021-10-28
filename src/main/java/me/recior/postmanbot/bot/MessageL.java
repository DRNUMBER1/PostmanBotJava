package me.recior.postmanbot.bot;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class MessageL extends ListenerAdapter {


    //Fires when a message is received.
    @Override
    public void onMessageReceived(MessageReceivedEvent e){

        String msg = e.getMessage().getContentDisplay();
        MessageChannel channel = e.getChannel();

        Member m = e.getMember();
        TextChannel t = e.getTextChannel();
        Message ms = e.getMessage();


        //executing if found else will do nothing /shrug
        //TODO make it better.
        CommandUtil.cmds.forEach(f ->{
            String cmdName = f.getName();
            if(msg.equals(cmdName)){
                f.call(m,t,ms);
            }
        });
    }
}
