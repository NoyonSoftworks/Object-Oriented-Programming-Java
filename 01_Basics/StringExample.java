public class StringExample {
    public static void main(String[] args) {
        //string declaration and initialization
        String greeting = "Hello, World!";
        System.out.println(greeting);
        
        //string length
        int length = greeting.length();
        System.out.println("Length of the string: " + length);
        
        //string concatenation
        String name = "NoyonSoftWorks";
        String personalizedGreeting = greeting + " Welcome " + name + "!";
        System.out.println(personalizedGreeting);
        
        //string substring
        String sub = greeting.substring(7, 12);
        System.out.println("Substring: " + sub);
        
        //string to uppercase
        String upper = greeting.toUpperCase();
        System.out.println("Uppercase: " + upper);
        
        //string to lowercase
        String lower = greeting.toLowerCase();
        System.out.println("Lowercase: " + lower);
    }
}
