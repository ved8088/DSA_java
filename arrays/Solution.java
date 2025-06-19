package arrays;

class Solution {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }

    static void rotate(int[] nums, int k) {

         int start = 0;
         int end = nums.length;   

        int arr1[] = reverse(nums,start,end);
        int reverse2[] = reverse(nums,start,k);
        int reverse3[] = reverse(nums,k+1,end);

        System.out.println(reverse3);
        

    }

    static int[] reverse(int arr[],int start,int end){
        int left = start;
        int right = end;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return arr;
    }
} 