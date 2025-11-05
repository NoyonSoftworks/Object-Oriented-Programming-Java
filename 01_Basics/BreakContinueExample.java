public class BreakContinueExample {
    public static void main(String[] args) {
        // Example of break statement
        System.out.println("Using break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }

        // Example of continue statement
        System.out.println("\nUsing continue statement:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }
    }
}
