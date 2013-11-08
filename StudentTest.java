public class StudentTest{
  public static void main(String[] args){
    Student s1 = new Student();
    s1.setName("John");
    s1.setId(1);
    s1.setBalance(100.00);
    double d = s1.getBalance() + 5;
    s1.setBalance(d);
    System.out.println("Your new balance is: $" + d);
    s1.studentPrintOut();
    
    Student s2 = new Student();
    s2.setName("Bobby");
    s2.setId(2);
    s2.setBalance(300.00);
    s2.studentPrintOut();
    
    Student s3 = new Student();
    s3.setName("David");
    System.out.println(s3.getName());
    
    Student s4 = new Student("Molly",3,10000.00);
    s4.studentPrintOut();
    
    
  }//end main method
  
}//end StudentTest class