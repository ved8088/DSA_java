package Stacks_Queue;

public class customQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    public customQueue(){
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean insert(int item){
//        end++;
//        data[end] = item;
//        return true;

        if(isFull()){
            return false;

        }

        data[end++] = item;
        return true;

    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        //shift the elements to the left here after removing the item
        for(int i=1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");

    }

}
