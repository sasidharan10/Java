import java.util.*;

public class ch_06_dfs_traversal {

    public static void dfs(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> ls)
    {
        vis[node] = true;
        ls.add(node);

        for (Integer nbr : adj.get(node)) {
            if(vis[nbr] == false)
            {
                dfs(nbr, vis, adj, ls);
            }
        }
    }

    public static List<Integer> dfsOfGraph(int V, List<List<Integer>> adj)
    {
        List<Integer> ls = new ArrayList<>();
        boolean[] vis = new boolean[V + 1];
        vis[0] = true;
        dfs(0, vis, adj, ls);
        return ls;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        List<Integer> ans = dfsOfGraph(n, adj);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
