public class StaffMonthly extends Employee{
  
  public double getAnnualSalary(){
    annualSalary = getMonthlySalary() *12;
    return annualSalary;
  }
  public StaffMonthly(){
    super();
  }
  
  public StaffMonthly(int _ssn, String _firstName, String _lastName, double _monthlySalary, String _jobType){
    super(_ssn, _firstName, _lastName, _monthlySalary, _jobType);
  }
 
  public void displayInfo(){
   System.out.println("SSN: " + getSSN());
   System.out.println("First Name: " + getFirstName());
   System.out.println("Last Name: " + getLastName());
   System.out.printf("Annual salary: $%.2f", getAnnualSalary());
   System.out.println(); 
  }
  
}