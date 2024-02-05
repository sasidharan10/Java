import java.util.*;

public class dummy {
    public static String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (m > n)
            return "";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < m; i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
        }
        int i = 0, j = 0;
        int start = 0;
        int requiredCnt = m;
        int mini = Integer.MAX_VALUE;
        while (j < n) {
            char ch1 = s.charAt(j);
            if (mp.containsKey(ch1) && mp.get(ch1) > 0)
                requiredCnt--;
            mp.put(ch1, mp.getOrDefault(ch1, 0) - 1);

            while (requiredCnt == 0) {
                int currentWindow = j - i + 1;
                if (currentWindow < mini) {
                    mini = currentWindow;
                    start = i;
                }
                char ch2 = s.charAt(i);
                mp.put(ch2, mp.getOrDefault(ch2, 0) + 1);
                if (mp.containsKey(ch2) && mp.get(ch2) > 0) {
                    requiredCnt++;
                }
                i++;
            }
            j++;
        }
        return (mini == Integer.MAX_VALUE) ? "sas" : s.substring(start, start + mini);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3 };
        int k = 4;
        String str = "ADOBECODEBANC", t = "ABC";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        String ans = minWindow(str, t);
        // System.out.println(minWindow(str, t));
        // int[][] ans = maxSumAfterPartitioning(nums, k);
        // List<Integer> ans = sequentialDigits(low, high);
        System.out.print(ans);
        // for (int[] is : ans) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println();
        // }
    }

}
