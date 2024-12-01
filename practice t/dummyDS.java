import java.util.*;

public class dummyDS {
    public static class disjointSet {
        private int[] parent, size;
        private int noOfComponents;

        public disjointSet(int n) {
            noOfComponents = n;
            parent = new int[n + 1];
            size = new int[n + 1];
            Arrays.fill(size, 1);
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public int findUParent(int node) {
            if (parent[node] == node)
                return node;
            return parent[node] = findUParent(parent[node]);
        }

        public void unionBySize(int u, int v) {
            int ulp_u = findUParent(u);
            int ulp_v = findUParent(v);
            if (ulp_u == ulp_v)
                return;
            if (size[ulp_u] > size[ulp_v]) {
                parent[ulp_v] = ulp_u;
                size[ulp_u] += size[ulp_v];
            } else {
                parent[ulp_u] = ulp_v;
                size[ulp_v] += size[ulp_u];
            }
            noOfComponents--;
        }

        public int getNoOfComponents() {
            return noOfComponents;
        }
    }

    public static int removeStones(int[][] stones)
    {
        // TC: O(^2) + alpha(n)
        // SC: O(n)
        
        int n = stones.length;
        disjointSet ds = new disjointSet(n);
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])
                    ds.unionBySize(i, j);
            }
        }
        int groups = 0;
        for (int i = 0; i < n; i++)
        {
            if (ds.parent[i] == i)
                groups++;
        }
        return n - groups;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 12, 8 };
        // int[] nums = { 3, 9, 5 };
        // System.out.println(removeStones(nums));
    }
}
