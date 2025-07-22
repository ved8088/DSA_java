package tree;

public class main {
    public static void main(String[] args) {
        // Create instance of Solution class from sameTree.java
        sameTree s = new sameTree();

        // Create trees using sameTree.TreeNode
        sameTree.TreeNode tree1 = new sameTree.TreeNode(1, new sameTree.TreeNode(2), new sameTree.TreeNode(3));
        sameTree.TreeNode tree2 = new sameTree.TreeNode(1, new sameTree.TreeNode(2), new sameTree.TreeNode(3));
        sameTree.TreeNode tree3 = new sameTree.TreeNode(1, new sameTree.TreeNode(2), new sameTree.TreeNode(4));

        System.out.println("Tree1 and Tree2 are same: " + s.isSameTree(tree1, tree2)); // true
        System.out.println("Tree1 and Tree3 are same: " + s.isSameTree(tree1, tree3)); // false
    }
}
