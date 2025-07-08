package tree;

import javax.swing.text.Segment;

public class segmentTree {

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};

        segmentTree tree = new segmentTree(arr);
    }

    private static class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;

       public Node(int startinterval,int endinterval){
           this.startinterval = startinterval;
           this.endinterval = endinterval;
       }
    }

    Node root;

    public segmentTree(int[] arr){

        this.root = constructTree(arr,0,arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end){

        if(start == end){

            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        //create new node with index you are at

        Node node = new Node(start,end);

        int mid = (start + end) / 2;

        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);


        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){

        String str= "";

        if(node.left != null){
            str = str + "Interval = [ " + node.left.startinterval + " - " + node.left.endinterval + " ] and data: "+ node.left.data + " + =>";   ;
        }else{
            str = str + "Node left child";

        }

        //for current node
        str = str + "Interval = [ " + node.left.startinterval + " - " + node.left.endinterval + " ] and data: "+ node.left.data + " <= ";   ;


        if(node.right != null){
            str = str + "Interval = [ " + node.right.startinterval + " - " + node.right.endinterval + " ] and data: "+ node.right.data + " + =>";   ;
        }else{
            str = str + "Node right child";

        }

        System.out.println(str);

        //call recursion
        if(node.left != null){
            display(node.left);
        }

        if(node.right != null){
            display(node.right);
        }

    }

}
