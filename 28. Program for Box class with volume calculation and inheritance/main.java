class Box {
    protected double height;
    protected double width;
    protected double depth;
    
    // Default constructor
    public Box() {
        this.height = 0;
        this.width = 0;
        this.depth = 0;
    }
    
    // Constructor with one parameter (cube)
    public Box(double side) {
        this.height = side;
        this.width = side;
        this.depth = side;
    }
    
    // Constructor with three parameters
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    // Method to calculate volume
    public double volume() {
        return height * width * depth;
    }
    
    // Method to display dimensions
    public void display() {
        System.out.println("Dimensions: " + height + " x " + width + " x " + depth);
        System.out.println("Volume: " + volume());
    }
}

class Box_new extends Box {
    private double weight;
    
    // Default constructor
    public Box_new() {
        super();  // Call parent's default constructor
        weight = 0;
    }
    
    // Constructor with one parameter (cube with weight)
    public Box_new(double side, double weight) {
        super(side);  // Call parent's single parameter constructor
        this.weight = weight;
    }
    
    // Constructor with dimensions and weight
    public Box_new(double height, double width, double depth, double weight) {
        super(height, width, depth);  // Call parent's three parameter constructor
        this.weight = weight;
    }
    
    // Method to display dimensions and weight
    @Override
    public void display() {
        super.display();  // Call parent's display method
        System.out.println("Weight: " + weight);
    }
}

public class main {
    public static void main(String[] args) {
        // Creating Box objects
        System.out.println("Creating a Box with default constructor:");
        Box box1 = new Box();
        box1.display();
        
        System.out.println("\nCreating a Box with one parameter (cube):");
        Box box2 = new Box(5.0);
        box2.display();
        
        System.out.println("\nCreating a Box with three parameters:");
        Box box3 = new Box(2.0, 3.0, 4.0);
        box3.display();
        
        // Creating Box_new objects
        System.out.println("\nCreating a Box_new with default constructor:");
        Box_new boxNew1 = new Box_new();
        boxNew1.display();
        
        System.out.println("\nCreating a Box_new with one parameter (cube) and weight:");
        Box_new boxNew2 = new Box_new(5.0, 10.0);
        boxNew2.display();
        
        System.out.println("\nCreating a Box_new with three parameters and weight:");
        Box_new boxNew3 = new Box_new(2.0, 3.0, 4.0, 15.0);
        boxNew3.display();
    }
}