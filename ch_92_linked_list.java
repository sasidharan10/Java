import java.util.LinkedList;

public class ch_92_linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.addLast(4); // only in linkedlist
        ll.add(4, 4); // (index,element)
        ll.addLast(4);
        ll.addFirst(10); // only in linkedlist
        ll.remove(1);  // element 1 gets removed
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println("\nll.size() : " + ll.size());
        System.out.println("ll.contains(2) : " + ll.contains(2));
        System.out.println("ll.contains(200) : " + ll.contains(200));
        System.out.println("ll.indexOf(4) : " + ll.indexOf(4)); // lower bound
        System.out.println("ll.lastIndexOf(4) : " + ll.lastIndexOf(4)); // upper bound
        System.out.println("ll.isEmpty() : " + ll.isEmpty());
        ll.clear();
    }
}
