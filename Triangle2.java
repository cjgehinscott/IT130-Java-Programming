/*CJ Gehin-Scott
 * 10/04/2013
 * IT130*/

import java.util.Scanner;

public class Triangle2{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    Scanner inputBox = new Scanner(System.in);
    String choice = "";
    int side1 = 0;
    int side2 = 0;
    int side3 = 0;
    int perimeter = 0;
    
    
    while(true){
    System.out.println("Enter first edge: ");
    side1 = input.nextInt();
    System.out.println("Enter second edge: ");
    side2 = input.nextInt();
    System.out.println("Enter third edge: ");
    side3 = input.nextInt();
    
    perimeter = side1 + side2 + side3;
    
    if(side1 + side2 > side3){
      System.out.println("Can edges " + side1 + ", " + side2 + ", " + side3 +" make a triangle? True!");
      System.out.println("The perimeter of the triangle is: " + perimeter);
    }else if(side1 + side2 <= side3){
      System.out.println("Can edges " + side1 + ", " + side2 + ", " + side3 +" make a triangle? False!");
    }else if(side1 + side3 > side2){
      System.out.println("Can edges " + side1 + ", " + side2 + ", " + side3 +" make a triangle? True!");
      System.out.println("The perimeter of the triangle is: " + perimeter);
    }else if(side1 + side3 <= side2){
      System.out.println("Can edges " + side1 + ", " + side2 + ", " + side3 +" make a triangle? False!");
    }else if(side2 + side3 > side1){
      System.out.println("Can edges " + side1 + ", " + side2 + ", " + side3 +" make a triangle? True!");
      System.out.println("The perimeter of the triangle is: " + perimeter);
    }else if(side2 + side3<= side1){
       System.out.println("Can edges " + side1 + ", " + side2 + ", " + side3 +" make a triangle? False!");
      }
    
    System.out.println("Enter (C) to continue enter (E) to exit:");
    choice = inputBox.nextLine();
    if(choice.equalsIgnoreCase("E")){
      break;
    }else if(choice.equalsIgnoreCase("C")){
      continue;
    }else{
      System.out.println("Invalid entry!");
      break;
      }
    }
  }//end main method
}//end Triangle2 class