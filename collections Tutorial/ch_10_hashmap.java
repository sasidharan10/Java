import java.util.*;

public class ch_10_hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();

        // add elements to the map
        mp.put(3, "three");
        mp.put(1, "one");
        mp.put(5, "five");
        mp.put(2, "two");
        mp.put(4, "four");

        // print the map
        System.out.println("HashMap: " + mp);

        // get() method to get value
        String value = mp.get(1);
        System.out.println("Value at index 1: " + value);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + mp.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + mp.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + mp.entrySet());

        // change element with key 2
        mp.replace(2, "C++");
        System.out.println("HashMap using replace(): " + mp.values());

        // remove element associated with key 2
        String value2 = mp.remove(2);
        System.out.println("Removed value: " + value2);

        // size
        System.out.println("size(): " + mp.size());

        // check if Map is empty
        System.out.println("isEmpty(): " + mp.isEmpty());

        // checks if the "key" is present in Set
        System.out.println("containsKey(): " + mp.containsKey(1));

        // checks if the "value" is present in Set
        System.out.println("containsValue(): " + mp.containsValue("two"));

        System.out.println("\nWays to Iterate Map: ");

        // Print keys
        System.out.println("\nPrint keys: ");
        for (int it : mp.keySet()) {
            System.out.print(it + ", ");
        }
        System.out.println();

        // Print values
        System.out.println("\nPrint values: ");
        for (String str : mp.values()) {
            System.out.print(str + ", ");
        }
        System.out.println();

        // Print key/value entries
        System.out.println("\nPrint key/value entries: ");
        for (Map.Entry<Integer, String> it : mp.entrySet()) {
            System.out.println("Key: " + it.getKey() + ", Val: " + it.getValue());
        }
        System.out.println();

        // clear
        mp.clear();
    }
}

/*

- The underlying data structure for HashMap is Hashtable.
- Items are stored in key/value pairs.
- Items do not maintain any order when added. The data is unordered.
- Element insertion, deletion, search takes O(1) TC.
- In a case where there are duplicate keys, Values will be overriden.
- Data types are specified using wrapper classes instead of primitive data types.
- Its literally same as unordered_map<> in c++.

*/
