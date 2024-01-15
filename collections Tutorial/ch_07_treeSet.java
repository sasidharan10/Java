import java.util.*;

public class ch_07_treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        TreeSet<Integer> temp = new TreeSet<>();

        // add elements to the set
        ts.add(4);
        ts.add(2);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(1);

        // print the Set
        System.out.println("Set: " + ts);

        // remove(element), we have to specify the element, not the index
        System.out.println(ts.remove(4));
        System.out.println("Set after remove(): " + ts);

        // size
        System.out.println("size(): " + ts.size());

        // check if stack is empty
        System.out.println("isEmpty(): " + ts.isEmpty());

        temp.add(1);
        temp.add(2);

        // Checks equality of 2 Set
        System.out.println("equals(): " + ts.equals(temp));

        // checks if a element is present in Set
        System.out.println("contains(): " + ts.contains(1));

        // checks whether all elements in collection temp is present in ts
        System.out.println("containsAll(): " + ts.containsAll(temp));

        System.out.println("\nWays to Iterate Tree Set: ");

        System.out.println("\nUsing Iterator: ");
        Iterator<Integer> it = ts.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\nUsing ForEach: ");
        for (Integer tt : ts) {
            System.out.print(tt + ", ");
        }
    }
}

/*
 
- Java TreeSet class maintains ascending order.
- Java TreeSet class contains unique elements only like HashSet.
- Java TreeSet class doesn't allow null elements.
- search, remove, and add consume O(log(N)) time.
- TreeSet is being implemented using a binary search tree, which is
  self-balancing just like a Red-Black Tree.
 
 */