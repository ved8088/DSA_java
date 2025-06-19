package arrays;

public class selectionSort {
    public static void main(String[] args) {

    }
    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){

            int last =  arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }

    static void insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j= i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int arr[],int first,int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
         int max = start;

         for(int i=1;i<last;i++){
             if(arr[max] < arr[i]){
                 max = arr[i];
             }
         }


        return max;
    }
}
