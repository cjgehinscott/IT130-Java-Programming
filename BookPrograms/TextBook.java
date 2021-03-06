//CJ Gehin-Scott

public class TextBook extends Book{
 
  int gradeLevel;
  
  public TextBook(){
   super();
   gradeLevel = 0;
  }//ends default constructor
  
  public TextBook(String _title, int _pages, int _gradeLevel){
   super(_title,_pages);
   gradeLevel = _gradeLevel;
  }//ends TextBook constructor
  
  public void setGradeLevel(int _gradeLevel){
    gradeLevel = _gradeLevel;
  }//ends gradeLevel setter
  
  int getGradeLevel(){
    return gradeLevel;
  }//ends gradeLevel getter
  
  public void displayInfo(){
    System.out.println("Title: " + title);
    System.out.println("Number of Pages: " + pages);
    System.out.println("Level: " + gradeLevel);
  }
}