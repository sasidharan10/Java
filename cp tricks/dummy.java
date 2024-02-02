import java.util.*;

public class dummy {

    public static List<Integer> sequentialDigits(int low, int high) {

        int[] mp = { 12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456,
                567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567,
                45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789,
                12345678, 23456789, 123456789 };

        int n = mp.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mp[i] < low)
                continue;

            if (mp[i] > high)
                break;

            ans.add(mp[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };
        int k = 2;
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // int[][] ans = divideArray(nums, k);
        List<Integer> ans = sequentialDigits(low, high);
        System.out.print(ans);
        // for (int[] is : ans) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println();
        // }
    }

}
