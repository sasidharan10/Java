import java.util.*;

public class ch_06_hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();

        // add elements to the set
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // print the Set
        System.out.println(hs);

        // remove(element), we have to specify the element, not the index
        System.out.println(hs.remove(4));
        System.out.println(hs);

        // size
        System.out.println(hs.size());

        // check if stack is empty
        System.out.println(hs.isEmpty());

        temp.add(1);
        temp.add(2);

        // Checks equality of 2 Set
        System.out.println(hs.equals(temp));

        // checks if a element is present in Set
        System.out.println(hs.contains(1));

        // checks whether all elements in collection bl is present in al
        System.out.println(hs.containsAll(temp));

        System.out.println("\nWays to Iterate Priority Set: ");

        System.out.println("\nUsing Iterator: ");
        Iterator<Integer> it = hs.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\nUsing ForEach: ");
        for (Integer tt : hs) {
            System.out.print(tt + ", ");
        }
    }
}

/*
 * 
 * - The underlying data structure for HashSet is Hashtable.
 * - As it implements the Set Interface, duplicate values are not allowed.
 * - Objects that you insert in HashSet are not guaranteed to be inserted in the
 *   same order.
 * - Objects are inserted based on their hash code.
 * - NULL elements are allowed in HashSet.
 * - Element insertion, deletion, search takes O(1) TC.
 * - Its literally same as Unordered_Set<> in c++.
 * 
 */