// CJ GEHIN-SCOTT - THINKER
// FERNANDO QUIROZ - TYPER

import java.util.Scanner;
public class PizzaChoicenoIF {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     String choice = "" ;
     int size = 0;
     int count = 0;
     double grandTotal = 0;
     double prices[] = {6.99,8.99,12.50,15};
     while (true){
     
     System.out.println(" What size of pizza would you like : (1-small, 2-medium, 3-large, 4-xtra large: ");
        
         size = input.nextInt();
         System.out.println(" How many pizza(s) would you like ? ");
         count = input.nextInt();  
         double orderTotal = prices[size - 1] * count; 
         grandTotal = grandTotal + orderTotal;
         
         System.out.printf("Order Total : $%.2f", orderTotal);
         
         System.out.println();
         System.out.println(" Would you like to continue : (Y/N) ");
         choice = input.next();
         if(choice.equalsIgnoreCase("n")){
             break;
         }
            
         
         }// ends while loop
     System.out.println();
     System.out.printf(" Grand Order Total : $%.2f", grandTotal);
     
     }
     
}
