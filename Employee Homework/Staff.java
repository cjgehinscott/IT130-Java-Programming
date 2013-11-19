public class Staff extends Employee{
  private String jobType;
  
  public Staff(){
  super();
  jobType = "";
  }//end default constructor
  
 public Staff(int _ssn, String _firstName, String _lastName, double _monthlySalary, String _jobType){
   super(_ssn, _firstName, _lastName, _monthlySalary);
    jobType = _jobType;
  }
    
  
  public void setJobType(String _jobType){
    jobType = _jobType;
  }//ends setJobType
  
  public String getJobType(){
    return jobType;
  }//ends getJobType

}//end Staff class