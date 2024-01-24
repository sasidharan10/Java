import java.util.*;

public class dummyTree {
    public static int findPaths(TreeNode root, int val)
    {
        // TC: O(n)
        // SC: O(h) stack space

        if (root==null)
            return 0;
        if (root.left==null && root.right==null)
        {
            val = (val^(1<<root.val));
            if ((val & (val - 1)) == 0)
                return 1;
            else
                return 0;
        }
        val = (val^(1<<root.val));
        int lt = findPaths(root.left, val);
        int rt = findPaths(root.right, val);
        return lt + rt;
    }
    public static int pseudoPalindromicPaths (TreeNode root) {
        return findPaths(root, 0);
    }
    public static void main(String[] args) {
    TreeNode root = null;
    root = new TreeNode(2);
    root.left = new TreeNode(3);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(1);
    root.right.right = new TreeNode(1);
    System.out.print("Result: ");
    System.out.print(pseudoPalindromicPaths(root));
    }
}
