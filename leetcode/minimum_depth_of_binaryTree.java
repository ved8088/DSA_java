package leetcode;

public class minimum_depth_of_binaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Solution
    public int minimum_depth_of_binaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minimum_depth_of_binaryTree(root.left);
        int right = minimum_depth_of_binaryTree(root.right);

        if (root.left == null) return right + 1;
        if (root.right == null) return left + 1;

        return Math.min(left, right) + 1;
    }

    public static void main(String[] args) {

        /*
         *      3
         *     / \
         *    9   20
         *       /  \
         *      15    7
         */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        minimum_depth_of_binaryTree solution = new minimum_depth_of_binaryTree();
        int result = solution.minimum_depth_of_binaryTree(root);

        System.out.println("Minimum Depth: " + result); // Expected: 2
    }
}
