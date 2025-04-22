class Vehicle {
    String brand = "Generic Vehicle";
    void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}class LightMotor extends Vehicle {
    int wheels = 2;
    void showWheels() {
        System.out.println("Light Motor Wheels: " + wheels);
    }
}

class GearMotor extends LightMotor {
    int gears = 5;
    void showGears() {
        System.out.println("Gear Motor Gears: " + gears);
    }
}
class HeavyMotor extends Vehicle {
    int capacity = 10;
    void showCapacity() {
        System.out.println("Heavy Motor Capacity: " + capacity + " tons");
    }
}

class Passenger extends HeavyMotor {
    int seats = 40;
    void showSeats() {
        System.out.println("Passenger Seats: " + seats);
    }
}

class Goods extends HeavyMotor {
    int load = 1000;
    void showLoad() {
        System.out.println("Goods Load: " + load + " kg");
    }
}
interface InternalExam {
    int internalMarks = 40;
    void showInternalMarks();
}

interface ExternalExam {
    int externalMarks = 60;
    void showExternalMarks();
}
class Student {
    String name = "Rajan";
    void showName() {
        System.out.println("Student Name: " + name);
    }
}
class Result extends Student implements InternalExam, ExternalExam {
    public void showInternalMarks() {
        System.out.println("Internal Marks: " + internalMarks);
    }

    public void showExternalMarks() {
        System.out.println("External Marks: " + externalMarks);
    }

    void totalMarks() {
        System.out.println("Total Marks: " + (internalMarks + externalMarks));
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("--- Multilevel Inheritance ---");
        GearMotor gm = new GearMotor();
        gm.displayBrand();
        gm.showWheels();
        gm.showGears();

        System.out.println("\n--- Hierarchical Inheritance ---");
        Passenger p = new Passenger();
        p.displayBrand();
        p.showCapacity();
        p.showSeats();

        Goods g = new Goods();
        g.displayBrand();
        g.showCapacity();
        g.showLoad();

        System.out.println("\n--- Hybrid Inheritance ---");
        Result r = new Result();
        r.showName();
        r.showInternalMarks();
        r.showExternalMarks();
        r.totalMarks();
    }
}
