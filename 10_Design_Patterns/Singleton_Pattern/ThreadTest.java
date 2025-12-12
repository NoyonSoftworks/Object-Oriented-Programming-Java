class Singleton {
    private static Singleton instance;
    private Singleton(){
        System.out.println("Thread Example Singleton Pattern");
    }
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
}
// Main class
public class ThreadTest {
    public static void main(String[] args){
        Thread t1= new Thread(new Runnable(){
            public void run (){
                Singleton.getInstance();
            }
        });
        Thread t2= new Thread(new Runnable(){
            public void run (){
                Singleton.getInstance();
            }
        });
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}// Ensures t1 gets a chance to execute first but it's take to much time to be reliable.it's just for demonstration purpose.
        t2.start();
    }
}