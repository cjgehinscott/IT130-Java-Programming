/*CJ Gehin-Scott
 * 10/8/2013
 * IT130*/

import java.util.Scanner;

public class Delivery1 {
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int distance = 0;
    double weight = 0;
    
    System.out.println("Enter Distance (1) Local - (2) Long Distance: ");
    distance = input.nextInt();
    System.out.println("Enter Weight: ");
    weight = input.nextDouble();
    if(weight < 5 && weight >= 0 && distance == 1){
      System.out.println("Delivery type: (1) Local - Weight: " + weight + " pounds.");
      System.out.println("Fee: $12.00");
    }else if(weight >=5 && weight <= 20 && distance == 1){
      System.out.println("Delivery type: (1) Local - Weight: " + weight + " pounds.");
      System.out.println("Fee: $16.50");
    }else if(weight > 20 && distance == 1){
      System.out.println("Delivery type: (1) Local - Weight: " + weight + " pounds.");
      System.out.println("Fee: $22.00");
    }else if(weight < 5 && distance == 2){
      System.out.println("Delivery type: (2) Long Distance - Weight: " + weight + " pounds.");
      System.out.println("Fee: $35.00");
    }else if(weight >= 5 && distance == 2){
      System.out.println("Delivery type: (2)Long Distance - Weight: " + weight + " pounds.");
      System.out.println("Fee: $47.95");
    }else{
      System.out.println("Error!! Invalid input.");
    }
  }//end main method
}//end Deliver1 class