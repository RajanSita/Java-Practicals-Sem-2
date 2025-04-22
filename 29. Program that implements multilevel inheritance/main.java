class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Mammal extends Animal {
    protected String furColor;
    
    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }
    
    public void walk() {
        System.out.println(name + " is walking");
    }
    
    public void displayFurColor() {
        System.out.println(name + " has " + furColor + " fur");
    }
}

class Dog extends Mammal {
    private String breed;
    
    public Dog(String name, String furColor, String breed) {
        super(name, furColor);
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println(name + " is barking");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Fur Color: " + furColor);
        System.out.println("Breed: " + breed);
    }
}

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        dog.eat();
        dog.sleep();
        dog.walk();
        dog.displayFurColor();
        dog.bark();
        dog.displayInfo();
    }
}