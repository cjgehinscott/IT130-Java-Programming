//CJ Gehin-Scott

public class BookDemo{
 
  public static void main(String[] args){
    Book book1 = new Book();
    book1.setTitle("Small Java How to Program");
    book1.setPages(1000);
    System.out.println("Book 1: ");
    book1.displayInfo();
    
    Book book2 = new Book("Java an Introduction to Problem", 978);
    System.out.println("Book 2: ");
    book2.displayInfo();
    
    TextBook tb1 = new TextBook();
    tb1.setTitle("Introduction to Java Programming");
    tb1.setPages(1600);
    tb1.setGradeLevel(1);
    System.out.println("Book 3: ");
    tb1.displayInfo();
    
    TextBook tb2 = new TextBook("Advanced Java Programming", 980, 2);
    System.out.println("Book 4: ");
    tb2.displayInfo();
  }
}