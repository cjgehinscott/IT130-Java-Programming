/*CJ Gehin-Scott
 * IT-130
 * 10/22/2013*/

import java.util.Scanner;

public class ArrayExample{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num_array [] = new int[6];
    num_array [0] = 7;
    num_array [3] = 1;
    num_array [1] = 9;
    num_array[2] = 10;
    num_array[4] = 8;
    num_array[5] = 100;
    for(int i = 0; i < num_array.length; i++){
      System.out.println(num_array[i]);
    }
    int z = num_array[num_array[3]] + num_array[3];
    System.out.println(z);
    
    System.out.println("How many numbers would you like to enter: ");
    int size = input.nextInt();
    int newArray[] = new int[size];
    
    for(int i = 0; i< newArray.length; i++){
    System.out.println("Enter a number you want stored for index " + i + ": ");
    newArray[i] = input.nextInt();
    }
    int total = newArray[0];
    for(int i = 0; i<newArray.length; i++){
      total = total +newArray[i];
    }
    
    int smallest = newArray[0];
    for(int i = 0; i<newArray.length; i++){
      if(newArray[i] < smallest){
        smallest = newArray[i];
      }
    }
    System.out.println("The smallest numer you entered is: " + smallest + ".");

    
  }//end of main method
}//end of ArrayExample