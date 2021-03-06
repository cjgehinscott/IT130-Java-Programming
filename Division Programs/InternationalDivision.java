public class InternationalDivision extends Division{
 public String country;
 public String language;
 
 public InternationalDivision(){
   super();
   country = "";
   language = "";
 }//end default constructor
 
 public InternationalDivision(String _divisionName, String _accountNumber, String _country, String _language){
   super(_divisionName, _accountNumber);
   country = _country;
   language = _language;
 }
 
 public void setCountry(String _country){
   country = _country;
 }
 public String getCountry(){
   return country;
 }
 
 public void setLanguage(String _language){
   language = _language;
 }
 
 public String getLanguage(){
   return language;
 }
 public void display(){
   System.out.println(getDivisionName());
   System.out.println("Company Name: Coca Cola");
   System.out.println("Account Number: " + getAccountNumber());
   System.out.println("Country: " + country);
   System.out.println("Language: " + language);
 }
}