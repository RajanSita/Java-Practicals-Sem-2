class MyThread1 extends Thread {
    public void run() {
        try {
            System.out.println("Thread 1 started");
            Thread.sleep(2000);
            System.out.println("Thread 1 finished");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        try {
            System.out.println("Thread 2 started");
            Thread.sleep(3000);
            System.out.println("Thread 2 finished");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class MyThread3 extends Thread {
    public void run() {
        try {
            System.out.println("Thread 3 started");
            Thread.sleep(1000);
            System.out.println("Thread 3 finished");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class main {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("All threads have finished execution");
    }
}
