/*CJ Gehin-Scott
 * 10/1/2013
 * IT-130*/

import java.util.Scanner;

public class MailOrder{
  
  public static void main(String[] args){
    
    Scanner inputBox = new Scanner(System.in);
    double price1 = 2.98;
    double price2 = 4.50;
    double price3 = 9.98;
    double price4 = 4.49;
    double price5 = 6.87;
    int count = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int productNumber = 0;
    int choice = 0;
    double total1 = 0;
    double total2 = 0;
    double total3 = 0;
    double total4 = 0;
    double total5 = 0;
    double orderTotal = 0;
    
    do{System.out.println("Please enter the product number you want to add quantity to (1-5): ");
    productNumber = inputBox.nextInt();
    if(productNumber < 1 || productNumber > 5){
      System.out.println("I'm sorry that is not a valid product number. Please try again later.");
      break;
      }
     System.out.println("Ok. How many of product " + productNumber + " did you order?");
    count = inputBox.nextInt();
   /* if(productNumber == 1){
       total1 = total1 + (count * price1);
        count1 = count1 + count;
    }else if(productNumber == 2){
       total2 = total2 + (count *price2);
        count2 = count2 + count;
    }else if(productNumber == 3){
      total3 = total3 + (count * price3);
        count3 = count3 + count;
    }else if(productNumber == 4){
      total4 = total4 + (count * price4);
        count4 = count4 + count;
    }else if(productNumber == 5){
       total5 = total5 + (count * price5);
        count5 = count5 + count;
    }*/
    switch(productNumber){
      case 1:
        total1 = total1 + (count * price1);
        count1 = count1 + count;
        break;
      case 2:
        total2 = total2 + (count *price2);
        count2 = count2 + count;
        break;
      case 3:
        total3 = total3 + (count * price3);
        count3 =count3 + count;
        break;
      case 4: 
        total4 = total4 + (count * price4);
        count4 = count4 + count;
        break;
      case 5: 
        total5 = total5 + (count * price5);
        count5 = count5 + count;
        break;
      }
    System.out.println("Enter (0) to add more quantity to another product or (1) to total up your order.");
    choice = inputBox.nextInt();
      if(choice == 1){
        break;
      }
    } while(true);
    
    
    System.out.println("Order Summary");
    System.out.println();
    System.out.println("Product 1 quantity: " + count1 + " Cost: $" + total1);
    System.out.println("Product 2 quantity: " + count2 + " Cost: $" + total2);
    System.out.println("Product 3 quantity: " + count3 + " Cost: $" + total3);
    System.out.println("Product 4 quantity: " + count4 + " Cost: $" + total4);
    System.out.println("Product 5 quantity: " + count5 + " Cost: $" + total5);
    orderTotal = total1 + total2 + total3 + total4 + total5;
    System.out.printf("Order Total = $%.2f",orderTotal); 
  }//end main method
}//end MailOrder class