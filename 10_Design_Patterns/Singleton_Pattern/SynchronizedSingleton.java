class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Created");
    }
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
// Main class
public class SynchronizedSingleton {
    public static void main(String[] args){
        Thread t1=new Thread(new Runnable(){
            public void run(){
                Singleton obj=Singleton.getInstance();
                System.out.println("T1: " + obj);
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                Singleton obj=Singleton.getInstance();
                System.out.println("T2: " + obj);
            }
        });
        t1.start();
        t2.start();

    }

}