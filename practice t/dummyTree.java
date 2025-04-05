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

    public static int ind;

    public static TreeNode solve(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder,
            Map<Integer, Integer> mp) {
        if (inStart > inEnd)
            return null;

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int i = mp.get(rootVal);
        int leftSize = i - inStart;
        int rightSize = inEnd - i;

        root.left = solve(preStart + 1, preStart + leftSize, inStart, i - 1, preorder, inorder, mp);
        root.right = solve(preEnd - rightSize + 1, preEnd, i + 1, inEnd, preorder, inorder, mp);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(inorder[i], i);
        }
        TreeNode root = solve(0, n - 1, 0, n - 1, preorder, inorder, mp);
        return root;
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
        // root = bstToGst(root);
        // System.out.print("\nTree: ");
        // inorder(root);
    }
}
