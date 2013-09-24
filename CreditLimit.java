/*CJ Gehin-Scott
 * 9/24/2013
 * IT-130*/

import java.util.Scanner;
public class CreditLimit{
  public static void main(String[] args){
  
    Scanner inputBox = new Scanner(System.in);
    int balance = 0;
    int charges;
    int credits;
    int creditLimit = 1000;
    int accountNumber;
    int newBalance;
    int choice;
    
    while(true){
      System.out.println("Enter your Account Number (or -1 to exit): ");
      accountNumber = inputBox.nextInt();
      if(accountNumber < 0){
        break;
      }
      while(true){
    System.out.println("Your balance is: " + balance);
    System.out.println("Enter Charges: ");
    charges = inputBox.nextInt();
    System.out.println("Enter Credits: ");
    credits = inputBox.nextInt();
    System.out.println("Your Credit Limit is:  " + creditLimit);
    balance = (balance + charges) - credits;
    System.out.println("Your new balance is: " + balance);
    System.out.println("Enter 1 to add a new charge or 0 to go back to the beginning.");
    choice = inputBox.nextInt();
    if(creditLimit < balance){
        System.out.println("You have exceeded your credit limit.  Please make a payment to avoid any penalty fees.");
        break;
        }
    if(choice == 0){
      break;
    }
      }
      
    }
    
     
     
  }//end of main method

}//end of Example 4
