class thread11 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("First");
        }
    }
}

class thread21 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second");
        }
    }
}

public class ch_71_thread_interface {
    public static void main(String[] args) {
        thread11 f1 = new thread11();
        Thread t1 = new Thread(f1);
        t1.start();
        thread21 f2 = new thread21();
        Thread t2 = new Thread(f2);
        t2.start();
    }
}
