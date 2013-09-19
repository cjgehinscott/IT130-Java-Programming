/*CJ Gehin-Scott
 * 9/17/2013
 * IT-130*/

import java.util.Scanner;

public class GuessingGame{
  public static void main(String[] args){
    int winning = (int) (Math.random() * 1000) + 1;
    //System.out.println(winning);
    Scanner inputBox = new Scanner(System.in);
    int guess;
    int choice;
    while(true){
      System.out.println("Enter a number between 1 and 1000: ");
      guess = inputBox.nextInt();
      if(guess < winning){
        System.out.println("Ooops your number was too low. Try Again.");
        System.out.println("Enter a number between 1 and 1000: ");
      guess = inputBox.nextInt();
      }else if(guess > winning){
        System.out.println("Ooops your number was too high. Try Again.");
        System.out.println("Enter a number between 1 and 1000: ");
      guess = inputBox.nextInt();
      }else if(guess == winning){
        System.out.println("CONGRATULATIONS!!! You guessed the winning number!!!");
        break;
      }
      //Ask to play again or break the loop
      System.out.println("Enter 0 to end the game.");
      choice = inputBox.nextInt();
         if(choice == 0){
           break;
        }else if(choice == 1){
      }
    }//ends while loop
    System.out.println("Game Over");
  }//end of main method
}//ends Guessing Game class