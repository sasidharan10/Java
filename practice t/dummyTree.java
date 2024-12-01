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

    public static TreeNode findLCA(TreeNode root, int s, int d) {
        if (root == null)
            return null;
        if (root == null || root.val == s || root.val == d)
            return root;
        TreeNode lt = findLCA(root.left, s, d);
        TreeNode rt = findLCA(root.right, s, d);
        if (rt == null)
            return lt;
        else if (lt == null)
            return rt;
        else
            return root;
    }

    public static StringBuilder findPath(TreeNode root, StringBuilder path, int target) {
        if (root == null)
            return new StringBuilder();
        if (root.val == target) {
            return new StringBuilder(path);
        }
        path.append('L');
        StringBuilder lt = findPath(root.left, path, target);
        path.deleteCharAt(path.length() - 1);
        path.append('R');
        StringBuilder rt = findPath(root.right, path, target);
        path.deleteCharAt(path.length() - 1);
        if (rt.isEmpty())
            return lt;
        else if (lt.isEmpty())
            return rt;
        else
            return new StringBuilder();
    }

    public static String getDirections(TreeNode root, int startValue, int destValue) {

        TreeNode lca = findLCA(root, startValue, destValue);

        StringBuilder path = new StringBuilder();
        StringBuilder source = findPath(lca, path, startValue);

        StringBuilder path2 = new StringBuilder();
        StringBuilder dest = findPath(lca, path2, destValue);

        StringBuilder res = new StringBuilder();
        int n = source.length();
        for (int i = 0; i < n; i++) {
            res.append('U');
        }
        res.append(dest);
        return res.toString();
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(11);

        // TreeNode root2 = null;
        // root2 = new TreeNode(2);
        // root2.left = new TreeNode(3);
        System.out.print("Tree: ");
        inorder(root);
        System.out.println();
        System.out.println(getDirections(root, 1, 11));
        // root = bstToGst(root);
        // System.out.print("\nTree: ");
        // inorder(root);
    }
}
