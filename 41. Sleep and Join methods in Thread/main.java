import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of iterations for each thread: ");
        int iterations = scanner.nextInt();
        
        // Creating three threads
        Thread thread1 = new Thread(new TaskWithSleep(iterations, 100), "Thread-1");
        Thread thread2 = new Thread(new TaskWithSleep(iterations, 200), "Thread-2");
        Thread thread3 = new Thread(new TaskWithSleep(iterations, 300), "Thread-3");
        
        System.out.println("Starting all threads...");
        
        // Start time measurement
        long startTime = System.currentTimeMillis();
        
        // Starting threads
        thread1.start();
        
        // Wait for thread1 to complete before starting thread2
        try {
            System.out.println("Main thread waiting for " + thread1.getName() + " to complete...");
            thread1.join();
            System.out.println(thread1.getName() + " has completed. Starting " + thread2.getName());
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for " + thread1.getName());
        }
        
        thread2.start();
        
        // Start thread3 immediately but join later
        thread3.start();
        
        // Wait for both thread2 and thread3 to complete
        try {
            System.out.println("Main thread waiting for " + thread2.getName() + " to complete...");
            thread2.join();
            System.out.println(thread2.getName() + " has completed.");
            
            System.out.println("Main thread waiting for " + thread3.getName() + " to complete...");
            thread3.join();
            System.out.println(thread3.getName() + " has completed.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        // End time measurement
        long endTime = System.currentTimeMillis();
        
        System.out.println("All threads have completed execution.");
        System.out.println("Total execution time: " + (endTime - startTime) + " ms");
        
        scanner.close();
    }
}

class TaskWithSleep implements Runnable {
    private final int iterations;
    private final long sleepTime;
    
    public TaskWithSleep(int iterations, long sleepTime) {
        this.iterations = iterations;
        this.sleepTime = sleepTime;
    }
    
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + " started with sleep time: " + sleepTime + " ms");
        
        for (int i = 1; i <= iterations; i++) {
            System.out.println(currentThread.getName() + " - Iteration " + i + " of " + iterations);
            
            try {
                // Sleep for the specified time
                System.out.println(currentThread.getName() + " sleeping for " + sleepTime + " ms");
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(currentThread.getName() + " interrupted: " + e.getMessage());
                return;
            }
        }
        
        System.out.println(currentThread.getName() + " finished all iterations.");
    }
}