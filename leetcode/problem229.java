package leetcode;

import abstarctDemo.Parent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem229 {

       public List<Integer> majorityElement(int[] nums){
            int n = nums.length;
            List<Integer> result = new ArrayList<>();

            for(int i =0;i<n;i++){
                if(result.size() == 0 || result.get(0) != nums[i] && (result.size() < 2 || result.get(1) != nums[i]) ){
                    int count = 0;
                    for(int j = 0; j< n;j++){
                        if(nums[j] == nums[i]){
                            count++;
                        }
                    }

                    if(count > n/3){
                        result.add(nums[i]);
                    }
                }
                if(result.size() == 2){
                    break;
                }

            }
            return result;

       }



    public static void main(String[] args) {
        int[] arr = {3,2,3,3,2,2,3};
        problem229 sol = new problem229();

        List<Integer> ans = sol.majorityElement(arr);

        System.out.println("The majority elements are: ");
        for(int it: ans){
            System.out.println(it + " ");
        }
        System.out.println();

    }
}
