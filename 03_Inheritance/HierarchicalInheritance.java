// Java Program to Demonstrate Hierarchical Inheritance

// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        System.out.println();

        // Creating Cat object
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
