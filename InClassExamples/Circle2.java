/*CJ Gehin-Scott
 * 9-17-2013
 * IT-130*/

import java.util.Scanner;

public class Circle2{
  public static void main(String[] args){
    
    //Instance Variables
    int radius;
    double diameter;
    double circumference;
    double area;
    Scanner inputBox = new Scanner(System.in);
    int choice;
    
    //Input   
    while(true){
    System.out.println("Please enter the radius of a circle: ");
    radius = inputBox.nextInt();
    System.out.println("Enter 1 for the Diameter, 2 for the Circumference, and 3 for the area of the circle.");
    choice = inputBox.nextInt();
     
    //Math
    diameter = 2 * radius;
    circumference = 2 * Math.PI * radius;
    area = Math.PI * (radius * radius);
    
    if(choice == 1){
      System.out.println("Diameter of a circle with radius " + radius + " is " + diameter);
    }else if (choice == 2){
      System.out.println("Circumference of a circle with a radius " + radius + " is " + circumference);
    }else if (choice == 3){
      System.out.println("Area of a circle with a radius " + radius + " is " + area);
    }else{
      System.out.println("Error: wrong choice.");
    }
    System.out.println("Enter 1 to continue : 0 to exit.");
    choice = inputBox.nextInt();
    if(choice == 0){
      break;
    }else if( choice == 1){
    }
  }
    System.out.println("End of Program.");
    
  }//end of main method
}//end of Circle class