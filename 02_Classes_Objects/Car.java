public class Car{
    //Properties
    String brand;
    String color;
    int year;
    double price;
    //display information
    void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Colour: "+ color);
        System.out.println("Year: "+ year);
        System.out.println("price: "+ price);
    }
    public static void main(String[] args){
        // Creating first Car object
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.color = "Black";
        c1.year = 2022;
        c1.price = 25000.50;
        c1.displayInfo();
        
         System.out.println("------------------");

        // Creating second Car object
        Car c2 = new Car();
        c2.brand = "Tesla";
        c2.color = "White";
        c2.year = 2024;
        c2.price = 55000.00;
        c2.displayInfo();
        

    }
}

