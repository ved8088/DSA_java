package tree;

public class preordertraversal {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        int[] input = {5, 3, 7, 1, 4, 6, 8};
        Node root = null;
        for (int data : input) {
            root = insert(root, data);
        }

        preOrder(root);  // call your preorder function here
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
            return root;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root) {

        if(root == null){

            return;
        }

        postOrder(root.left);   // left
        postOrder(root.right);  // right
        System.out.print(root.data + " "); // root
        
    }

}
