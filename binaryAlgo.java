public class binaryAlgo {
    public static void main(String[] args) {
        int nums[] = {-18,2,4,5,6,7,12,12,12,14,17,19,23};
        int target = 15;
//        int ans = ceilingofNumber(arr,target);
        int ans[] = {-1,-1};
        ans[0]= search(nums,target,true);
        ans[1]= search(nums,target,false);

        System.out.println("ans--->>> " + ans);
    }

    //return the index
    static int binarySearch(int arr[],int target){
        int start =0;
        int end = arr.length - 1;

        while(start <= end){
           //find the middle element
           int mid = start + (end - start) / 2 ;

           if(target < arr[mid]){
               end = mid - 1;
           }else if(target > arr[mid]){
               start = mid + 1;

           }else{
               return mid;
           }

        }

        return -1;
    }

    // order agnostic Binary Search
    static int orderAgnosticBS(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;

        //checking first whether array is ascending or descending
        if(arr[start] < arr[end]){
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
                } else{
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }


        }

        return 1;
    }

    //return number which is greater than or equal to target but smallest than all remaining numbers
    static int ceilingofNumber(int arr[],int target){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return arr[mid];
            }


        }

        return arr[start];
    }

    //Find First and Last Position of Element in Sorted Array

    static int search(int nums[],int target,boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }

        return ans;

    }

    static int searchInRange(int arr[],int target,int start,int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }


        }

        return -1;
    }

    static int ans(int arr[],int target){
            int start = 0;
            int end = 1;

            while(target > arr[end]){
              int temp = end + 1;
              //end = previous end + sizeofbox * 2

              end = end + (end - start + 1) * 2;
              start = temp;

            }
        return searchInRange(arr,target,start,end);
    }

    static int peakIndexInMountainArray(int[] arr) {

        int start =0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // you are in dec part of the array
                //this may be the ans, but look at left
                //this is why end!= mid -1
                end = mid;
            }else{
                start = mid + 1;
            }

        }
        //in the end, start == end and pointing to the largest number because of the above 2 checks
        //start and end are always trying to find max element in above 2 checks
        //hence, when they are pointing to just one element, that is max one because thats what the check say
        //for every point of for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, cuz of the above line that is the best possible    answer
        return start;
    }


}
