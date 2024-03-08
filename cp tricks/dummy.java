import java.util.*;

public class dummy {

    public static int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int cnt = 0;
        int maxi = 0;
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            int key = it.getKey();
            int freq = it.getValue();
            if (freq > maxi) {
                maxi = freq;
                cnt = 1;
            } else if (freq == maxi)
                cnt++;
        }
        return cnt * maxi;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };
        int[][] grid = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        // int k = 3;
        int n = 4, src = 0, dst = 3, k = 1;
        int power = 200;
        String str = "aabccabba";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(maxFrequencyElements(nums));
        // int[][] ans = maxSumAfterPartitioning(nums, k);
        // int[] ans = sortedSquares(nums);
        // List<Integer> ans = sequentialDigits(low, high);
        // System.out.print(Arrays.toString(ans));
        // for (int[] is : ans) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println();
        // }
    }

}
