/*CJ Gehin-Scott
 * IT-130
 * 10/29/2013*/

import java.util.Scanner;

public class ArraySum{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int size = 0;
    double sum = 0.0;
    
    System.out.println("How many numbers will you enter?");
    size = input.nextInt();
    double numArray[] = new double[size];
    double percentArray[] = new double[size];
    for(int i = 0; i < numArray.length; i++){
      System.out.println("Enter number for index " + i + ": ");
      numArray[i] = input.nextDouble();
      sum = sum + numArray[i];
    }
    System.out.printf("The sum is %.2f.", sum);
    System.out.println();
    System.out.println("The numbers are: ");
    for(int i = 0; i < percentArray.length; i++){
      percentArray[i] = (numArray[i]/sum)*100;
      System.out.printf("%.2f is %.2f percent of the sum.",numArray[i],percentArray[i]);
      System.out.println();
    }
    
  }//end main method
}//end ArraySum class