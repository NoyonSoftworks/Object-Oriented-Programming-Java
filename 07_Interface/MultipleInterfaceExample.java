interface Printable {
    void print();
}
interface Showable{
    void show();
}

//class implementing multiple interfaces
class Documents implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }
    public void show() {
        System.out.println("Showing document...");
    }
}
    //main class
    public class MultipleInterfaceExample{
        public static void main(String[] args) {
            Documents doc = new Documents();
            doc.print();
            doc.show();
        }
    }
    