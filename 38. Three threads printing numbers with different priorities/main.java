class main {
    public static void main(String[] args) {
        // Creating three threads with different priorities
        Thread thread1 = new Thread(new NumberPrinter(1, 5), "Thread-1-5");
        Thread thread2 = new Thread(new NumberPrinter(6, 10), "Thread-6-10");
        Thread thread3 = new Thread(new NumberPrinter(11, 15), "Thread-11-15");
        
        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        
        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All threads completed execution.");
    }
}

class NumberPrinter implements Runnable {
    private int start;
    private int end;
    
    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName() + " started with priority: " + currentThread.getPriority());
        
        for (int i = start; i <= end; i++) {
            System.out.println(currentThread.getName() + ": " + i);
            
            // Small delay to better visualize thread execution
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(currentThread.getName() + " interrupted: " + e.getMessage());
            }
        }
        
        System.out.println(currentThread.getName() + " finished.");
    }
}