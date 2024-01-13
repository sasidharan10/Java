import java.util.*;

public class ch_05_arrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> temp = new ArrayDeque<>();

        // add first
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.addFirst(4);
        dq.add(3); // also last

        // add last
        dq.offerLast(7);
        dq.offerLast(9);
        dq.addLast(5);

        System.out.println(dq);

        // remove first
        dq.pollFirst();
        dq.removeFirst();
        // dq.poll(); // poll() will also remove from first
        System.out.println(dq);

        // remove Last
        dq.pollLast();
        dq.removeLast();
        System.out.println(dq);

        // Peak
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        // size
        System.out.println(dq.size());

        // check if stack is empty
        System.out.println(dq.isEmpty());

        // addAll() will add full collection of same data type

        temp.offerFirst(1);
        temp.offerLast(2);

        // Checks equality of 2 Queue
        System.out.println(dq.equals(temp));

        // checks if a element is present in Queue
        System.out.println(dq.contains(1));

        // checks whether all elements in collection temp is present in dq
        System.out.println(dq.containsAll(temp));

        System.out.println("\nWays to Iterate ArrayDeque: ");

        System.out.println("\nUsing Iterator: ");
        Iterator<Integer> it = dq.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\nUsing Loop: ");
        while (!dq.isEmpty()) {
            System.out.print(dq.pollFirst() + ", ");
        }

    }
}
