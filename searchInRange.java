public class searchInRange {

    public static void main(String[] args) {
        int arr[] = {23,45,1,2,8,9,12,78};
        int target = 23;
        System.out.println(range(arr,1,7,target));
    }

    static int range(int arr[],int start,int end,int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=start;index<=end;index++){
            if(target == arr[index]){
                return index;
            }
        }

        return -1;
    }

}
