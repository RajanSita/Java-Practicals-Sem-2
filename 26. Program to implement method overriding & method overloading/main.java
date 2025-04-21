class Shape {
    // Method overloading examples
    public double calculateArea(int radius) {
        System.out.println("Calculating area of circle");
        return Math.PI * radius * radius;
    }
    
    public double calculateArea(int length, int width) {
        System.out.println("Calculating area of rectangle");
        return length * width;
    }
    
    // Method to be overridden
    public void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    // Method overriding
    @Override
    public void display() {
        System.out.println("This is a circle with radius " + radius);
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    // Method overriding
    @Override
    public void display() {
        System.out.println("This is a rectangle with length " + length + " and width " + width);
    }
}

public class main {
    public static void main(String[] args) {
        // Method overloading demonstration
        Shape shape = new Shape();
        System.out.println("Area of circle: " + shape.calculateArea(5));
        System.out.println("Area of rectangle: " + shape.calculateArea(4, 6));
        
        System.out.println("\n-------------------\n");
        
        // Method overriding demonstration
        Shape s1 = new Shape();
        Shape s2 = new Circle(5);
        Shape s3 = new Rectangle(4, 6);
        
        System.out.println("Method overriding demonstration:");
        s1.display();  // Calls Shape's display()
        s2.display();  // Calls Circle's display()
        s3.display();  // Calls Rectangle's display()
    }
}