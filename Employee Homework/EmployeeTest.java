public class EmployeeTest{
  public static void main(String[] args){
    Employee e1 = new Employee();
    e1.setFirstName("John");
    e1.setLastName("Smith");
    e1.setMonthlySalary(3000.00);
    e1.employeePrintOut();
    double raise = (e1.getMonthlySalary() * 0.10) + e1.getMonthlySalary();
    e1.setMonthlySalary(raise);
    System.out.printf("%s's new annual salary is: $%.2f",e1.getFirstName(), e1.getAnnualSalary());
    System.out.println();
    
    Employee e2 = new Employee();
    e2.setFirstName("Brian");
    e2.setLastName("Adams");
    e2.setMonthlySalary(4750.00);
    e2.employeePrintOut();
    raise = (e2.getMonthlySalary() * 0.10) + e2.getMonthlySalary();
    e2.setMonthlySalary(raise);
    System.out.printf("%s's new annual salary is: $%.2f",e2.getFirstName(),e2.getAnnualSalary());
    System.out.println();
   
    
  }//end main method
}//end EmployeeTest class