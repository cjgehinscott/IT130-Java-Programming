/*CJ Gehin-Scott
 * IT-130
 * 10/30/2013*/

import java.util.Scanner;

public class Grade{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int classSize = 0;//tracks the size of the class based on user input below
    int bestScore = 0;//tracks the best score throughout 
    char letterGrade = '\0';
    
    System.out.println("Enter number of students: ");
    classSize = input.nextInt();//scanner asks user to enter class size and store it in classSize
    int grades[] = new int[classSize];//creates array named grades that is the size of whatever the user entered above as the class size
    
/*loops through grades array to prompt user to enter in grade associated with each student.
 * it also calculates the best score as the loop is performed*/
    for(int i = 0; i < grades.length; i++){
     System.out.println("Enter score for Student " + (i+1) + ": ");
     grades[i] = input.nextInt();
     if(grades[i] > bestScore){
      bestScore = grades[i]; 
     }
    }
    System.out.println("Best Score is: " + bestScore);//prints best score calculated in the loop above
    
    /*loops through grades array and prints the number grade as well as the letter grade based on the following criteria:
     * Grade is A if score is >= best Ð 10
     *Grade is B if score is >= best Ð 20
     *Grade is C if score is >= best Ð 30
     *Grade is D if score is >= best Ð 40
     *Grade is F otherwise:*/
    for(int i = 0; i<grades.length; i++){
      if(grades[i] >= (bestScore - 10)){
        letterGrade = 'A';
      }else if(grades[i] >= (bestScore-20) && grades[i] <= (bestScore - 10)){
        letterGrade = 'B';
      }else if(grades[i] >= (bestScore-30) && grades[i] <= (bestScore - 20)){
        letterGrade = 'C';
      }else if(grades[i] >= (bestScore-40) && grades[i] <= (bestScore - 30)){
        letterGrade = 'D';
      }else{
        letterGrade = 'F';
      }
      System.out.println("Student " + (i+1) + "'s score is " + grades[i] + " which is equivalent to a letter grade of " + letterGrade);
    }
    
  }//end main method
}//end of Grade Class