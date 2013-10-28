/*CJ Gehin-Scott
 * 9-10-2013
 * IT-130*/

import java.util.Scanner;

public class Circle{
  public static void main(String[] args){
    
    //Instance Variables
    double radius;
    double diameter;
    double circumference;
    double area;
    Scanner inputBox = new Scanner(System.in);
    int choice;
    //Input
    System.out.println("Please enter the radius of a circle: ");
    radius = inputBox.nextDouble();
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
    System.out.println("End of Program.");
    
  }//end of main method
}//end of Circle class