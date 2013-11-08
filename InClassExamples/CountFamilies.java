/*CJ Gehin-Scott
 * IT-130
 * 10/30/2013*/

import java.util.Scanner;

public class CountFamilies {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int size = 0;
    double maxIncome = 0;
    double percentIncome = 0;
    int familyBelow = 0;
    
    System.out.println("How many family members do you have?");
    size = input.nextInt();
    double familyIncome[] = new double[size];
    for(int i=0; i<familyIncome.length; i++){
      System.out.println("Please enter income of family member " + (i+1) + ": ");
      familyIncome[i] = input.nextDouble();
    }
    System.out.println();
    for(int i = 0; i<familyIncome.length; i++){
      System.out.printf("Income of Family Member " + (i+1) + "  is: $%.2f",familyIncome[i]);
      System.out.println();
      if(familyIncome[i] > maxIncome){
        maxIncome = familyIncome[i];
      }
     }
      System.out.printf("Maximum income: $%.2f",maxIncome);
      System.out.println();
      percentIncome = maxIncome * 0.10;
      System.out.printf("10 percent of maximum income: $%.2f",percentIncome);
      System.out.println();
      
      for(int i = 0; i < familyIncome.length; i++){
        if(familyIncome[i] < percentIncome){
          familyBelow++;
        }
      }
      System.out.println("Number of family members whose income is below 10 percent: " + familyBelow);
  }//end of main method
}//end CountFamilies class