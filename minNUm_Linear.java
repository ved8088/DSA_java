public class minNUm_Linear {

    public static void main(String[] args) {
        int arr[] = {23,45,1,2,8,9,12,78};
        System.out.println(minimumNUmArr(arr));

    }

    static int minimumNUmArr(int arr[]){
    int ans = arr[0];
    for(int i=1;i< arr.length;i++){
        if(arr[i] > arr[i+1] ){
            ans = arr[i+1];
            return ans;
        }

    }
        return ans;
    }

}
