package arrays;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {

        int arr[] = {5,4,1,2,3};
        CyclicSort(arr);

    }

    static void CSort(int arr[]){

        int i=0;
        while (i<arr.length){

            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }

        }


    }

    static void CyclicSort(int arr[]){
        int i=0;

        while(i<arr.length){

          if(arr[i] != arr[arr[i] - 1]){
              swap(arr,i,arr[i]-1);
          }else{
              i++;
          }
        }
        System.out.println(Arrays.toString(arr));
    }



 static void swap(int arr[], int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;


}


}
