/*CJ Gehin-Scott
 * 10/01/2013
 * IT130*/

import java.util.Scanner;
public class StringExample{
  public static void main(String[] args){
    String str1 = "Hello";
    String str2 = "hello";
    if( str1.equals(str2) ){
      System.out.println(str1 + " = " + str2);
    }
    Scanner input = new Scanner(System.in);
    while(true){
    System.out.println("Type (exit) to terminate: (go) to continue:");
    String ans = input.nextLine();
    if(ans.equalsIgnoreCase("exit")){//use equalsIgnoreCase when the entry is not case sensitive
      break;
    }else if(ans.equals("go")){//use equals when entry is case sensitive
      continue;
    }
    }
  }//end of main method
}//end of StringExample class