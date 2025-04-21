// Base class
class A {
    protected int dataA;
    
    public A(int dataA) {
        this.dataA = dataA;
    }
    
    public void displayA() {
        System.out.println("Class A - Data: " + dataA);
    }
}

// First derived class
class B extends A {
    protected int dataB;
    
    public B(int dataA, int dataB) {
        super(dataA);
        this.dataB = dataB;
    }
    
    public void displayB() {
        displayA();
        System.out.println("Class B - Data: " + dataB);
    }
}

// Second derived class
class C extends A {
    protected int dataC;
    
    public C(int dataA, int dataC) {
        super(dataA);
        this.dataC = dataC;
    }
    
    public void displayC() {
        displayA();
        System.out.println("Class C - Data: " + dataC);
    }
}

// Class derived from B and C (using interfaces to simulate multiple inheritance)
interface D_Interface {
    void displayD();
}

class D extends B implements D_Interface {
    private int dataD;
    private C c;  // Composition to include C's functionality
    
    public D(int dataA, int dataB, int dataC, int dataD) {
        super(dataA, dataB);
        this.c = new C(dataA, dataC);
        this.dataD = dataD;
    }
    
    public void displayC() {
        c.displayC();
    }
    
    @Override
    public void displayD() {
        displayB();
        System.out.println("Class D - Data: " + dataD);
    }
    
    public void displayAll() {
        System.out.println("All data from hierarchy:");
        displayD();
        displayC();
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Creating object of class A:");
        A a = new A(10);
        a.displayA();
        
        System.out.println("\nCreating object of class B:");
        B b = new B(10, 20);
        b.displayB();
        
        System.out.println("\nCreating object of class C:");
        C c = new C(10, 30);
        c.displayC();
        
        System.out.println("\nCreating object of class D:");
        D d = new D(10, 20, 30, 40);
        d.displayAll();
    }
}