class NumberThread extends Thread {
    int start, end;

    NumberThread(String name, int priority, int start, int end) {
        super(name);
        setPriority(priority);
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Thread: " + getName() + " | Priority: " + getPriority());
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

public class main {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread("Thread-1", Thread.MIN_PRIORITY, 1, 5);
        NumberThread t2 = new NumberThread("Thread-2", Thread.NORM_PRIORITY, 6, 10);
        NumberThread t3 = new NumberThread("Thread-3", Thread.MAX_PRIORITY, 11, 15);

        t1.start();
        t2.start();
        t3.start();
    }
}
