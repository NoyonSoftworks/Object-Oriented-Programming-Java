abstract class Animal {
    abstract void makeSound();
    
    void sleep() {
        System.out.println("Zzz Zzz");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Woof Woof
        dog.sleep();     // Output: Zzz Zzz
    }
}
