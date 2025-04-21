class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    public void move() {
        System.out.println("Animal moves");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    @Override
    public void move() {
        System.out.println("Dog runs on four legs");
    }
    
    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
    
    @Override
    public void move() {
        System.out.println("Cat walks stealthily");
    }
    
    public void climb() {
        System.out.println("Cat climbs trees");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
    
    @Override
    public void move() {
        System.out.println("Bird flies");
    }
    
    public void buildNest() {
        System.out.println("Bird builds nest");
    }
}

public class main {
    public static void main(String[] args) {
        // Creating Animal reference variables
        Animal animal1, animal2, animal3;
        
        // Assigning objects of different child classes
        animal1 = new Dog();
        animal2 = new Cat();
        animal3 = new Bird();
        
        System.out.println("Animal 1:");
        animal1.makeSound();  // Calls Dog's makeSound()
        animal1.move();       // Calls Dog's move()
        // animal1.wagTail(); // Would cause error - Animal reference doesn't know about Dog specific methods
        
        System.out.println("\nAnimal 2:");
        animal2.makeSound();  // Calls Cat's makeSound()
        animal2.move();       // Calls Cat's move()
        
        System.out.println("\nAnimal 3:");
        animal3.makeSound();  // Calls Bird's makeSound()
        animal3.move();       // Calls Bird's move()
        
        // Demonstrating instanceof and casting
        System.out.println("\nDemonstrating instanceof and casting:");
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            dog.wagTail();  // Now we can call Dog specific method
        }
        
        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2;
            cat.climb();    // Now we can call Cat specific method
        }
        
        if (animal3 instanceof Bird) {
            Bird bird = (Bird) animal3;
            bird.buildNest(); // Now we can call Bird specific method
        }
    }
}