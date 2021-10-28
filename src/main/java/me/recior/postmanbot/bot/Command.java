package me.recior.postmanbot.bot;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import org.jetbrains.annotations.NotNull;


public abstract class Command{

    String name;
    String description;

   public Command(String name, String description) { this.name = name; this.description = description; ;  }

    public String getName(){
        return this.name;
    }

    public String getDescription(String description){
        return this.description;
    }

    public void call(@NotNull Member member, TextChannel textChannel, Message message) {}

}
