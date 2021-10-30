package me.recior.postmanbot.bot.commands.fun;

import me.recior.postmanbot.bot.Command;
import me.recior.postmanbot.bot.util.Cmd;


/*
*
* Shows your pp size :flushed:
*
* */
public class size extends Command {

    //registering....
    public size() {
        super("size", "Shows your pp size ;)", new String[]{"pp","long"});
    }

    //calling....
    @Override
    public void call(Cmd c){
        String name = c.getMember().getEffectiveName();
        int max = 12;
        int min = 1;
        int range = max - min + 1;

        //why not?
        for (int i = 0; i < 1; i++) {
            int rand = (int) (Math.random() * range) + min;
            if(rand < 7)
                c.getChannel().sendMessage("Hey " + name + " your size is " + rand + "// Lmao your small kiddo. Go watch some hentai.").queue();
            else {
                c.getChannel().sendMessage("Hey " + name + " your size is " + rand + "// Big PP gang.").queue();
            }
        }
    }
}
