public class NestedLoopExample {
    public static void main(String[] args) {
        // Example of nested loops
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Move to the next line after inner loop
        }
    }
}
