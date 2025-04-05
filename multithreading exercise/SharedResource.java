import java.util.*;

public class SharedResource {
    private Queue<Integer> que;
    private int n;

    public SharedResource(Queue<Integer> que, int n)
    {
        this.que = que;
        this.n = n;
    }

    synchronized public void produce(int i)
    {
        try {
            while (que.size() == n) {
                System.out.println("Queue size is full!!!");
                wait();
                System.out.println("Producer Wait is over...");
            }
            que.offer(i);
            System.out.println("Item Added: "+ i);
            notifyAll();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    synchronized public void consume() {
        try {
            while (que.isEmpty()) {
                System.out.println("Queue is Empty!!!");
                wait();
                System.out.println("Consumer Wait is over...");
            }
            int it = que.poll();
            System.out.println("Item Consumed: " + it);
            notify();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
