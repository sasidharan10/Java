import java.util.Arrays;
import java.util.HashMap;

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
            else if (size[ulp_u] > size[ulp_v]) {
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

    public static boolean canTraverseAllPairs(int[] nums) {
        int n = nums.length;
        disjointSet ds = new disjointSet(n);
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            for (int factor = 2; factor * factor <= nums[i]; factor++) {
                if (temp % factor != 0)
                    continue;
                if (mp.containsKey(factor)) {
                    int idx = mp.get(factor);
                    ds.unionBySize(idx, i);
                } else
                    mp.put(factor, i);

                while (temp % factor == 0) {
                    temp /= factor;
                }
            }
            if (temp > 1) {
                if (mp.containsKey(temp)) {
                    int idx = mp.get(temp);
                    ds.unionBySize(idx, i);
                } else {
                    mp.put(temp, i);
                }
            }
        }
        return ds.getNoOfComponents() == 1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 12, 8 };
        // int[] nums = { 3, 9, 5 };
        System.out.println(canTraverseAllPairs(nums));
    }
}
