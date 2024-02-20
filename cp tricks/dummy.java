import java.util.*;

public class dummy {

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ind = 0;
        for (; ind < n - 1; ind++) {
            if (heights[ind + 1] <= heights[ind])
                continue;

            int diff = heights[ind + 1] - heights[ind];
            if (bricks >= diff) {
                bricks -= diff;
                pq.offer(diff);
            } else if (ladders > 0) {
                if (!pq.isEmpty()) {
                    int max_past_brick = pq.peek();
                    if (max_past_brick > diff) {
                        bricks += max_past_brick;
                        pq.poll();
                        bricks -= diff;
                        pq.offer(diff);
                        ladders--;
                    } else
                        ladders--;
                } else
                    ladders--;
            } else
                break;
        }
        return ind;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };
        int[][] grid = { { 3, 1, 1 },
                { 2, 5, 1 },
                { 1, 5, 5 },
                { 2, 1, 1 } };
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        int k = 3;
        int n = 13;
        int bricks = 10, ladders = 2;
        // String str = "Aabb";
        String str = "cccaaa";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(furthestBuilding(nums, bricks, ladders));
        // int[][] ans = maxSumAfterPartitioning(nums, k);
        // int[] ans = rearrangeArray(nums);
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
