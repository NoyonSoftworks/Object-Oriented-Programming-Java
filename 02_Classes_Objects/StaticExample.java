public class StaticExample {
    // Static variable
    static int staticCounter = 0;
    
    // Instance variable
    int instanceCounter = 0;
    
    // Method to increment counters
    void incrementCounters() {
        staticCounter++;
        instanceCounter++;
    }
    
    // Method to display counters
    void displayCounters() {
        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Instance Counter: " + instanceCounter);
    }
    
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        
        obj1.incrementCounters();
        obj1.displayCounters();
        
        System.out.println("------------------");
        
        obj2.incrementCounters();
        obj2.displayCounters();
        
        System.out.println("------------------");
        
        obj1.incrementCounters();
        obj1.displayCounters();
        
        System.out.println("------------------");
        
        obj2.incrementCounters();
        obj2.displayCounters();
    }
}
