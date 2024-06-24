import java.util.*;

public class dummyTree {
    public static class Pair {
        TreeNode node;
        String curr;

        Pair() {
        }

        Pair(TreeNode node, String curr) {
            this.node = node;
            this.curr = curr;
        }
    }

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

    public static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static String res;

    public static String smallestFromLeaf(TreeNode root) {
        res = "";
        Queue<Pair> que = new LinkedList<>();
        String temp = "";
        temp += (char) ('a' + root.val);
        que.offer(new Pair(root, temp));
        while (!que.isEmpty()) {
            Pair p = que.poll();
            TreeNode node = p.node;
            String curr = p.curr;
            if (node.left == null && node.right == null) {
                if (res.equals("") || res.compareTo(curr) > 0)
                    res = curr;
            }
            if (node.left != null) {
                que.offer(new Pair(node.left, (char) ('a' + node.left.val) + curr));
            }
            if (node.right != null) {
                que.offer(new Pair(node.right, (char) ('a' + node.right.val) + curr));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = new TreeNode(25);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);
        root.left.left.left = new TreeNode(1);
        root.left.left.left.left = new TreeNode(0);

        // TreeNode root2 = null;
        // root2 = new TreeNode(2);
        // root2.left = new TreeNode(3);
        System.out.print("Tree: ");
        inorder(root);
        System.out.print("\nResult: " + smallestFromLeaf(root));
        // inorder(root);
    }
}
