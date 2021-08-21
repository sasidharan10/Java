class thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("First");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second");
        }
    }
}

public class ch_70_multithreading {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
