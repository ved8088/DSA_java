package arrays;

public class Duplicates {

    public static void main(String[] args) {
     int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // Pointer for placement of unique elements
        int j = 0;

        // Start from the second element and compare
        for (int i = 1; i < nums.length; i++) {
            // If we find a new unique element
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        // j is the last index of a unique element
        // The number of unique elements is j+1
        return j + 1;
    }

}
