package leetcode;
//remove elements
class problem27 {
    public int removeElement(int[] nums, int val) {

        if(nums.length == 0){
            return 0;
        }

        int k=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[k]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}