/*CJ Gehin-Scott
 *9/17/2013
 * IT-130
 * Assignment 2 Extra Credit*/

import java.util.Scanner;

public class Furniture{
  
  public static void main(String[] args){
  
    Scanner inputBox = new Scanner(System.in);
    int woodSelection;
    String wood = "";
    int sizeSelection;
    String size = "";
    
    //Wood Type
    System.out.println("Welcome to Abe's Honest Table Making Company!");
    System.out.println("Please choose a wood that you would like your new table to be made in: ");
    System.out.println("          (1) for Pine");
    System.out.println("          (2) for Oak");
    System.out.println("          (3) for Mahogany");
    System.out.println("          (4) for Cherry");
    woodSelection = inputBox.nextInt();
    
    //assesses wood selection and then prints a statement to user
    if(woodSelection == 1){
      System.out.println("Great choice! Pine will look great in your home!");
      wood = "Pine";
    }else if(woodSelection == 2){
      System.out.println("I don't think you could have picked a stronger wood than Oak! This new table will last a long time in your family.");
      wood = "Oak";
    }else if(woodSelection == 3){
      System.out.println("Perfect! You won't be disappointed with the way this Mahogany table looks.");
      wood = "Mahogany";
    }else if(woodSelection == 4){
      System.out.println("The top of the line! Cherry is our favorite wood to work with and you will love the way this table turns out.");
      wood = "Cherry";
    }else{
      System.out.println("Oops, I'm sure you just accidentally hit the wrong key on the keyboard.  That wasn't one of the choices. Lets try that again.");
      System.out.println("Please choose a wood that you would like your new table to be made in: ");
      System.out.println("          (1) for Pine");
      System.out.println("          (2) for Oak");
      System.out.println("          (3) for Mahogany");
      System.out.println("          (4) for Cherry");
      woodSelection = inputBox.nextInt();
      if(woodSelection == 1){
        System.out.println("Great choice! Pine will look great in your home!");
        wood = "Pine";
      }else if(woodSelection == 2){
        System.out.println("I don't think you could have picked a stronger wood than Oak! This new table will last a long time in your family.");
        wood = "Oak";
      }else if(woodSelection == 3){
        System.out.println("Perfect! You won't be disappointed with the way this Mahogany table looks.");
        wood = "Mahogany";
      }else if(woodSelection == 4){
        System.out.println("The top of the line! Cherry is our favorite wood to work with and you will love the way this table turns out.");
        wood = "Cherry";
      }else{
        System.out.println("Oops, I'm sorry there seems to be an error.  Please try back later.  We apologize for any inconvenience.");
      }
    }
    
    //Table Size
    System.out.println("Now that you have picked your wood we just need to know what size you would like, so that we can give you a price for your new table.");
    System.out.println("You have two choices: (1) for Large or (2) for Small. Please enter your selection below: ");
    sizeSelection = inputBox.nextInt();
    
    //assesses table size selection and prints it back to the user
    if(sizeSelection == 1){
      System.out.println("Large it is! Please give us 2 weeks to make your table.  We will inform you when it is finished.");
      size = "Large";
    }else if(sizeSelection == 2){
      System.out.println("We can do Small! Please allow up to a week for us to make your table.  We will inform you when it is finished.");
      size = "Small";
    }else{
      System.out.println("Error: I'm sorry your entry was invalid please try again so we can get to work on your new table.");
      System.out.println("You have two choices: (1) for Large or (2) for Small. Please enter your selection below: ");
      sizeSelection = inputBox.nextInt();
        if(sizeSelection == 1){
          System.out.println("Large it is! Please give us 2 weeks to make your table.  We will inform you when it is finished.");
          size = "Large";
       }else if(sizeSelection == 2){
          System.out.println("We can do Small! Please allow up to a week for us to make your table.  We will inform you when it is finished.");
          size = "Small";
       }else{
      System.out.println("Error: I'm sorry there seems to be something wrong.  Please try back later.");
       }
    }
    //Summary of order
    System.out.println("Your selections for your table:");
    System.out.println("Wood: " + wood);
    System.out.println("Size: " + size);
    //Price
    if(woodSelection == 1 && sizeSelection == 1){
      System.out.println("Price: $135");
    }else if(woodSelection ==1 && sizeSelection == 2){
      System.out.println("Price: $100");
    }else if(woodSelection == 2 && sizeSelection == 1){
      System.out.println("Price: $260");
    }else if(woodSelection == 2 && sizeSelection == 2){
      System.out.println("Price: $225");
    }else if(woodSelection == 3 && sizeSelection == 1){
      System.out.println("Price: $345");
    }else if(woodSelection == 3 && sizeSelection == 2){
      System.out.println("Price: $310");
    }else if(woodSelection == 4 && sizeSelection == 1){
      System.out.println("Price: $435");
    }else if(woodSelection == 4 && sizeSelection == 2){
      System.out.println("Price: $400");
    }
    
    
    
  }//end main method
}//end furniture class