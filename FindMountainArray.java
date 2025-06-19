public class FindMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,5,4,3,2,1};
        int target = 4;
       int ans =  findInMountainArray(target,arr);
        System.out.println("ans ==>> " + ans);

    }

    static int findInMountainArray(int target, int mountainArr[]) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr,target,0,peak);

        if(firstTry != -1){
            return firstTry;
        }else{
            return orderAgnosticBS(mountainArr,target,peak+1,mountainArr.length-1);
        }



    }

    static int orderAgnosticBS(int arr[],int target,int start,int end){

        boolean isAsc;

        if(arr[start] < arr[end] ){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;



    }



    static int peakIndexInMountainArray(int arr[]){

        int start = 0;
        int end = arr.length -1;

        while(start < end){

            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid - 1;
            }

        }
        return start;

    }

}
