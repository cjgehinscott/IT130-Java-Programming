/*CJ Gehin-Scott
 * IT-130
 * 11/5/2013*/

import java.util.Scanner;

public class MethodExample{

  public void computeAreaOfCircle1(){
    double radius = 5.5;
    double area = Math.PI * radius*radius;
    System.out.printf("Area of Circle: %.5f", area);
    System.out.println();
  }
  public void computeAreaOfCircle2(double radius){
    double area = Math.PI * radius*radius;
    System.out.printf("Area of Circle: %.5f", area);
    System.out.println();
  }
  public double computeAreaOfCircle3(double radius){
   double area = Math.PI *radius*radius;
   return area;
  }
  public double computeAreaOfTriangle(double base, double height){
    double area = 0.5 * base * height;
    return area;
  }
  
}//end MethodExample class