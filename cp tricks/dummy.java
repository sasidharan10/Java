import java.util.*;

public class dummy {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, ArrayList<String>> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String temp = strs[i];
            char[] charArray = temp.toCharArray();
            Arrays.sort(charArray);
            temp = new String(charArray);
            if (!mp.containsKey(temp)) {
                mp.put(temp, new ArrayList<>());
            }
            mp.get(temp).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();

        for (Map.Entry<String, ArrayList<String>> it : mp.entrySet()) {
            ans.add(it.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] nums = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.print("Result: ");
        System.out.print(groupAnagrams(nums));
    }

}
