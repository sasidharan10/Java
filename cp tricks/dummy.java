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

        Collections.sort(mp, cmp);
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

    public static boolean canPlaceBalls(int m, int diff, int n, int[] position)
    {
        int cowCount = 1;
        int lastPlaced = position[0];
        for (int i = 1; i < n; i++)
        {
            if (position[i] - lastPlaced >= diff)
            {
                lastPlaced = position[i];
                cowCount++;
            }
            if (cowCount >= m)
                return true;
        }
        return false;
    }

    public int maxDistance(int[] position, int m)
    {

        int n = position.length;
        Arrays.sort(position);
        int low = 1, high = position[n - 1] - position[0];
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (canPlaceBalls(m, mid, n, position))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] nums2 = { 1, 1, 2 };
        int[][] grid = { { 0, 6, 0 }, { 5, 8, 7 }, { 0, 9, 0 } };
        String[] words = { "bella", "label", "roller" };
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
        // System.out.println(findMaximizedCapital(k, n, nums, nums2));
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
