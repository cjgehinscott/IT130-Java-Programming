/*CJ Gehin-Scott
 * IT-130
 * 11/5/2013*/

public class TestMethodExample{
 public static void main(String[] args){
    MethodExample m = new MethodExample();
    m.computeAreaOfCircle1();
    m.computeAreaOfCircle2(4.0);
    double a = m.computeAreaOfCircle3(4.0);
    a=a+1;
    System.out.println("a= " + a); 
    double b = m.computeAreaOfTriangle(4,6.5);
    System.out.println("b= " + b);
   }
}
