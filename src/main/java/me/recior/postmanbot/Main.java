package me.recior.postmanbot;

import me.recior.postmanbot.bot.CommandRegisterer;
import me.recior.postmanbot.bot.MessageL;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.security.auth.login.LoginException;

public class Main {

    public static Logger log = LogManager.getLogger("PostmanBot");


    public static void main(String[] args) throws LoginException {

        String protect = System.getenv("tk");

        JDA jda = JDABuilder.createDefault(protect).build();
        jda.addEventListener(new MessageL());

        CommandRegisterer.reg();
        log.info("Finished Registering Commands!");


    }

}
