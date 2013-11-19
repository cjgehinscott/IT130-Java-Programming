//CJ Gehin-Scott

public class Book{
 
  String title;
  int pages;
  
  public Book(){
   title = "";
   pages = 0;
  }//end default constructor
  
  public Book(String _title, int _pages){
    title = _title;
    pages = _pages;
  }//end constructor
  
  public void setTitle(String _title){
    title = _title;
  }// title setter
  
  public void setPages(int _pages){
    pages = _pages;
  }//pages setter
  
  String getTitle(){
    return title;
  }//title getter
  
  int getPages(){
    return pages;
  }//pages getter
  
  public void displayInfo(){
    System.out.println("Title: " + title);
    System.out.println("Number of Pages: " + pages);
  }
}