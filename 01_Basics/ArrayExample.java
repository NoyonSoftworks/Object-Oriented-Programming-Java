public class ArrayExample {
    public static void main(String[] args) {
        //array declaration and initialization
        int[] numbers = {10,20,30,40,50};
        //accessing array elements
        for (int i=0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        //array sum calculation
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Current sum: " + sum);
    }
    
}
