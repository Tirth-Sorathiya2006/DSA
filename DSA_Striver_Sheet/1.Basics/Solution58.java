/*
Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.
1 <= n <= 100
1 <= nums[i] <= 100
*/

public class Solution58 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 9};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        if (arr.length == 1) {
            return true;
        }

        return isSortedHelper(arr, 1);
    }

    private static boolean isSortedHelper(int[] nums, int idx) {
        if (idx == nums.length) {
            return true;
        }

        if (nums[idx] < nums[idx - 1]) {
            return false;
        }

        return isSortedHelper(nums, idx + 1);
    }
}
