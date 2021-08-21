
class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread running...");
    }
}

public class ch_73_thread_contructor {

    public static void main(String[] args) {
        MyThr t = new MyThr("kane");
        t.start();
        System.out.println("The id of the thread t is " + t.getId());
        System.out.println("The name of the thread t is " + t.getName());
    }
}