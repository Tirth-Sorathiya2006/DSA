/*
Given an integer array nums, rotate the array to the left by one.
Note: There is no need to return anything, just modify the given array.
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
*/

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        leftRotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void leftRotateArrayByOne(int[] nums) {
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;
    }
}
