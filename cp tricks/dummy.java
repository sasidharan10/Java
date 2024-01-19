import java.util.*;

public class dummy {
    public static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap();
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < n; i++) {
            if (!mp.containsKey(arr[i]))
                mp.put(arr[i], 1);
            else {
                mp.replace(arr[i], mp.get(arr[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (set.contains(it.getValue()))
                return false;
            else
                set.add(it.getValue());
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        System.out.print("Result: ");
        System.out.print(uniqueOccurrences(nums));
    }

}
