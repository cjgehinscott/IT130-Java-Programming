/*CJ Gehin-Scott
 * 10/22/2013
 * IT-130*/

import java.util.Scanner;

public class Encryption{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    String transmit = "";
    char one;
    char two;
    char three;
    char four;
    int numone;
    int numtwo;
    int numthree;
    int numfour;
    
    System.out.println("Please enter the four digit number you would like to have encrypted: ");
    transmit = input.next();
    one = transmit.charAt(0);
    numone = (Character.getNumericValue(one) +7) % 10;
    two = transmit.charAt(1);
    numtwo = (Character.getNumericValue(two) +7) % 10;
    three = transmit.charAt(2);
    numthree = (Character.getNumericValue(three) +7) % 10;
    four = transmit.charAt(3);
    numfour = (Character.getNumericValue(four) + 7) % 10;
    transmit = Integer.toString(numthree) + Integer.toString(numfour) + Integer.toString(numone) + Integer.toString(numtwo);
    System.out.println(transmit);
    
  }//end main method
}//end Encryption class