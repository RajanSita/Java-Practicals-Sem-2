import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();
        
        // Shared object for synchronization
        SharedPrinter printer = new SharedPrinter(maxNumber);
        
        // Creating even and odd number printing threads
        Thread evenThread = new Thread(new EvenNumberPrinter(printer), "EvenThread");
        Thread oddThread = new Thread(new OddNumberPrinter(printer), "OddThread");
        
        // Starting threads
        evenThread.start();
        oddThread.start();
        
        // Wait for both threads to complete
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("Printing completed.");
        scanner.close();
    }
}

class SharedPrinter {
    private final int maxNumber;
    private int currentNumber = 1;
    
    public SharedPrinter(int maxNumber) {
        this.maxNumber = maxNumber;
    }
    
    // Synchronized method to print even numbers
    public synchronized void printEven() {
        while (currentNumber <= maxNumber) {
            if (currentNumber % 2 != 0) {
                try {
                    wait(); // Wait if the current number is odd
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            
            if (currentNumber <= maxNumber) {
                System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                currentNumber++;
                notify(); // Notify the other thread
            }
        }
    }
    
    // Synchronized method to print odd numbers
    public synchronized void printOdd() {
        while (currentNumber <= maxNumber) {
            if (currentNumber % 2 == 0) {
                try {
                    wait(); // Wait if the current number is even
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            
            if (currentNumber <= maxNumber) {
                System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                currentNumber++;
                notify(); // Notify the other thread
            }
        }
    }
}

class EvenNumberPrinter implements Runnable {
    private final SharedPrinter printer;
    
    public EvenNumberPrinter(SharedPrinter printer) {
        this.printer = printer;
    }
    
    @Override
    public void run() {
        printer.printEven();
    }
}

class OddNumberPrinter implements Runnable {
    private final SharedPrinter printer;
    
    public OddNumberPrinter(SharedPrinter printer) {
        this.printer = printer;
    }
    
    @Override
    public void run() {
        printer.printOdd();
    }
}