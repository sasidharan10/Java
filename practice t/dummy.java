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

    public static List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int n = recipes.length;
        HashMap<String, List<String>> adj = new HashMap<>();
        HashMap<String, Integer> inDegree = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String recipe = recipes[i];
            inDegree.put(recipe, ingredients.get(i).size());

            for (int j = 0; j < ingredients.get(i).size(); j++) {
                adj.computeIfAbsent(ingredients.get(i).get(j), x -> new ArrayList<>()).add(recipe);
            }
        }
        Queue<String> que = new LinkedList<>();
        for (int i = 0; i < supplies.length; i++) {
            que.offer(supplies[i]);
        }
        while (!que.isEmpty()) {
            String item = que.poll();

            if (!adj.containsKey(item))
                continue;

            for (String nbr : adj.get(item)) {
                inDegree.put(nbr, inDegree.get(nbr) - 1);
                if (inDegree.get(nbr) == 0) {
                    res.add(nbr);
                    que.offer(nbr);
                }
            }
        }
        return res;
    }

    public static long solveMem(int ind, int n, int[][] questions, long[] dp) {
        if (ind >= n) {
            return 0;
        }
        if (dp[ind] != -1)
            return dp[ind];
        long take = questions[ind][0] + solveMem(ind + questions[ind][1] + 1, n, questions, dp);
        long notTake = solveMem(ind + 1, n, questions, dp);
        return dp[ind] = Math.max(take, notTake);
    }

    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp, -1);
        return solveMem(0, n, questions, dp);
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
