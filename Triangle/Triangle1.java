/*CJ Gehin-Scott
 * 10/04/2013
 * IT130*/

import java.util.Scanner;

public class Triangle1{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int choice = 0;
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
    
    System.out.println("To continue type (1), to quit type (0).");
    choice = input.nextInt();
    if(choice == 0){
      break;
    }else if(choice == 1){
      continue;
    }else{
      System.out.println("Invalid entry!");
      break;
      }
    }
  }//end main method
}//end Triangle1 class