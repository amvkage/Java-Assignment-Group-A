# Java-Assignment-Group-A
Java Assignment-Group A
# OOP Example: Interface, Abstract Class, and Concrete Class

##  Purpose
This project shows the difference between an **interface**, an **abstract class**, and a **concrete class** in Java using a simple animal example.



## Class Types Explained
- **Interface**: Defines a contract with no implementation (e.g., `Animal`).
- **Abstract Class**: Provides partial implementation, including both abstract and concrete methods (e.g., `Mammal`).
- **Concrete Class**: A fully implemented class that can be instantiated (e.g., `Dog`).

### Interface - `Animal`
- Represents a general contract for all animals.
- Says what an animal can do (e.g., `makeSound()`).
- Has no full method code, except for default methods like `sleep()`.

### Abstract Class - `Mammal`
- A base class for animals like dogs.
- Has some methods with code (`walk()`, `breathe()`) and some that need to be completed by child classes (`giveBirth()`).

### Concrete Class - `Dog`
- A full class that fills in all the missing parts.
- Can be used to create real objects.
- - Calls methods from all two types:
  - `makeSound()` → prints “Bark!”
  - `giveBirth()` → prints “Dog is giving birth.”
  - Adds its own method `eat()`.

