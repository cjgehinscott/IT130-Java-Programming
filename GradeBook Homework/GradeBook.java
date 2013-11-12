public class GradeBook{
  
  private String courseName; //course name for this GradeBook
  private String courseInstructor; //name of the course's instructor
  
  public GradeBook(){
  }
  //constructor initializes courseName with String as an argument
  public GradeBook( String name, String instructor){
    courseName = name; //initializes courseName
    courseInstructor = instructor; //initializes courseInstructor
  }//end constructor
  
  //method to set courseName
  public void setCourseName(String name){
   courseName = name; //store the course name 
  }//end setCourseName method
  
  //method to get courseName
  public String getCourseName(){
    return courseName; 
  }//end getCourseName
  
  //method to set instructor's name
  public void setInstructorName(String instructor){
    courseInstructor = instructor;
  }//end setInstructorName method
  
  //method to get instructor's name
  public String getInstructorName(){
   return courseInstructor; 
  }//end getInstructorName method
  
  //display a message to the GradeBook user
  public void displayMessage(){
   System.out.printf("Welcome to the grade book for: \n%s!\nThis course is presented by: \n%s!\n",getCourseName(),getInstructorName());
  }
}//end GradeBook class