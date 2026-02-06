package leetcode;

public class problem485 {

    public static void main(String[] args) {
        int[] arr= new int[]{1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }

        return max;
    }


}
