import java.util.*;

public class dummy {

    public static String customSortString(String order, String s) {
        Integer[] index = new Integer[26];
        Arrays.fill(index, -1);

        // Map characters to their positions in 'order'
        for (int i = 0; i < order.length(); i++)
            index[order.charAt(i) - 'a'] = i;

        Comparator<Character> lambda = (ch1, ch2) -> index[ch1 - 'a'].compareTo(index[ch2 - 'a']);

        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        Arrays.sort(charArray, lambda);

        // Convert Character array back to String
        StringBuilder result = new StringBuilder(charArray.length);
        for (char ch : charArray) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        // int[] nums2 = { 9, 4, 9, 8, 4 };
        int[][] grid = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        // int k = 3;
        int n = 4, src = 0, dst = 3, k = 1;
        int power = 200;
        String str = "abcd";
        String order = "bcafg";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(customSortString(order, str));
        // int[][] ans = maxSumAfterPartitioning(nums, k);
        // int[] ans = productExceptSelf(nums);
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
