package me.recior.postmanbot;

import me.recior.postmanbot.bot.CommandRegisterer;
import me.recior.postmanbot.bot.MessageL;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.security.auth.login.LoginException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 10/28/21 - RECIOR
 *
 * Hi fellow user peeking in this source code...
 * you naughty naughty.. ;>>
 *
 * */
public class Main {

    public static Logger log = LogManager.getLogger("PostmanBot");


    public static void main(String[] args) throws LoginException, FileNotFoundException {

        //Creating JDA object.
        File f = new File("D:" + File.separator + "PostmanBotJava" + File.separator + "tekken.txt");
        //go figure out yourself >:) about this token thing
        Scanner sc = new Scanner(f);
        String token = sc.nextLine();
        JDA jda = JDABuilder.createDefault(token).build();
        jda.addEventListener(new MessageL());
        sc.close();

        //registering all commands
        //TODO Make it better.
        CommandRegisterer.reg();
        log.info("Finished Registering Commands!");


    }

}
