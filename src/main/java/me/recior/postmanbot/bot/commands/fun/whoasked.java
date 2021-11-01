package me.recior.postmanbot.bot.commands.fun;

import me.recior.postmanbot.bot.Command;
import me.recior.postmanbot.bot.util.Cmd;


/*
*
* how many people asked about your stupid opinion?
* I made this during school, i find it funny
*
* */
public class size extends Command {

    //registering....
    public size() {
        super("whoasked", "Shows how many people dont care >;)", new String[]{"people","long"});
    }

    //calling....
    @Override
    public void call(Cmd c){
        String name = c.getMember().getEffectiveName();
        int max = 15;
        int min = 1;
        int range = max - min + 1;

        //why not?
        for (int i = 0; i < 1; i++) {
            int rand = (int) (Math.random() * range) + min;
            if(rand < 7)
                c.getChannel().sendMessage("Hey " + name + " not alot of people agree with you, onlu " + rand + "does // Lmao, not based.").queue();
            else {
                c.getChannel().sendMessage("Hey " + name + " people agree and theyre " + rand + " people strong // very based fellow i see.").queue();
            }
        }
    }
}
