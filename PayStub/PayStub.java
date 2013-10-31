/*CJ Gehin-Scott
 * 9/10/2013
 * IT-130
 * Assignment 1*/

import java.util.Scanner;

public class PayStub {
  
  public static void main(String [] args) {
    
    String name; //Name of employee
    double hours; // hours worked per week
    double payRate; // dollars made per hour
    double fedTax; // federal tax bracket i.e. 25%
    double stateTax; // state tax bracket i.e. 9%
    Scanner inputBox = new Scanner(System.in); // creates a box to take in entries from the user
    
    //Input
    System.out.println("Please tell us your name so we can begin to calculate your pay stub for the previous month of work: ");
    name = inputBox.nextLine();
    System.out.println("How many hours per week did you work?");
    hours = inputBox.nextDouble();
    System.out.println("What is your hourly pay rate?");
    payRate = inputBox.nextDouble();
    System.out.println("What is your federal tax bracket? i.e. 25 = 25%");
    fedTax = inputBox.nextDouble();
    System.out.println("What is your state tax bracket? Again use 25 for 25%");
    stateTax = inputBox.nextDouble();
    
    //Output
    System.out.println(name + ", you worked " + hours + " hours " + "at an hourly pay rate of $" + payRate + ".");
    double grossPay = ((hours * payRate)*4);
    System.out.println("Your gross pay, not including deductions, for the current pay period is: $" + grossPay + ".");
    double fedWithold = grossPay * (fedTax / 100);
    System.out.println("The amount of federal taxes witheld for the current pay period is: $" + fedWithold + ".");
    double stateWithold = grossPay * (stateTax / 100);
    System.out.println("The amount of state taxes witheld for the current pay period is: $" + stateWithold + ".");
    double finalPay = grossPay - fedWithold - stateWithold;
    System.out.println("Your pay after deductions for the current pay period is: $" + finalPay + ".");
                    
    
  }//ends main method
}//ends PayStub class