package leetcode;

class problem136 {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            for(int j=1;j<len;j++){
                int count =0;
                if(nums[i] == nums[j] && i!=j){
                    count = 2;
                    arr[i] =count;
                    arr[j] = count;
                }
            }
        }
        for(int k=0;k<len;k++){
            if(arr[k] != 2){
                return nums[k];
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        problem136 obj1 = new problem136();
        int[] arr = new int[]{2,2,1};
        System.out.println(obj1.singleNumber(arr));
    }
}