//package tree;
//import java.util.*;
//import java.io.*;
//
////
//
//public class heightbt {
//
//    class Node {
//        Node left;
//        Node right;
//        int data;
//
//        Node(int data) {
//            this.data = data;
//            left = null;
//            right = null;
//        }
//    }
//
//
//    public static int height(Node root) {
//        // Write your code here.
//        if(root == null ){
//            return -1;
//        }
//
//        if(root.left == null && root.right == null){
//            return 0;
//        }
//
//        int leftHeight = height(root.left);
//        int rightHeight = height(root.right);
//
//        int heightmax = 1 + max(leftHeight + rightHeight);
//        return heightmax;
//    }
//
//    public Node insert(Node root, int data) {
//        if(root == null) {
//            return new Node(data);
//        } else {
//            Node cur;
//            if(data <= root.data) {
//                cur = insert(root.left, data);
//                root.left = cur;
//            } else {
//                cur = insert(root.right, data);
//                root.right = cur;
//            }
//            return root;
//            }
//    }
//
//}
