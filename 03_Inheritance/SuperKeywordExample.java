// Parent class
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class
class Dog extends Animal {
    String color = "Brown";

    Dog() {
        super(); // calling parent constructor
        System.out.println("Dog constructor called.");
    }

    void displayColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color); // access parent variable
    }

    void eat() {
        super.eat(); // calling parent method
        System.out.println("Dog is eating meat...");
    }
}

// Main class
public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println();

        dog1.displayColor();
        System.out.println();
        dog1.eat();
    }
}
