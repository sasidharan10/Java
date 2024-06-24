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

        // convert a List<Integer> to int[] array
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
        
        // Sort a 2D array, based on first element
        int[][] grid = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        Arrays.sort(grid, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] it : grid) {
            System.out.println(Arrays.toString(it));
        }
    }
}