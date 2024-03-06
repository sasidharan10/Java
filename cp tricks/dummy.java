import java.util.*;

public class dummy {

    public static int minimumLength(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            char ch = s.charAt(i);
            while (i < j && ch == s.charAt(i)) {
                i++;
            }
            while (i <= j && ch == s.charAt(j)) {
                j--;
            }
        }
        return (j - i + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 100, 200, 300, 400 };
        int[][] grid = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        // int k = 3;
        int n = 4, src = 0, dst = 3, k = 1;
        int power = 200;
        String str = "aabccabba";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(minimumLength(str));
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
