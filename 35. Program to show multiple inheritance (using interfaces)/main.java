interface FirstInterface {
    void firstMethod();
    default void defaultMethod() {
        System.out.println("Default implementation in FirstInterface");
    }
}

interface SecondInterface {
    void secondMethod();
    default void defaultMethod() {
        System.out.println("Default implementation in SecondInterface");
    }
}

class MultipleInheritance implements FirstInterface, SecondInterface {
    private String name;
    
    public MultipleInheritance(String name) {
        this.name = name;
    }
    
    @Override
    public void firstMethod() {
        System.out.println(name + " is implementing firstMethod() from FirstInterface");
    }
    
    @Override
    public void secondMethod() {
        System.out.println(name + " is implementing secondMethod() from SecondInterface");
    }
    
    // Must override defaultMethod since it's in both interfaces
    @Override
    public void defaultMethod() {
        System.out.println(name + " is overriding defaultMethod() from both interfaces");
        // Can call specific interface's implementation
        FirstInterface.super.defaultMethod();
        SecondInterface.super.defaultMethod();
    }
}

public class main {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance("TestObject");
        
        // Call methods from FirstInterface
        obj.firstMethod();
        
        // Call methods from SecondInterface
        obj.secondMethod();
        
        // Call the overridden default method
        obj.defaultMethod();
        
        System.out.println("\nUsing interface references:");
        
        // Using FirstInterface reference
        FirstInterface first = obj;
        first.firstMethod();
        first.defaultMethod();
        
        // Using SecondInterface reference
        SecondInterface second = obj;
        second.secondMethod();
        second.defaultMethod();
    }
}