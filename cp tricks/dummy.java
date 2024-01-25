import java.util.*;

public class dummy {
    public static int solve(int ind, int val, int n, List<Integer> nums) {
        if (ind == n) {
            return Integer.bitCount(val);
        }
        int notTake = Integer.MIN_VALUE, take = Integer.MIN_VALUE;
        if ((val & nums.get(ind)) != 0) {
            notTake = solve(ind + 1, val, n, nums);
        } else {
            notTake = solve(ind + 1, val, n, nums);
            take = solve(ind + 1, val | nums.get(ind), n, nums);
        }
        return Math.max(take, notTake);
    }

    public static int maxLength(List<String> arr) {
        int n = arr.size();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Character> st = new HashSet<>();
            for (char ch : arr.get(i).toCharArray()) {
                st.add(ch);
            }
            if (st.size() != arr.get(i).length())
                continue;
            int val = 0;
            for (char ch : arr.get(i).toCharArray()) {
                val = val | (1 << (ch - 'a'));
            }
            nums.add(val);
        }
        int m = nums.size();
        return solve(0, 0, m, nums);
    }

    public static void main(String[] args) {
        String[] nums = { "cha", "r", "act", "ers" };
        List<String> arr = new ArrayList<>(Arrays.asList(nums));
        System.out.print("Result: ");
        System.out.print(maxLength(arr));
    }

}
