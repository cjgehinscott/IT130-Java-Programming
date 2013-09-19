/*CJ Gehin-Scott
 * 9/17/2013
 * IT-130*/

import java.util.Scanner;

public class Commission {

  public static void main(String[] args){
  Scanner inputBox = new Scanner(System.in);
  double productOne = 239.99;
  double productTwo = 129.75;
  double productThree = 99.95;
  double productFour = 350.89;
  int productCount;
  double numberOne = 0;
  double numberTwo = 0;
  double numberThree = 0;
  double numberFour = 0;
  
  for(int i = 1; i <=4; i++){
    System.out.println("Enter the number of products sold for product #" + i);
  productCount = inputBox.nextInt();
      if(i ==1){
        numberOne = productCount * productOne;
     }else if(i == 2){
        numberTwo = productCount * productTwo;
     }else if(i == 3){
        numberThree = productCount * productThree;
     }else if(i == 4){
        numberFour = productCount * productFour;
     }
  }
  
    double grossPay = 200 + (.09 * (numberOne + numberTwo + numberThree + numberFour));
    System.out.println("Your gross pay for the products you sold this period is: $" + grossPay);
    
  
  
  
  
  
  }// end of main method
}//end of Commission class