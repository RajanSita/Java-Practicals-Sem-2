class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Count after increment: " + count);
    }

    public void decrement() {
        synchronized (this) {
            count--;
            System.out.println("Count after decrement: " + count);
        }
    }
}

class IncrementThread extends Thread {
    Counter counter;

    IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
    }
}

class DecrementThread extends Thread {
    Counter counter;

    DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.decrement();
        }
    }
}

public class main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        IncrementThread t1 = new IncrementThread(counter);
        DecrementThread t2 = new DecrementThread(counter);

        t1.start();
        t2.start();
    }
}
