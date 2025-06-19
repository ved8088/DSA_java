package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomeArrayList {

    private int data[];
    private static int default_size = 10;
    private int size = 0;

    public CustomeArrayList(){
        this.data = new int[default_size];


    }

    public void add(int num){
        if(this.isfull()){
            resize();

        }
        data[size++] = num;
    }

    private void resize(){
        int temp[] = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull(){
        return size == data.length;
    }

    public int remove(){
        int remove = data[--size];
        return remove;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return " CustomArrayList { "+" data = "+ Arrays.toString(data) +", size = "+size+"}";
    }

    public static void main(String[] args) {
        CustomeArrayList list = new CustomeArrayList();

//        list.add(3);
//        list.add(6);
//        list.add(9);

        for(int i=0;i<24;i++){
            list.add(2*i);
        }

        System.out.println(list);

    }

}
