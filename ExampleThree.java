//CJ Gehin-Scott

import java.util.Scanner;

public class ExampleThree{
  public static void main(String[] args){
    
    /*boolean bool = true;
    System.out.println(bool);
    bool = false;
    System.out.println(bool);
    boolean x = (1 == 0);
    System.out.println("X is " + x);*/
    
    Scanner inputBox = new Scanner(System.in);
    int number;
    System.out.println("Please enter a number: ");
    number = inputBox.nextInt();
    
    /*if(number > 0){
      System.out.println("The number " + number + " is positive.");
    }
    if(number < 0){
    System.out.println("The number " + number + " is negative.");
    }
    if(number == 0){
       System.out.println("The number " + number + " is neither negative or positive.");
    }*/
    
    if(number > 0) {
      System.out.println("The number " + number + " is positive.");
    }else if(number < 0) {
      System.out.println("The number " + number + " is negative.");
    }else{
      System.out.println("The number " + number + " is neither negative or positive.");
    }
    
    
  }//end of main method
}//end of ExampleThree class