class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class PolymorphismExampleUsingArray {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        for (Shape s : shapes) {
            s.draw(); // Different draw() executes based on object type
        }
    }
}
