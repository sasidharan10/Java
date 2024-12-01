import java.util.*;

public class ch_04_priorityQueue {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();

        // max-heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> temp = new PriorityQueue<>();

        // add elements to the queue
        pq.offer(4);
        pq.offer(5);
        pq.offer(2);
        pq.offer(1);
        pq.offer(3);
        pq.add(6); // throws exception

        // print the queue
        System.out.println(pq);

        // peek at the element at the front of the queue = alternate: element()
        System.out.println(pq.peek());
        System.out.println(pq);

        // remove elements = poll(), use remove() as alternate(for exceptions)
        System.out.println(pq.poll());
        System.out.println(pq);

        // size
        System.out.println(pq.size());

        // check if stack is empty
        System.out.println(pq.isEmpty());

        // addAll() will add full collection of same data type

        temp.offer(1);
        temp.offer(2);

        // Checks equality of 2 Queue
        System.out.println(pq.equals(temp));

        // checks if a element is present in Queue
        System.out.println(pq.contains(1));

        // checks whether all elements in collection temp is present in pq
        System.out.println(pq.containsAll(temp));

        System.out.println("\nWays to Iterate Priority Queue: ");

        System.out.println("\nUsing Iterator: ");
        Iterator<Integer> it = pq.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\nUsing Loop: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + ", ");
        }

        System.out.println("\n\nCustom sorting: ");

        PriorityQueue<int[]> t1 = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]); // ascending
                // return Integer.compare(b[0], a[0]); // decending
                // return Integer.compare(a[1], b[1]); // ascending, but sorts based on 2nd
                // element.
            }
        });

        t1.offer(new int[] { 9, 7 });
        t1.offer(new int[] { 5, 2 });
        t1.offer(new int[] { 3, 3 });
        t1.offer(new int[] { 1, 1 });
        t1.offer(new int[] { 6, 9 });
        t1.offer(new int[] { 4, 4 });
        t1.offer(new int[] { 2, 0 });

        System.out.println("\nList: ");
        while (!t1.isEmpty()) {
            int it1 = t1.peek()[0];
            int it2 = t1.peek()[1];
            t1.poll();
            System.out.println(it1 + " : " + it2);
        }
    }

    // custom PQ, with custom ordering method
    public static class pair implements Comparable<pair> {
        long meetingEndTime;
        int roomNo;

        public pair(long m, int r) {
            meetingEndTime = m;
            roomNo = r;
        }

        public int compareTo(pair other) {
            // Compare elements based on priority
            return this.meetingEndTime == other.meetingEndTime ? Long.compare(this.roomNo, other.roomNo)
                    : Long.compare(this.meetingEndTime, other.meetingEndTime);
        }
    }
}
