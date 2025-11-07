public class ObjectArrayExample {
    // Instance variable
    int value;

    // Constructor
    ObjectArrayExample(int value) {
        this.value = value;
    }

    // Method to display value
    void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Create an array of ObjectArrayExample objects
        ObjectArrayExample[] objArray = new ObjectArrayExample[3];

        // Initialize objects in the array
        objArray[0] = new ObjectArrayExample(10);
        objArray[1] = new ObjectArrayExample(20);
        objArray[2] = new ObjectArrayExample(30);

        // Display values of each object in the array
        for (ObjectArrayExample obj : objArray) {
            obj.displayValue();
        }
    }
}
