interface Animal {
    void eat(); // Abstract method
    void sleep(); // Abstract method
}

//class 1 implementing the Animal interface
class dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

    //class 2 implementing the Animal interface
    class cat implements Animal {
        public void eat() {
            System.out.println("Cat is eating");
        }
        public void sleep() {
            System.out.println("Cat is sleeping");
        }
    }
    //main class
    public class InterfaceExample {
        public static void main(String[] args) {
            Animal dog = new dog();
            dog.eat();
            dog.sleep();
            
            System.out.println();

            Animal cat = new cat();
            cat.eat();
            cat.sleep();
        }
    }