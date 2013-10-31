// CJ GEHIN-SCOTT - THINKER
// FERNANDO QUIROZ

import java.util.Scanner;
public class NumberAboveAverage2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double temp[] = new double[10];
        double sum = 0;
        for(int i = 0; i < temp.length; i++){
        System.out.print(" Enter day " + (i + 1) + ": ");
        temp[i] = input.nextDouble();
        sum = sum + temp[i];
        }
        
        double average = sum / temp.length;
        System.out.printf(" Average = %.1f", average); // %.2f spaces 2, %.1f spaces 1 
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > average){
            count = count + 1;
            }
            
        }
        System.out.println();
        System.out.println(" Number of days about average : " + count);
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > average){
                System.out.println(" Day " + (i + 1) + " : " + temp[i]);
            }
            
        }
    }
    

}
