public class MathExample {
    public static void main(String[] args) {
        // Basic Math Operations
        int num1 = 15;
        int num2 = 4;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Using Math class
        double power = Math.pow(num1, num2);
        double squareRoot = Math.sqrt(num1);
        double absoluteValue = Math.abs(-num1);
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);

        System.out.println("Power: " + power);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Absolute Value: " + absoluteValue);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
