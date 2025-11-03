import java.util.Scanner;
public class MethodExample {
    //method to add two numbers
    static int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int result = add(5,10);
        System.out.println("Sum: " + result);
        //take input from user
        int c;
        int d;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        c = input.nextInt();
        System.out.println("Enter The Second Number: ");
        d = input.nextInt();
        int result2 = add(c,d);
        System.out.println("Sum: " + result2);
        input.close();
    }
}
