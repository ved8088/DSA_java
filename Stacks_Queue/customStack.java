package Stacks_Queue;

public class customStack {
    protected int[] data;
    private static final int default_size = 10;

    int ptr = -1;

    public customStack(){
        this(default_size);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isfull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;

    }

    public int peek() throws stackException {
        if(isempty()){
            throw new stackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public int pop() throws Exception {
        if(isempty()){
            throw new Exception("Cannot pop from an empty stack!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];

    }

    public boolean isfull(){
        return ptr == data.length - 1;
    }

    public boolean isempty(){
        return ptr == -1;
    }

}
