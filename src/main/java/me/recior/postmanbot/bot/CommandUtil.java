package me.recior.postmanbot.bot;

import java.util.ArrayList;
import java.util.List;

//ok
public class  CommandUtil {

    //Defining list of commands
    //TODO make it better.... mofo revamp the whole command handler ig....
  public static List<Command> cmds = new ArrayList<>();

  //Register method;; could have just done as normal.
  public static void registerCommand(Command cmd){
      cmds.add(cmd);
  }

}
