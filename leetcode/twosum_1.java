package leetcode;

import java.util.Arrays;

public class twosum_1 {
    public int[] twoSumbruteforce(int[] nums, int target) {
        if(nums.length == 0){
            return new int[]{-1, -1};
        }
        int[] ans = new int[2];

        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target ){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }



    public static void main(String[] args) {
        int[] nums = new int[]{2,5,5,11};
        int target = 10;
        twosum_1 obj = new twosum_1();
        int[] ans = obj.twoSumbruteforce(nums,target);
        System.out.println(Arrays.toString(ans));
    }

}
