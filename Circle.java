/*CJ Gehin-Scott
 * 9-10-2013
 * IT-130*/

import java.util.Scanner;

public class Circle{
  public static void main(String[] args){
    int radius;
    double diameter;
    double circumference;
    double area;
    Scanner inputBox = new Scanner(System.in);
    System.out.println("Please enter the radius of a circle: ");
    radius = inputBox.nextInt();
    diameter = 2 * radius;
    circumference = 2 * Math.PI * radius;
    area = Math.PI * (radius * radius);
    
    System.out.println();
    System.out.println("Diameter of a circle with radius " + radius + " is " + diameter);
    System.out.println("Circumference of a circle with a radius " + radius + " is " + circumference);
    System.out.println("Area of a circle with a radius " + radius + " is " + area);
    System.out.println("End of Program.");
    
  }//end of main method
}//end of Circle class