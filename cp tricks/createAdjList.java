import java.util.*;

public class createAdjList {

    public static int dijkstraAlgo(int n, int[][] edges, int src, int dest) {
        int m = edges.length;
        HashMap<Integer, List<int[]>> adj = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[] { v, wt });
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[] { u, wt });
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int[] dist = new int[n];
        Arrays.fill(dist, 2000000000);
        dist[src] = 0;
        pq.offer(new int[] { 0, src });
        while (!pq.isEmpty()) {
            int dst = pq.peek()[0];
            int u = pq.peek()[1];
            pq.poll();
            if (adj.get(u) == null)
                continue;
            for (int[] it : adj.get(u)) {
                int v = it[0];
                int d = it[1];
                if (dst + d < dist[v]) {
                    dist[v] = dst + d;
                    pq.offer(new int[] { dst + d, v });
                }
            }
        }
        return dist[dest];
    }

    public static void main(String[] args) {

    }
}
