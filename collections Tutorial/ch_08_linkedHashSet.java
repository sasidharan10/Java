import java.util.*;

public class ch_08_linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ts = new LinkedHashSet<>();
        LinkedHashSet<Integer> temp = new LinkedHashSet<>();

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

        System.out.println("\nWays to Iterate LinkedHashSet Set: ");

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

- Java LinkedHashSet class contains unique elements only like HashSet.
- Java LinkedHashSet class provides all optional set operations and permits
  null elements.
- Java LinkedHashSet class maintains insertion order.

*/
