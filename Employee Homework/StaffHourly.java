public class StaffHourly extends Staff {
 double hours;
 double payRate;
 double payCheck;
  
 public StaffHourly(){
    super();
    hours = 0;
    payRate = 0;
  }//ends default constructor
  
  public StaffHourly(int _ssn,String _firstName,String _lastName, double _monthlySalary, String _jobType,double _hours,double _payRate){
    super(_ssn, _firstName, _lastName, _monthlySalary, _jobType);
    hours = _hours;
    payRate = _payRate;
  }
  
  public void setHours(double _hours){
    hours = _hours;
  }
  double getHours(){
    return hours;
  }
  public void setPayRate(double _payRate){
    payRate = _payRate;
  }
  double getPayRate(){
    return payRate;
  }
  double payCheck(){
    payCheck = hours * payRate;
    return payCheck;
  }
  public void displayInfo(){
    System.out.println("Job Type: " + getJobType());
    System.out.println("SSN: " + getSSN());
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Hours: " + hours);
    System.out.println("Pay Rate: " + payRate);
    System.out.println("Weekly paycheck: " + payCheck());
  }
                  
}