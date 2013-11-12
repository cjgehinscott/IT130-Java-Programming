public class Employee{
 public String firstName;
 public String lastName;
 public double monthlySalary;
 public double annualSalary;
  
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
   annualSalary = _monthlySalary * 12;// since annual salary is a function of monthly salary I set it in the setMonthlySalary method that way I don't have to worry about doing it later
  }//mothlySalary setter 
  
  public String getFirstName(){
   return firstName;
  }//firstName getter
  
  public String getLastName(){
    return lastName;
  }//lastName getter
  
  public double getMonthlySalary(){
   return monthlySalary; 
  }//ends getMonthlySalary
  
  public double getAnnualSalary(){
    return annualSalary;
  }//ends getAnnualSalary
  
  
  public void employeePrintOut(){
   System.out.println("First Name: " + firstName);
   System.out.println("Last Name: " + lastName);
   System.out.printf("Annual salary: $%.2f", annualSalary);
   System.out.println();
  }
  
}//end Employee class