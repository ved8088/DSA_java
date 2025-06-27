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

    public void insert(int value){

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

     return node;
    }


}
