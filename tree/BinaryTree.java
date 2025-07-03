package tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public  Node(int value){
            this.value = value;
        }
    }

private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of " + node.value );
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+ node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        boolean right = scanner.nextBoolean();  
        if(right){
            System.out.println("Enter the value of the right of "+ node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }

    }
    private void display(){
        display(root, "");
    }

    private void display(Node node,String str){
        if(node == null){
            return;
        }

        System.out.println(str + node.value);
        display(node.left,str + "\t");
//        display(node.right + str + "\t");
    }

    public void preorder(){
        preorder(root);
    }

    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);

    }


}
