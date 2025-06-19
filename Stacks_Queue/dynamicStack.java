package Stacks_Queue;

public class dynamicStack extends customStack{

    public dynamicStack(){
        super(); // it will call constructor in parent class which does not take any argument 'customStack'

    }

    public dynamicStack(int size){
        super(size); // it will call customStack(int size)
    }

    @Override
    public boolean push(int item){
        if(this.isfull()){
            // double the array size;
            int[] temp = new int[data.length * 2];

            //copy all previous items in new data

            for(int i=0;i<data.length;i++){
                temp[i] = data[i];

            }
            data = temp;

        }
        return super.push(item);
    }

}
