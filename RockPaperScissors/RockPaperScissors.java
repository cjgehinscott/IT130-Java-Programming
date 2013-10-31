/*CJ Gehin-Scott
 * 9/24/2013
 * IT-130*/

import java.util.Scanner;

public class RockPaperScissors{
  public static void main(String[] args){
    
    Scanner inputBox = new Scanner(System.in);
     while(true){
    int computer_num = (int)(Math.random()*3);
    int choice;
    int quit = 0;
    String selection = "";
    String computerSelection = "";
    if(computer_num == 0){
      computerSelection = "Rock";
    }else if(computer_num == 1){
      computerSelection = "Paper";
    }else if(computer_num == 2){
      computerSelection = "Scissors";
    }
    //System.out.println(computer_num);
    System.out.println("Welcome to Rock, Paper, Scissors");
    System.out.println("Please make a selection (0) for Rock, (1) for Paper, or (2) for Scissors: ");
    choice = inputBox.nextInt();
    if(choice == 0){
        selection = "Rock";
      }else if(choice == 1){
        selection = "Paper";
      }else if(choice ==2){
        selection = "Scissors";
      }
    if(choice == computer_num){
      System.out.println("It's a draw! Both you and the computer chose the number " + choice + " which is " + selection +"."); 
    }else if((choice == 2 &&  computer_num == 1  && choice < 3) || (choice == 0 && computer_num == 2 && choice <3) || (choice == 1 && computer_num == 0 && choice <3) ){
      System.out.println("You win! Your " + selection + " beats the computer's " + computerSelection + "!!");
    }else if((choice == 1 && computer_num == 2 && choice < 3) || (choice == 0 && computer_num == 1 && choice <3) || (choice == 2 && computer_num == 0 && choice <3)){
      System.out.println("You lose! Your " + selection + " has been beaten by the computer's " + computerSelection + "!!");
    }else{
      System.out.println("Oops, that is not a valid entry please try again!");
    }
    System.out.println("Enter (-1) to quit or (1) to play again");
    quit = inputBox.nextInt();
    if(quit == -1){
      break;
    }
    }
  }//end of main method
}//end RockPaperScissors class