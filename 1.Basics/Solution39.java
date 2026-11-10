/*
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
1 <= n <= 10^4
1 <= arr[i] <= 10^5
*/

import java.util.Arrays;

public class Solution39 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 7, 8};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
