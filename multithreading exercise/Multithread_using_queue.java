import java.util.LinkedList;
import java.util.Queue;

public class Multithread_using_queue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        int n = 3;

        SharedResource sharedResource = new SharedResource(que, n);
        ProducerQueue producer = new ProducerQueue(sharedResource);
        ConsumerQueue consumer = new ConsumerQueue(sharedResource);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
