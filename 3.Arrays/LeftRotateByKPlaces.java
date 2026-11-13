/*
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
0 <= k <= 10^5
*/

import java.util.Arrays;

public class LeftRotateByKPlaces {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        leftRotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    private static void leftRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right){
        int start = left;
        int end = right;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
