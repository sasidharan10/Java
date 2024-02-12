import java.util.*;

public class dummy {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) {
                cnt1++;
            } else if (cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (nums[i] == el2) {
                cnt2++;
            } else if (cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (el1 == nums[i])
                cnt1++;
            if (el2 == nums[i])
                cnt2++;
        }
        if (cnt1 > (n / 3))
            ans.add(el1);
        if (cnt2 > (n / 3))
            ans.add(el2);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int[][] grid = { { 3, 1, 1 },
                { 2, 5, 1 },
                { 1, 5, 5 },
                { 2, 1, 1 } };
        int k = 4;
        int n = 13;
        // String str = "Aabb";
        String str = "cccaaa";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(majorityElement(nums));
        // int[][] ans = maxSumAfterPartitioning(nums, k);
        // List<Integer> ans = sequentialDigits(low, high);
        // System.out.print(ans);
        // for (int[] is : ans) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println();
        // }
    }

}
