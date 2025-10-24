class overload{
    // Two int parameters
    void add(int a,int b){
        System.out.println(a+b);
    }
    // Two float parameters
    void add(float a,float b){
        System.out.println(a+b);
    }
    // Three int parameters
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    // No parameters
    void add(){
        System.out.println("Nothing to add");
    }
}
    public class Main {
        public static void main(String[] args){
            overload ol= new overload();
            ol.add(); // No parameter
            ol.add(5,10); // Two int
            ol.add(5.5f,1.1f); // Two float (notice the f)
            ol.add(5,10,20); // Three int
        }
    }
