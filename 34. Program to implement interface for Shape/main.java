interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    public void perimeter() {
        System.out.println("Circle Perimeter: " + (2 * Math.PI * radius));
    }
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    public void perimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public void area() {
        System.out.println("Square Area: " + (side * side));
    }

    public void perimeter() {
        System.out.println("Square Perimeter: " + (4 * side));
    }
}

public class main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape s = new Square(3);

        c.area();
        c.perimeter();

        r.area();
        r.perimeter();

        s.area();
        s.perimeter();
    }
}
