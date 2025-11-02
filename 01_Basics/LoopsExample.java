public class LoopsExample {
    //loop examples in java
    public static void main(String[] args) {
        //for loop
        System.out.println("For Loop:");
        for (int i=1; i<=5; i++) {
            System.out.println(i);
        }
        //while loop
        System.out.println("While Loop:");
        int j=1;
        while (j<=5) {
            System.out.println(j);
            j++;
        }
        //do while loop
        System.out.println("Do While Loop:");
        int k=1;
        do {
            System.out.println(k);
            k++;
        } while (k<=5);
        //enhanced for loop
        System.out.println("Enhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

    }
    
}
