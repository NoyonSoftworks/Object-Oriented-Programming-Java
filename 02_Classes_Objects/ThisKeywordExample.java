public class ThisKeywordExample {
    String name;
    int age;

    // Method to set values using 'this' keyword
    void setValues(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ThisKeywordExample person = new ThisKeywordExample();
        person.setValues("Noyon Hossain", 23);
        person.displayInfo();
    }
}
