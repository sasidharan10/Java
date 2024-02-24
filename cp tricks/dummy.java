import java.util.*;

public class dummy {
    public static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static class Tuple {
        int first;
        int second;
        int third;

        public Tuple(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int m = flights.length;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int from = flights[i][0];
            int to = flights[i][1];
            int weight = flights[i][2];

            adj.get(from).add(new Pair(to, weight));
        }
        int[] dist = new int[n];
        Arrays.fill(dist, (int) 1e9);
        Queue<Tuple> que = new LinkedList<>();
        que.offer(new Tuple(0, src, 0));
        while (!que.isEmpty()) {
            Tuple tp = que.poll();
            int steps = tp.first;
            int node = tp.second;
            int d1 = tp.third;
            if (steps > k)
                continue;
            for (Pair p : adj.get(node)) {
                int v = p.first;
                int d2 = p.second;
                if (steps <= k && d1 + d2 < dist[v]) {
                    dist[v] = d1 + d2;
                    que.offer(new Tuple(steps + 1, v, d1 + d2));
                }
            }
        }
        if (dist[dst] == (int) 1e9)
            return -1;
        else
            return dist[dst];
    }

    public static void main(String[] args) {
        int[] nums = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };
        int[][] grid = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        // int k = 3;
        int n = 4, src = 0, dst = 3, k = 1;
        int bricks = 10, ladders = 2;
        // String str = "Aabb";
        String str = "cccaaa";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(findCheapestPrice(n, grid, src, dst, k));
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
