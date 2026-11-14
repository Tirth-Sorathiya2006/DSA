/*
Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
This must be done in place, without making a copy of the array.
1 <= nums.length <= 10^5
-10^4 <=nums[i] <= 10^4
*/

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2};
        moveZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZerosToEnd(int[] nums) {
        int idx = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                idx++;
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
            }
        }
    }
}