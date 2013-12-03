public class UseDivision{
 
  public static void main(String[] args){
    
    InternationalDivision id1 = new InternationalDivision("International Division", "101", "China", "Chinese");
    DomesticDivision dd1 = new DomesticDivision("Domestic Division", "102", "Virginia");
    id1.display();
    dd1.display();
    dd1.setState("Maryland");
    dd1.displayChange();
    
    
  }
}