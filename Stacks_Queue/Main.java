package Stacks_Queue;

public class Main {
    public static void main(String[] args) {

    }

 public class CustomStack {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;

        int ptr = -1;

        public CustomStack(){
            this(DEFAULT_SIZE);
        }

        public CustomStack(int size){
                this.data = new int[size];
        }

        public boolean push(int item){

            if (isFull()){
                System.out.println("Stack is Full");
                return false;
            }

            ptr++;
            data[ptr] = item;
            return true;
        }

        public int pop() throws Exception {
            if(isEmpty()){
                throw new Exception("Cannot pop from Empty array");
            }
            int removed = data[ptr];
            ptr--;
            return removed;
        }

        public int peek() throws Exception {
            if(isEmpty()){
                throw new Exception("Cannot pop from Empty array");
            }

            return data[ptr];

        }

        private boolean isFull(){
            return ptr == data.length - 1;
        }

     private boolean isEmpty(){
         return ptr == - 1;
     }


 }
}
