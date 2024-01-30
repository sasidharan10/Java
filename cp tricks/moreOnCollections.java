import java.util.*;

public class moreOnCollections {

    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(1, 0);
        mp.put(2, 0);
        mp.put(3, 0);

        // to increment value, if exists
        mp.put(1, mp.getOrDefault(1, 0) + 1);

        System.out.println(mp);

    }
}