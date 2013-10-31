/*CJ Gehin-Scott
 * 10/01/2013
 * IT130*/

import java.util.Scanner;

public class Midterm3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int radius = 0;
    int height = 0;
    double volume;
    int choice = 0;
    
    for(int i = 1; i <= 5; i++){
    System.out.println("Please enter (1) for the volume of a circular cylinder of (2) for the volume of a circular cone: ");
    choice =input.nextInt();
    if(choice == 1){
    //circular cylinder
    System.out.println("Please enter the radius for the cylinder: ");
    radius = input.nextInt();
    System.out.println("Please enter the height for the cylinder; ");
    height = input.nextInt();
    volume = Math.PI * (radius*radius) * height;
    System.out.printf("The volume of the circular cylinder is: %.2f", volume);
    System.out.println();
    }else if(choice == 2){
    //circular cone
    System.out.println("Please enter the height of the circular cone: ");
    height = input.nextInt();
    System.out.println("Please enter the radius of the circular cone: ");
    radius = input.nextInt();
    volume = (Math.PI * (radius*radius) * height)/3;
    System.out.printf("The volume of the circular cone is: %.2f", volume);
    System.out.println();
    }else{
      System.out.println("Wrong choice!!!");
      }
    }   
  }//end main method
}//end Midterm3 class