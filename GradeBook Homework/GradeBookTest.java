public class GradeBookTest{
  public static void main(String[] args){
    
    GradeBook physics = new GradeBook();
    physics.setCourseName("Physics");
    physics.setInstructorName("Albert Einstein");
    physics.displayMessage();
    
    GradeBook history = new GradeBook();
    history.setCourseName("History");
    history.setInstructorName("George Washington");
    history.displayMessage();
    
  }//end main method
}//end GradeBookTest class