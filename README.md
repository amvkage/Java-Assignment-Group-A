# Java-Assignment-Group-A
Java Assignment-Group A
# Java Class Types: Interface vs Abstract Class vs Concrete Class

## Overview
This project demonstrates the use of:
- **Interface**: Declares a contract without implementation.
- **Abstract Class**: Provides partial implementation with abstract and concrete methods.
- **Concrete Class**: Fully implemented class that can be instantiated.

## Structure

1. **Interface - `Animal`**
   - Declares an abstract method `makeSound()` and a default method `sleep()`.

2. **Abstract Class - `Mammal`**
   - Implements the `Animal` interface.
   - Contains:
     - Abstract method `eat()`
     - Concrete method `breathe()`

3. **Concrete Class - `Dog`**
   - Extends `Mammal`.
   - Implements all abstract methods (`makeSound` and `eat`).

## How to Run
Compile and run `Main.java`. The output will demonstrate the use of interface methods, abstract class methods, and concrete class implementations.
