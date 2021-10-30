package me.recior.postmanbot.bot;

import me.recior.postmanbot.bot.util.Cmd;
import me.recior.postmanbot.bot.util.CommandUtil;
import me.recior.postmanbot.util.Reference;
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

        //Checking if the Message contains, prefix....
        if(!msg.startsWith(Reference.prefix)){
            return;
        }
        //Splitting the contents into arguments...
        String[] MessageArgs = msg.split("\\s+");
        //defining command by excluding the prefix "+" from the 1st argument....
        String command = MessageArgs[0].toLowerCase().substring(1);
        String[] args = CommandUtil.removeE(MessageArgs, 0);

        Cmd c = new Cmd(args, m, ms, t);

        //executing if found else will do nothing /shrug
        //very bad code :CCC
        int i;
        for(i = 0; i < CommandUtil.cmds.size(); i++){
            String n = CommandUtil.cmds.get(i).getName();
            String[] a = CommandUtil.cmds.get(i).getAllies();
            if(command.equals(n) || CommandUtil.isAlly(CommandUtil.cmds, command)){
                //TODO fix this...
                CommandUtil.cmds.get(i).call(c);
            }
        }

    }
}
