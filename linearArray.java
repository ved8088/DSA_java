public class linearArray{
    
    public static void main(String[] args) {
        int nums[] = {23,45,1,2,8,9,12,78,89,45,34,10};
        int target = 13;
      int ans =   linearSearch(nums, target);
      System.out.println("Index of target value is ---->>  " + ans);
    }

    static int linearSearch(int[] arr,int  target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(target == arr[index]){
                return index;
               } 
        }
        return 0;
    }
}