import java.util.*;

public class ch_03_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();

        // add elements to the queue
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.add(6); // throws exception

        // print the queue
        System.out.println(q);

        // peek at the element at the front of the queue = alternate: element()
        System.out.println(q.peek());
        System.out.println(q);

        // remove elements = poll(), use remove() as alternate(for exceptions)
        System.out.println(q.poll());
        System.out.println(q);

        // size
        System.out.println(q.size());

        // check if stack is empty
        System.out.println(q.isEmpty());

        // addAll() will add full collection of same data type

        temp.offer(3);
        temp.offer(4);

        // Checks equality of 2 Queue
        System.out.println(q.equals(temp));

        // checks if a element is present in Queue
        System.out.println(q.contains(3));

        // checks whether all elements in collection bl is present in al
        System.out.println(q.containsAll(temp));

        System.out.println("\nWays to Iterate Queue: ");

        System.out.println("\nUsing Iterator: ");
        Iterator<Integer> it = q.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\nUsing Loop: ");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + ", ");
        }

    }
}
