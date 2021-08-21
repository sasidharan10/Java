class mythread1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("First");
        }
    }
}

class mythread2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second");
        }
    }
}

public class ch_74_thread_priority {
    public static void main(String[] args) {
        mythread1 m1 = new mythread1();
        mythread2 m2 = new mythread2();
        m1.setPriority(Thread.MAX_PRIORITY); // value =10
        // m1.setPriority(10); // OR set it as 10
        m2.setPriority(Thread.MIN_PRIORITY); // value =1
        // m2.setPriority(1); // OR set it as 10

        // m2.setPriority(5); // use '5' for normal priority

        m1.start();
        m2.start();
        System.out.println(m1.getPriority());  // 10
        System.out.println(m2.getPriority());  // 1

    }
}
/*



*/