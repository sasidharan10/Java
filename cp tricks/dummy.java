import java.util.*;

public class dummy {

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int cnt = 0;
        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += nums[i];
            if (mp.containsKey(cumSum - k)) {
                cnt += mp.get(cumSum - k);
            }
            if (mp.containsKey(cumSum))
                mp.replace(cumSum, mp.get(cumSum) + 1);
            else
                mp.put(cumSum, 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;
        System.out.print("Result: ");
        System.out.print(subarraySum(nums, k));
    }

}
