class Rectangle {
    private double length;
    private double width;
    
    // Default constructor
    public Rectangle() {
        length = 0;
        width = 0;
        System.out.println("Default constructor called");
    }
    
    // Parameterized constructor with one parameter
    public Rectangle(double side) {
        length = side;
        width = side;
        System.out.println("Constructor with one parameter called");
    }
    
    // Parameterized constructor with two parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Constructor with two parameters called");
    }
    
    public double area() {
        return length * width;
    }
    
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
}

public class main {
    public static void main(String[] args) {
        // Creating objects with different constructors
        System.out.println("Creating rectangle1 with no parameters:");
        Rectangle rectangle1 = new Rectangle();
        rectangle1.display();
        
        System.out.println("\nCreating rectangle2 with one parameter:");
        Rectangle rectangle2 = new Rectangle(5.0);
        rectangle2.display();
        
        System.out.println("\nCreating rectangle3 with two parameters:");
        Rectangle rectangle3 = new Rectangle(4.0, 6.0);
        rectangle3.display();
    }
}