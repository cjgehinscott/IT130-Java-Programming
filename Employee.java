public class Employee{
 public String firstName;
 public String lastName;
 public double monthlySalary;
  
  public Employee(){
  }//begin Employee constructor
  public Employee(String _firstName, String _lastName, double _monthlySalary){
    firstName = _firstName;
    lastName = _lastName;
    monthlySalary = _monthlySalary;
  }//end Employee constructor
  
  public void setFirstName(String _firstName){
    firstName = _firstName;
  }//firstName setter
  
  public void setLastName(String _lastName){
   lastName = _lastName; 
  }//lastName setter
  
  public void setMonthlySalary(double _monthlySalary){
   monthlySalary = _monthlySalary; 
  }//mothlySalary setter
  
  public String getFirstName(){
   return firstName;
  }//firstName getter
  
  public String getLastName(){
    return lastName;
  }//lastName getter
  
  public double monthlySalary(){
   return monthlySalary; 
  }
  
  public void raise(double _monthlySalary){
    
  }
  
}//end Employee class