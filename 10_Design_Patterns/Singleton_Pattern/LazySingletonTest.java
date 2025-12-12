class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Lazy Singleton Pattern");
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}
// Main class
public class LazySingletonTest {
    public static void main(String[] args){
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1==obj2){
            System.out.println("Both are same instances");
        }

    }
}