package tree;

public class bst {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getvalue(){
            return value;
        }
    }

    private Node root;


    public bst(){

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

    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public void insert(int value){
        root = insert(value,root);
    }

    public Node insert(int value, Node node){

       if(node == null){
           node = new Node(value);
           return node;
       }

        if(value < node.value){
           node.left = insert(value,node.left);
        }
     else if(value > node.value){
          node.right = insert(value,node.right);
        }

     node.height = Math.max(height(node.left),height(node.right)) + 1;

     return node;
    }

    public boolean balanced(){
        return balanced(root);
    }



    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root, "Root Node: ");
    }


    private void display(Node node,String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "left child of : " + node.value + " : ");
        display(node.right,"Right child of : " + node.value + " : ");


    }


    public void populatedSorted(int[] nums){
        populatedSorted(nums,0,nums.length);
    }

    private void populatedSorted(int[] nums,int start,int end){

        if(start >= end){
            return;
        }
        int mid = (start + end) /2 ;

        this.insert(nums[mid]);
        populatedSorted(nums,start,mid);
        populatedSorted(nums,mid+1,end);


    }

}
