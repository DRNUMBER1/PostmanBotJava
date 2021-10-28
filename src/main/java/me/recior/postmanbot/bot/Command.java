package me.recior.postmanbot.bot;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

/*
 *Worst code :D
 *
 *
 */
public abstract class Command{

    String name;
    String description;

    //Command basic information, registers name and description.
    //TODO add other information... {permissions, allies, etc...}
   public Command(String name, String description) { this.name = name; this.description = description; }

    //returns name of (this)object.
    public String getName(){
        return this.name;
    }

    //returns description of (this)object.
    public String getDescription(String description){
        return this.description;
    }

    //some cool code I wrote ;)), calls the command.... idk why I didn't just use Message received event...
    //TODO add more params......
    public void call(Member member, TextChannel textChannel, Message message) {}

}
