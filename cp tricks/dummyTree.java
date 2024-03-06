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

    public static boolean isEvenOddTree(TreeNode root) {
        int lvl = 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        TreeNode temp = new TreeNode();
        while (!que.isEmpty()) {
            int n = que.size();
            int prev = -1;
            while (n > 0) {
                temp = que.poll();
                if (lvl % 2 == 0) {
                    if (temp.val % 2 == 0) {
                        return false;
                    }
                    if (prev != -1 && prev >= temp.val)
                        return false;
                    else
                        prev = temp.val;

                } else {
                    if (temp.val % 2 != 0) {
                        return false;
                    }
                    if (prev != -1 && prev <= temp.val)
                        return false;
                    prev = temp.val;
                }
                if (temp.left != null)
                    que.offer(temp.left);
                if (temp.right != null)
                    que.offer(temp.right);
                n--;
            }
            lvl++;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.left.left = new TreeNode(12);
        root.left.left.right = new TreeNode(8);
        root.right.left.left = new TreeNode(6);
        root.right.right.right = new TreeNode(2);

        // TreeNode root2 = null;
        // root2 = new TreeNode(2);
        // root2.left = new TreeNode(3);
        System.out.print("Result: ");
        System.out.print(isEvenOddTree(root));
    }
}
