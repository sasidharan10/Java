import java.util.*;

public class dummy {
    public static boolean isUnique(String s, String t)
    {
        int n = s.length();
        int m = t.length();
        int[] mp = new int[26];

        for (int i = 0; i < n; i++)
        {
            int idx = s.charAt(i) - 'a';
            if (mp[idx] == 0)
                mp[idx]++;
            else
                return false;
        }
        for (int i = 0; i < m; i++)
        {
            int idx = t.charAt(i) - 'a';
            if (mp[idx] == 0)
                mp[idx]++;
            else
                return false;
        }
        return true;
    }
    public static int solve(int ind, int n, String res, List<String> arr)
    {
        if (ind == n)
            return res.length();
        int notTake = Integer.MIN_VALUE, take = Integer.MIN_VALUE;
        if (!isUnique(res, arr.get(ind)))
        {
            notTake = solve(ind + 1, n, res, arr);
        }
        else
        {
            notTake = solve(ind + 1, n, res, arr);
            take = solve(ind + 1, n, res + arr.get(ind), arr);
        }
        return Math.max(take, notTake);
    }

    public static int maxLength(List<String> arr) {
        int n = arr.size();
        return solve(0, n, "", arr);
    }

    public static void main(String[] args) {
        String[] nums = { "cha", "r", "act", "ers" };
        List<String> arr = new ArrayList<>(Arrays.asList(nums));
        System.out.print("Result: ");
        System.out.print(maxLength(arr));
    }

}
