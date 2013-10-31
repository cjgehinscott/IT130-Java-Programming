/*CJ Gehin-Scott
 * 9/17/2013
 * IT-130*/

import java.util.Scanner;

public class Lawn {
  
  public static void main(String[] args) {
    int length;
    int width;
    int selection;
    int area;
    double fee;
    double biAnnual;
    double oneTime;
    Scanner inputBox = new Scanner(System.in);
    
    //input
    System.out.println("Bubba's Lawn Mowing Service");
    System.out.println("Please enter the length and width of your lawn: ");
    System.out.println("Length: ");
    length = inputBox.nextInt();
    System.out.println("Width; ");
    width = inputBox.nextInt();
    System.out.println("How would you like to set up payment?");
    System.out.println("Please enter (1) to pay once up front, (2) to split it into to equal payments, or (3) to make 20 weekly ongoing payments: ");
    selection = inputBox.nextInt();
    
    //output
    area = length * width;
    System.out.println("Your lawn is " + area + " square feet.");
    //determines the fee that will be assessed based on the area of the lot and prints to the console
    if(area <=4000){
      fee = 25;
    }else if(area > 4000 && area <= 6000){
     fee = 35; 
    }else{
    fee = 50;
    }
    System.out.println("Weekly fee: $" + fee);
    //determines what the total bill will be and prints to the console
    biAnnual = fee * 10;
    oneTime = fee * 20;
    if(selection == 1){
    System.out.println("You chose to pay once all up front so your one-time payment will be: $" + oneTime); 
    }else if(selection == 2){
      System.out.println("You chose to pay in two equal payments.  Your payments will: $" + biAnnual);
    }else if(selection == 3){
      System.out.println("You chose to pay on a weekly basis.  Your payments will the weekly fee stated above: $" + fee);
    }else{
      System.out.println("You didn't enter a correct payment plan above.  Please enter the correct number associated with a payment plan.");
      System.out.println("If a valid payment plan is not entered than the default payment plan will be a weekly payment plan.");
      System.out.println("Please enter (1) to pay once up front, (2) to split it into to equal payments, or (3) to make 20 weekly ongoing payments: ");
    selection = inputBox.nextInt();
               if(selection == 1){
                  System.out.println("You chose to pay once all up front so your one-time payment will be: $" + oneTime); 
               }else if(selection == 2){
                  System.out.println("You chose to pay in two equal payments.  Your payments will: $" + biAnnual);
               }else if(selection == 3){
                  System.out.println("You chose to pay on a weekly basis.  Your payments will the weekly fee stated above: $" + fee);
               }else{
                  System.out.println("You didn't enter a correct payment plan above.  The default weekly payment plan will be applied to your account.");
               }
    }
  }//end main method

}//end Lawn class