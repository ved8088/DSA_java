package Stacks_Queue;

public class customQueue {

    private int[] data;
    private static final int default_size = 10;
    int end = 0;

    public customQueue(){
        this(default_size);
    }

    public customQueue(int defaultSize) {
        this.data = new int[defaultSize];
    }

    public boolean isfull(){
        return end == data.length;

    }

    public boolean isempty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        //shift the elements to left

        for(int i=1;i<end;i++){
            data[i-1] = data[i];
        }

        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.println(data[i] + " ");

        }
        System.out.println("--- END ---");
    }

}
