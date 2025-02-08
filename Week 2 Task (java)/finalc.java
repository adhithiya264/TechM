package finalc;

//Final class cannot be subclassed
final class FinalClass {
 
 // Final variable, its value cannot be changed after initialization
 final int FINAL_VARIABLE = 10;
 
 // Constructor for FinalClass
 public FinalClass() {
     System.out.println("FinalClass object created.");
 }

 // Final method cannot be overridden in subclass
 public final void display() {
     System.out.println("This is a final method in FinalClass.");
 }

 // Final variable usage in method
 public void show() {
     System.out.println("The value of FINAL_VARIABLE is: " + FINAL_VARIABLE);
 }
}

//Attempting to extend a final class will cause a compile-time error
//class SubClass extends FinalClass {  // Uncommenting this line will cause an error
//  // Cannot inherit from final class FinalClass
//}

public class FinalKey {
 public static void main(String[] args) {
     // Creating object of FinalClass
     FinalClass obj = new FinalClass();
     
     // Calling the final method
     obj.display();
     
     // Calling the show method which uses the final variable
     obj.show();
     
     // Trying to modify the final variable (this will cause a compile-time error)
     // obj.FINAL_VARIABLE = 20;  // Uncommenting this line will cause an error
 }
}
