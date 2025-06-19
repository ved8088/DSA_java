package tree;

public class binarySearchTree {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public binarySearchTree(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;

    }

    public void display(){
        display(root,"Root Node");
    }

    private void display(Node node, String string) {
        if(node == null){
            return;
        }
        System.out.println(string + node.getValue());

        display(node.left," Left child of " + node.getValue() + " : ");
        display(node.right," Right child of " + node.getValue() + " : ");

    }

    public void insert(int value){
        root = insert(value,root);

    }

//    public void populateSorted(int nums[]){
//            populateSorted(nums,0,nums.length\);
//    }

    private void populatedSorted(int nums[], int start,int end){
        if(start>=end){
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);


    }


    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }

        if(value > node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;


        return node;

    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }




}
