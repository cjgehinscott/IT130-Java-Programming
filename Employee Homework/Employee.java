//superclass employee


public abstract class Employee{
 private int ssn;
 private String firstName;
 private String lastName;
 public double monthlySalary;
 public double annualSalary;
 private String jobType;
 
 //public abstract double getAnnualSalary();
  
 public Employee(){
   ssn = 0;
   firstName = "";
   lastName = "";
   monthlySalary = 0;
   jobType="";
 }//end blank Employee Constructor
 
 public Employee(int _ssn, String _firstName, String _lastName, double _monthlySalary, String _jobType){
 ssn = _ssn;
 firstName = _firstName;
 lastName = _lastName;
 monthlySalary = _monthlySalary;
 jobType =_jobType;
 }//end default Employee Contructor
 
  
  public void setSSN(int _ssn){
    ssn = _ssn;
  }//end setSSN
  
  public int getSSN(){
    return ssn;
  }//end getSSN
  
  public void setFirstName(String _firstName){
    firstName = _firstName;
  }//firstName setter
  
  public void setLastName(String _lastName){
   lastName = _lastName; 
  }//lastName setter
  
  public void setMonthlySalary(double _monthlySalary){
   monthlySalary = _monthlySalary;
   annualSalary = _monthlySalary * 12;
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
  
   public void setJobType(String _jobType){
    jobType = _jobType;
  }//ends setJobType
  
  public String getJobType(){
    return jobType;
  }//ends getJobType
  
  public double getAnnualSalary(){
    return annualSalary;
  }//ends getAnnualSalary
  
  
  
  public void employeePrintOut(){
   System.out.println("SSN: " + ssn);
   System.out.println("First Name: " + firstName);
   System.out.println("Last Name: " + lastName);
   System.out.printf("Annual Salary: $%.2f", annualSalary);
   System.out.println();
  }
  
}//end Employee class