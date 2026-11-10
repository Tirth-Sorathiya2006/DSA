/*
Given an array nums of n integers, return reverse of the array.
1 <= n <= 100
1 <= nums[i] <= 100
*/

import java.util.Arrays;

public class Solution57 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 2};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    private static int[] reverse(int[] arr) {
        int[] ans = new int[arr.length];
        return reverseHelper(arr, arr.length - 1, ans);
    }

    private static int[] reverseHelper(int[] nums, int idx, int[] ans) {
        if (idx == -1) {
            return ans;
        }

        ans[nums.length - 1 - idx] = nums[idx];
        return reverseHelper(nums, idx - 1, ans);
    }
}
