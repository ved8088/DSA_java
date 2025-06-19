package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object data[];// 'T' is any type of data type which can make arrayList
    private static int default_size = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[default_size];


    }

    public void add(T num){
        if(this.isfull()){
            resize();

        }
        data[size++] = num;
    }

    private void resize(){
        Object temp[] = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull(){
        return size == data.length;
    }

    public T remove(){
        T remove = (T)data[--size];
        return remove;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
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