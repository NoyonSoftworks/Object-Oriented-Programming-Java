class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Animal animal;  // reference variable of parent class

        animal = new Dog(); // parent reference → Dog object
        animal.sound();     // Dog’s version executes

        animal = new Cat(); // parent reference → Cat object
        animal.sound();     // Cat’s version executes
    }
}
