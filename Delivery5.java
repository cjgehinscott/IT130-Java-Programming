/*CJ Gehin-Scott
 * 10/8/2013
 * IT130*/

import java.util.Scanner;

public class Delivery5 {
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int distance = 0;
    double weight = 0;
    String choice = "";
    double fee1 = 12.00;
    double fee2 = 16.50;
    double fee3 = 22.00;
    double fee4 = 35.00;
    double fee5 = 47.95;
    double totalLocal = 0;
    double totalLong = 0;
    int longDistance = 0;
    int local = 0;
    double totalFinal = 0;
    
    while(true){
    System.out.println("Enter Distance (1) Local - (2) Long Distance: ");
    distance = input.nextInt();
    if(distance == 1){
      local = local + 1;
    }else if(distance == 2){
      longDistance = longDistance + 1;
    }
    System.out.println("Enter Weight: ");
    weight = input.nextDouble();
    if(weight < 5 && weight >= 0 && distance == 1){
      System.out.println("Delivery type: (1) Local - Weight: " + weight + " pounds.");
      System.out.println("Fee: $" + fee1 );
      totalLocal = totalLocal + fee1;
    }else if(weight >=5 && weight <= 20 && distance == 1){
      System.out.println("Delivery type: (1) Local - Weight: " + weight + " pounds.");
      System.out.println("Fee: $" + fee2);
      totalLocal = totalLocal + fee2;
    }else if(weight > 20 && distance == 1){
      System.out.println("Delivery type: (1) Local - Weight: " + weight + " pounds.");
      System.out.println("Fee: $" + fee3);
      totalLocal = totalLocal + fee3;
    }else if(weight < 5 && distance == 2){
      System.out.println("Delivery type: (2) Long Distance - Weight: " + weight + " pounds.");
      System.out.println("Fee: $" + fee4);
      totalLong = totalLong + fee4;
    }else if(weight >= 5 && distance == 2){
      System.out.println("Delivery type: (2)Long Distance - Weight: " + weight + " pounds.");
      System.out.println("Fee: $" + fee5);
      totalLong = totalLong + fee5;
    }else{
      System.out.println("Error!! Invalid input.");
      }
    System.out.println("(C) to Continue : (E) to Exit");
    choice = input.next();
    if(choice.equalsIgnoreCase("e")){
      break;
    }else if(choice.equalsIgnoreCase("c")){
               continue;
               }else{
                 System.out.println("Error!! Invalid Input.");
                 break;
               }
    }
    totalFinal = totalLocal + totalLong;
    System.out.println("Summary of Delivery Services;");
    System.out.println("Local Delivery: " + local + " items.");
    System.out.printf("Total Local Delivery Fee: $%.2f",totalLocal);
    System.out.println();
    System.out.println("Long Distance Delivery: " + longDistance + " items.");
    System.out.printf("Total Long Distance Delivery Fee: $%.2f", totalLong);
    System.out.println();
    System.out.printf("Total Fee: $%.2f",totalFinal);
    System.out.println();
    System.out.println("End of Program");
  }//end main method
}//end Deliver5 class