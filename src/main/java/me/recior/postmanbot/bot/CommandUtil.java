package me.recior.postmanbot.bot;

import java.util.ArrayList;
import java.util.List;

public class  CommandUtil {

  public static List<Command> cmds = new ArrayList<>();

  public static void registerCommand(Command cmd){
      cmds.add(cmd);
  }

}
