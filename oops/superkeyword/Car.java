package oops.superkeyword;


// child constuctor
public class Car extends Vehicles {
   public Car(){
    // if parent paramtrized to call parent constucyor  we write super to pass or call parent con  
    super( "four wheeler");
    System.out.println("car con called...");
   }
}
