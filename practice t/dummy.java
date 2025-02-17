import java.util.*;

public class dummy {
    public static class Pair {
        private int first;
        private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxi = nums[0];
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                sum += nums[i];
            } else
                sum = nums[i];
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }

    public String clearDigits(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - '0';
            if (ch >= 0 && ch <= 9) {
                if (!st.empty())
                    st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.append(st.peek());
            st.pop();
        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 3, 2 };
        int[] nums2 = { 10, 10, 15, 12 };
        int[][] grid = { { 0, 1, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } };
        String[] words = { "d", "b", "c", "b", "c", "a" };
        // char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        char[][] board = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' } };
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E', };
        // int k = 3;
        int n = 3, src = 0, dst = 3, k = 2, w = 3;
        int x = 4, y = 5;
        int power = 200;
        String str = "K4(ON(SO3)2)2";
        String version1 = "1.1.1.2", version2 = "1.1.2";
        String t = "baba";
        String word = "abcdefd";
        char ch = 'd';
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        // System.out.println(minDays(grid));
        // int[][] ans = findFarmland(grid);
        // int[] ans = frequencySort(nums);
        // String[] ans = getMaximumGold(grid);
        // List<Integer> ans = sequentialDigits(low, high);
        // List<String> ans = commonChars(words);
        // System.out.print(ans);
        // System.out.print(Arrays.toString(ans));
        // for (int[] is : ans) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println();
        // }
    }

}
