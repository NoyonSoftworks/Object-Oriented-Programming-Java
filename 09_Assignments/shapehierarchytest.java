//abstract class Shape
abstract class Shape{
    protected String name;
    public Shape(String name){
        this.name=name;
    }
    //concrete method for print name
    public void displayInfo(){
        System.out.println("Shape Name: "+name);
    }
    //abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
//subclass Circle
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
//subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class shapehierarchytest {
    public static void main(String[] args) {
       //Shape s= new Shape("Shape"); //cannot instantiate abstract class
       Shape circle = new Circle(5.00);
       Rectangle rectangle = new Rectangle(4.0,6.0);
       System.out.println("--Circle Information--");
       circle.displayInfo();
         System.out.printf("Area: %.2f\n", circle.calculateArea());
            System.out.printf("Perimeter: %.2f\n", circle.calculatePerimeter());
         System.out.println("\n--Rectangle Information--");
            rectangle.displayInfo();
            System.out.printf("Area: %.2f\n", rectangle.calculateArea());
            System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
    }
}