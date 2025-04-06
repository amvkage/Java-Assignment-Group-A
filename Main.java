// Interface example
// Defines a contract for all animals with no implementation for makeSound
// Default methods can provide shared behavior

interface Animal {

    // Abstract method (implicitly public and abstract)
    void makeSound();

    // Default method
    default void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Abstract class example
// Provides a base class for specific types of animals with some shared behavior
abstract class Mammal implements Animal {

    // Abstract method (implicitly public and abstract)
    public abstract void giveBirth();

    // Concrete method
    public void walk() {
        System.out.println("This mammal is walking.");
    }

    // Concrete method
    public void breathe() {
        System.out.println("This mammal is breathing.");
    }
}

// Concrete class example
// Fully implements the Animal interface and extends the Mammal abstract class
class Dog extends Mammal {

    // Implementing abstract methods
    public void makeSound() {
        System.out.println("Bark!");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void giveBirth() {
        System.out.println("Dog is giving birth.");
    }
}

public class Main {

    public static void main(String[] args) {
        // Creating an object of the concrete class
        Dog dog = new Dog();

        // Calling methods
        dog.makeSound(); // from Interface
        dog.sleep();     // default method from Interface
        dog.breathe();   // concrete method from Abstract class
        dog.eat();       // abstract method from Abstract class implemented in Dog
    }
}
