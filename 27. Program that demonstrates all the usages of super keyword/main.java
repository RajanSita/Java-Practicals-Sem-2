class Parent {
    int value = 10;
    
    public Parent() {
        System.out.println("Parent's default constructor");
    }
    
    public Parent(int value) {
        this.value = value;
        System.out.println("Parent's parameterized constructor with value: " + value);
    }
    
    public void display() {
        System.out.println("Value in Parent class: " + value);
    }
    
    public void showMessage() {
        System.out.println("Message from Parent class");
    }
}

class Child extends Parent {
    int value = 20;
    
    public Child() {
        super();
        System.out.println("Child's default constructor");
    }
    
    public Child(int value) {
        super(value);
        System.out.println("Child's parameterized constructor with value: " + value);
    }
    
    public void display() {
        System.out.println("Value in Child class: " + value);
        System.out.println("Value in Parent class: " + super.value);
    }
    
    public void showMessage() {
        System.out.println("Message from Child class");
        super.showMessage();
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Creating Child object with default constructor:");
        Child child1 = new Child();
        System.out.println();
        
        System.out.println("Creating Child object with parameterized constructor:");
        Child child2 = new Child(30);
        System.out.println();
        
        System.out.println("Demonstrating super with variables:");
        child2.display();
        System.out.println();
        
        System.out.println("Demonstrating super with methods:");
        child2.showMessage();
    }
}