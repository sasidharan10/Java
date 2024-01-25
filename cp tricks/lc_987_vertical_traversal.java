import java.util.*;

import javax.swing.tree.TreeNode;

public class lc_987_vertical_traversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Tuple {
        int vertical;
        int level;
        TreeNode node;

        public Tuple(int _vertical, int _level, TreeNode _node) {
            vertical = _vertical;
            level = _level;
            node = _node;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(0, 0, root));
        while (!q.isEmpty()) {
            Tuple tp = q.poll();
            int ver = tp.vertical;
            int lvl = tp.level;
            TreeNode node = tp.node;
            if (!mp.containsKey(ver))
                mp.put(ver, new TreeMap<>());
            if (!mp.get(ver).containsKey(lvl))
                mp.get(ver).put(lvl, new PriorityQueue<>());
            mp.get(ver).get(lvl).offer(node.val);
            if (node.left != null) {
                q.offer(new Tuple(ver - 1, lvl + 1, node.left));
            }
            if (node.right != null) {
                q.offer(new Tuple(ver + 1, lvl + 1, node.right));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> temp1 : mp.values()) {
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> temp2 : temp1.values()) {
                ans.get(ans.size() - 1).add(temp2.poll());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.print("Result: ");
        List<List<Integer>> ans = verticalTraversal(root);
        for (List<Integer> lt : ans) {
            for (Integer it : lt) {
                System.out.println(it + ", ");
            }
        }
    }
}
