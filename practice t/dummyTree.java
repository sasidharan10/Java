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

    public static void getNodes(TreeNode root, List<TreeNode> arr) {
        if (root == null)
            return;
        getNodes(root.left, arr);
        arr.add(root);
        getNodes(root.right, arr);
    }

    public static TreeNode createBST(int low, int high, int n, List<TreeNode> arr) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode root = arr.get(mid);
        root.left = createBST(low, mid - 1, n, arr);
        root.right = createBST(mid + 1, high, n, arr);
        return root;
    }

    public static TreeNode balanceBST(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();
        getNodes(root, arr);
        int n = arr.size();
        int low = 0, high = n - 1;
        TreeNode newRoot = createBST(low, high, n, arr);
        return newRoot;
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
        root = bstToGst(root);
        System.out.print("\nTree: ");
        inorder(root);
        // inorder(root);
    }
}
