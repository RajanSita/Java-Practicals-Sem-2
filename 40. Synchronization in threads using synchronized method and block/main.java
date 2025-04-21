import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of threads to create: ");
        int numThreads = scanner.nextInt();
        
        System.out.print("Enter the number of iterations for each thread: ");
        int numIterations = scanner.nextInt();
        
        // Creating shared counter
        Counter counter = new Counter();
        
        // Creating and starting threads
        Thread[] threads = new Thread[numThreads];
        
        for (int i = 0; i < numThreads; i++) {
            // Every other thread will use synchronized method or synchronized block
            if (i % 2 == 0) {
                threads[i] = new Thread(new SynchronizedMethodRunnable(counter, numIterations), "Thread-Method-" + i);
            } else {
                threads[i] = new Thread(new SynchronizedBlockRunnable(counter, numIterations), "Thread-Block-" + i);
            }
            threads[i].start();
        }
        
        // Wait for all threads to complete
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("\nFinal counter value: " + counter.getCount());
        System.out.println("Expected counter value: " + (numThreads * numIterations));
        
        scanner.close();
    }
}

class Counter {
    private int count = 0;
    
    // Synchronized method approach
    public synchronized void incrementUsingMethod() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented counter to " + count + " using synchronized method");
    }
    
    // Regular method for synchronized block approach
    public void incrementUsingBlock() {
        // Synchronized block using this object as lock
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + count + " using synchronized block");
        }
    }
    
    public int getCount() {
        return count;
    }
}

class SynchronizedMethodRunnable implements Runnable {
    private final Counter counter;
    private final int iterations;
    
    public SynchronizedMethodRunnable(Counter counter, int iterations) {
        this.counter = counter;
        this.iterations = iterations;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < iterations; i++) {
            counter.incrementUsingMethod();
            
            // Small delay to simulate work
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SynchronizedBlockRunnable implements Runnable {
    private final Counter counter;
    private final int iterations;
    
    public SynchronizedBlockRunnable(Counter counter, int iterations) {
        this.counter = counter;
        this.iterations = iterations;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < iterations; i++) {
            counter.incrementUsingBlock();
            
            // Small delay to simulate work
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}