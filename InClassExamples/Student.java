public class Student {
  private String name;
  private int id;
  private double balance;
  
  public Student() {
    
  }
  public Student(String newName, int newId, double newBalance){
    name = newName;
    id = newId;
    balance = newBalance;
  }
  
  public void setName(String newName) {
    name = newName;
   }
  public void setId(int newId){
    id = newId;
  }
  public void setBalance(double newBalance){
   balance = newBalance; 
  }
  
  public String getName() {
    return name;
  }
  public int getId(){
   return id; 
  }
  public double getBalance(){
   return balance; 
  }
  
  public void studentPrintOut() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Balance: $" + balance);
  }//end studentPrintOut method
  
}//end Student class