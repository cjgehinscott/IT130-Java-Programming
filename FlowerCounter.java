/*CJ Gehin-Scott
 * IT-130
 * 11/5/2013*/

import java.util.Scanner;

public class FlowerCounter{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    double prices[] = {0.50,0.75,1.50,0.50,0.80};
    String flowerName[] = {"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
    String choice = "";
    int count = 0;
    double price = 0;
    
    System.out.println("Enter the name of the flower you would like from the following list:");
    System.out.println("Petunia, Pansy, Rose, Violet, Carnation, or Quit");
    choice = input.next();
    System.out.println("Enter Quantity: ");
    count = input.nextInt();
    for(int i = 0; i<flowerName.length; i++){
        if(choice.equalsIgnoreCase(flowerName[i])){
          choice = flowerName[i];
          price = prices[i];
        }
    }
    System.out.println("You are buying: ");
    System.out.println("Flower: " + choice);
    System.out.println("Cost: " + price);
    
  }//end main method
}//end FlowerCounter class