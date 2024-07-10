import java.util.*;

public class dummy {
    public static class Pair {
        int first;
        int second;

        Pair() {
        }

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static long maximumImportance(int n, int[][] roads) {
        int m = roads.length;
        int[] outDegree = new int[n];
        for (int i = 0; i < m; i++) {
            outDegree[roads[i][0]]++;
            outDegree[roads[i][1]]++;
        }

        // Convert the int array to Integer array
        Integer[] integerArray = Arrays.stream(outDegree).boxed().toArray(Integer[]::new);

        // Sort the array in descending order
        Arrays.sort(integerArray, Collections.reverseOrder());

        // Convert the Integer array back to int array
        outDegree = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();

        long res = 0;
        long val = n;
        for (int i = 0; i < n; i++) {
            res += outDegree[i] * val;
            val--;
        }
        return res;
    }

    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> mp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mp.add(new int[] { capital[i], profits[i] });
        }

        Comparator cmp = new Comparator<int[]>() {

            public int compare(int[] arr1, int[] arr2) {
                return Integer.compare(arr1[0], arr2[0]);
                // return Integer.compare(arr2[0], arr1[0]); // for reverse order
            }
        };

        // Collections.sort(mp, cmp);
        for (int[] is : mp) {
            for (int is2 : is) {
                System.out.print(is2 + ", ");
            }
            System.out.println();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int idx = 0;

        while (k > 0) {
            while (idx < n && mp.get(idx)[0] <= w) {
                int pft = mp.get(idx)[1];
                pq.add(pft);
                idx++;
            }
            if (pq.isEmpty())
                break;
            w += pq.poll();
            k--;
        }
        return w;
    }

    public static int minOperations(String[] logs) {
        int n = logs.length;
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (logs[i].equals("./"))
                continue;
            else if (logs[i].equals("../")) {
                if (depth > 0)
                    depth--;
            } else {
                depth++;
            }
        }
        return depth;
    }

    public static int func() {
        int m = 89945, k = 32127, sz = 10000;
        int t = m *k;
        System.out.println(t);
        long temp = (long)m * k;

        if (sz < temp)
        return -1;
        // if (sz < ((long) m * k))
        //     return -1;
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] nums2 = { 1, 1, 2 };
        int[][] grid = { { 0, 6, 0 }, { 5, 8, 7 }, { 0, 9, 0 } };
        String[] words = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
        // char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        char[][] board = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' } };
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'D', 'D', 'E', };
        // int k = 3;
        int n = 3, src = 0, dst = 3, k = 1, w = 3;
        int power = 200;
        String str = "1432219";
        String version1 = "1.1.1.2", version2 = "1.1.2";
        String t = "baba";
        String word = "abcdefd";
        char ch = 'd';
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(func());
        // int[][] ans = findFarmland(grid);
        // int[] ans = deckRevealedIncreasing(nums);
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
