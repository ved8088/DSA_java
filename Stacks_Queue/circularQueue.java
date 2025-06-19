package Stacks_Queue;

public class circularQueue {

    private int[] data;

    private static final int defaultSize = 10;

    protected int front = 0;
    protected int end =0;
    private int size = 0;

    public circularQueue(){
        this(defaultSize);
    }

    public circularQueue(int size){
        this.data = new int[size];
    }

    public boolean isfull(){
        return size == data.length;
    }

    public boolean isempty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];

        front = front % data.length;
        size--;
        return removed;
    }

}
