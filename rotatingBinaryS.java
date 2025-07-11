public class rotatingBinaryS {

    public static void main(String[] args) {

        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(pivot(arr));

    }

    static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        //if pivot not found then array is not rotated
        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(pivot == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int arr[],int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid] < target ){
                start = mid +1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){

            int mid = start + (end - start) / 2;
            //4 cases over here

            if(mid<end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid>start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;

            }else{
                start = mid + 1;

            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                 return arr[mid-1];
            }

            //if elements at start, end and middle are equal then skip the duplicates
            if(arr[mid] == arr[end] && arr[start] == arr[mid]){
                start++;
                end--;
            }
        }


        return -1;
    }


}
