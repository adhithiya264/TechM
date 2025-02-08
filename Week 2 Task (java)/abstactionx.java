package abstraction;

//Abstract class Animal
abstract class Animal {
 // Abstract method, meant to be overridden by subclasses
 public abstract void makeSound();
}

//Concrete subclass Dog
class Dog extends Animal {
 // Overriding the makeSound method in Dog class
 @Override
 public void makeSound() {
     System.out.println("The dog is barking!");
 }
}

public class abstractionx {
 public static void main(String[] args) {
     // Creating an object of Dog
     Animal myDog = new Dog();
     
     // Calling the overridden method
     myDog.makeSound();  // Output: The dog is barking!
 }
}
