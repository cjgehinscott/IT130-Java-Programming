/*CJ Gehin-Scott
 * 9/3/2013
 * IT-130*/

import java.util.Scanner;

public class ExampleTwo {
  
  public static void main (String[] args){
    //lets ADD
    double a;
    double b;
    double c;
    Scanner inputBox = new Scanner(System.in);
    System.out.println("Please enter the first number you would like to add: ");
    a = inputBox.nextDouble();
    System.out.println("Please enter the second number you would like to add: ");
    b = inputBox.nextDouble();
    c = a + b;
    System.out.println("When you add the numbers you entered " + a  +  " and "  +  b + " you get  " +  c + ".");
    
    //Now we Divide
    System.out.println("DIVISION");
    System.out.println("Now please enter a third number that we will divide by: ");
    double d = inputBox.nextDouble();
    double e = c / d;
    System.out.println("When you divide " + c + " by " + d + " you get " + e);
    System.out.println();
    System.out.printf("%.2f / %.2f = %.2f ", c, d, e);
    
  }//ends main method
}//ends ExampleTwo class