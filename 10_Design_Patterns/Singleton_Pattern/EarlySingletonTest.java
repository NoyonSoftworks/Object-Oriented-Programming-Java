class EarlySingleton {

    private static EarlySingleton instance =
            new EarlySingleton();

    private EarlySingleton() {
    }

    public static EarlySingleton getInstance() {
        return instance;
    }

    public void display() {
        System.out.println("Early Singleton Pattern");
    }
}

// Main class
public class EarlySingletonTest {
    public static void main(String[] args) {

        EarlySingleton obj1 = EarlySingleton.getInstance();
        EarlySingleton obj2 = EarlySingleton.getInstance();

        obj1.display();

        if (obj1 == obj2) {
            System.out.println("Both are same instances");
        }
    }
}
