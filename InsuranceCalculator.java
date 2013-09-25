/*CJ Gehin-Scott
 * 9/24/2013
 * IT-130*/

import java.util.Scanner;

public class InsuranceCalculator{
  public static void main(String[] args){
 
    Scanner inputBox = new Scanner(System.in);
    int age;
    int gender;
    double rate = 0;
    int choice;
    
    while(true){
      System.out.println("Please enter your age: ");
      age = inputBox.nextInt();
      System.out.println("Please enter your gender (1) for male or (2) for female: ");
      gender = inputBox.nextInt();
      if(age <= 30 && age >= 18 && gender == 2){
        rate = 10; 
      }else if(age <= 30 && age >= 18 && gender == 1){
        rate = 15.25;
      }else if(age <= 60 && age >= 31 && gender == 2){
        rate = 20.00;
      }else if(age <= 60 && age >= 31 && gender == 1){
        rate = 25.25;
      }else if(age >=61 && gender == 2){
        rate = 30.00;
      }else if(age >= 61 && gender == 1){
        rate = 30.55;
      }else
        System.out.println("Error. Invalid Selections");
    System.out.println("Your rate will be $" + rate + "/month.");
    System.out.println("Would you like to re-enter your information? (1) YES (2) NO");
    choice = inputBox.nextInt();
     if(choice == 2){
       break;
        }
     }
    System.out.println("Thank You for using the insurance rate calculator.");
  }//end main
}//end InsuranceCalculator class