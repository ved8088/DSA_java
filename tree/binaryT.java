package tree;

import java.util.Scanner;

public class binaryT {

    private static  class Node{
        int value;
        Node left;
        Node right;

         public Node(int value){
             this.value = value;
         }


    }

    private Node root;

    public void populate(Scanner scanner){

        System.out.println("Enter the root node value: ");

        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);

    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of  " + node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("Enter Your left value is --->>  "+ node.value);
            int valueleft = scanner.nextInt();
            node.left = new Node(valueleft);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of  " + node.value);
        boolean right = scanner.nextBoolean();

        if(right){
            System.out.println("Enter Your right value is --->>  "+ node.value);
            int valueRight = scanner.nextInt();
            node.right = new Node(valueRight);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node == null){
            return;
        }

        prettyDisplay(node.right,level+1);

        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.println("|\t\t");
            }
            System.out.println("|------>" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);


    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        binaryT tree = new binaryT();
        tree.populate(scanner);
        tree.display();

    }

}
