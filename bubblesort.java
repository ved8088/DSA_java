import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length - i -1;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swapped then it means that arrays is sorted
            if(!swapped){// !false is true
                break;
            }
        }
    }
}
