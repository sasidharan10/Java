import java.util.*;

public class dummy {
    public static int minSteps(String s, String t) {
        int[] mp = new int[26];
        // initializes 0 by default
        int n = s.length();
        for (int i = 0; i < n; i++) {
            mp[s.charAt(i) - 'a']++;
            mp[t.charAt(i) - 'a']--;
        }
        int cnt = 0;
        for (int it : mp) {
            if (it < 0) {
                cnt += -(it);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str = "leetcode", t = "practice";
        System.out.print("Minimum Number of Steps to Make Two Strings Anagram: ");
        System.out.print(minSteps(str, t));
    }

}
