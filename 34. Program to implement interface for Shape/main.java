interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    
    public void display() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Square implements Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
    
    @Override
    public double perimeter() {
        return 4 * side;
    }
    
    public void display() {
        System.out.println("Square with side: " + side);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

public class main {
    public static void main(String[] args) {
        // Create a circle
        Circle circle = new Circle(5.0);
        System.out.println("Circle Information:");
        circle.display();
        
        System.out.println("\n-------------------\n");
        
        // Create a rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Information:");
        rectangle.display();
        
        System.out.println("\n-------------------\n");
        
        // Create a square
        Square square = new Square(5.0);
        System.out.println("Square Information:");
        square.display();
        
        System.out.println("\n-------------------\n");
        
        // Using Shape reference
        Shape shape1 = new Circle(3.0);
        Shape shape2 = new Rectangle(2.0, 5.0);
        Shape shape3 = new Square(4.0);
        
        System.out.println("Using Shape references:");
        System.out.println("Shape 1 Area: " + shape1.area());
        System.out.println("Shape 1 Perimeter: " + shape1.perimeter());
        System.out.println("Shape 2 Area: " + shape2.area());
        System.out.println("Shape 2 Perimeter: " + shape2.perimeter());
        System.out.println("Shape 3 Area: " + shape3.area());
        System.out.println("Shape 3 Perimeter: " + shape3.perimeter());
    }
}