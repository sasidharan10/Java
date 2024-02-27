import java.util.*;

public class dummyTree {
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

    public static int maxHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int lt = maxHeight(root.left);
        int rt = maxHeight(root.right);
        int ct = lt + rt;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(ct, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        // TreeNode root2 = null;
        // root2 = new TreeNode(2);
        // root2.left = new TreeNode(3);
        System.out.print("Result: ");
        System.out.print(diameterOfBinaryTree(root));
    }
}
