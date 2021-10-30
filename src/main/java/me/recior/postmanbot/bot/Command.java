package me.recior.postmanbot.bot;

import me.recior.postmanbot.bot.util.Cmd;

/*
 *Worst code :D
 *
 *
 */
public abstract class Command{

    String name;
    String description;
    String[] allies;

    //Command basic information, registers name and description.
   public Command(String name, String description, String[] allies) { this.name = name; this.description = description; this.allies = allies; }

    //returns name of (this)object.
    public String getName(){
        return this.name;
    }

    //returns description of (this)object.
    public String getDescription(){
        return this.description;
    }

    //returns allies of (this)object
    public String[] getAllies() { return this.allies;}

    //some cool code I wrote ;)), calls the command.... idk why I didn't just use Message received event...
    //TODO add more params......
    public void call(Cmd Command) {}

}
