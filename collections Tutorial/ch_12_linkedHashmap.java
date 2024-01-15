import java.util.*;

public class ch_12_linkedHashmap {

    public static void main(String[] args) {
        // TreeMap<Integer, String> mp = new TreeMap<>();
        LinkedHashMap<Integer, String> mp = new LinkedHashMap<>();

        // add elements to the map
        mp.put(3, "three");
        mp.put(1, "one");
        mp.put(5, "five");
        mp.put(2, "two");
        mp.put(4, "four");

        // print the map
        System.out.println("LinkedHashMap: " + mp);

    }
}

/*

- LinkedHashMap class provides all optional Map operations.
- LinkedHashMap class maintains insertion order.
- In a case where there are duplicate keys, Values will be overriden.

*/