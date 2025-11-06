public class ConstructorExample {
    String name;
    int age;

    // Constructor
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating first object using constructor
        ConstructorExample person1 = new ConstructorExample("Noyon Hossain", 23);
        person1.displayInfo();

        System.out.println("------------------");

        // Creating second object using constructor
        ConstructorExample person2 = new ConstructorExample("NoyonSoftWorks", 25);
        person2.displayInfo();
    }
}
