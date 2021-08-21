class mythrd1 extends Thread {
    public void run() {


        for (int i = 0; i < 100; i++) {
            System.out.println("First");
        }
    }
}

class mythrd2 extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);  // thread is delayed by 3 sec
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Second");
        }
    }
}

public class ch_75_thread_methods {
    public static void main(String[] args) {
        mythrd1 m1 = new mythrd1();
        mythrd2 m2 = new mythrd2();
        m1.start();
        try {
            m1.join(); // makes the thread to complete first and then go for next thread
        } catch (Exception e) {
            System.out.println(e);
        }
        m2.start();
    }
}
