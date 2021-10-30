package me.recior.postmanbot.bot.util;

import me.recior.postmanbot.bot.Command;

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

  //Just a modifier nothing else.
  public static String[] removeE(String[] arr, int index){
      if (arr == null || index < 0
              || index >= arr.length) {

          return arr;
      }
      String[] anotherArray = new String[arr.length - 1];

      for (int i = 0, k = 0; i < arr.length; i++) {
          if (i == index) {
              continue;
          }
          anotherArray[k++] = arr[i];
      }
      return anotherArray;
  }

  public static boolean isAlly(List<Command> arr, String cmd){
      for(int i = 0; i < arr.size(); i++){
         if(arr.get(i).equals(cmd)){
             return true;
         }
      }
      return false;
  }

    public static int getinto(List<Command> arr, String cmd){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals(cmd)){
                return i;
            }
        }
        return 0;
    }

}
