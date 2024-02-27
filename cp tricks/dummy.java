import java.util.*;

public class dummy {
    public static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static class Tuple {
        int first;
        int second;
        int third;

        public Tuple(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int lt = maxDepth(root.left);
        int rt = maxDepth(root.right);
        int ct = lt + rt;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(ct, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        int[] nums = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };
        int[][] grid = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        // int k = 3;
        int n = 4, src = 0, dst = 3, k = 1;
        int bricks = 10, ladders = 2;
        // String str = "Aabb";
        String str = "cccaaa";
        int low = 1000, high = 13000;
        System.out.println("Result: ");
        // String ans = minWindow(str, t);
        System.out.println(findCheapestPrice(n, grid, src, dst, k));
        // int[][] ans = maxSumAfterPartitioning(nums, k);
        // int[] ans = rearrangeArray(nums);
        // List<Integer> ans = sequentialDigits(low, high);
        // System.out.print(Arrays.toString(ans));
        // for (int[] is : ans) {
        // for (int is2 : is) {
        // System.out.print(is2 + " ");
        // }
        // System.out.println();
        // }
    }

}
