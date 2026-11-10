/*
Given an array nums, find the sum of elements of array using recursion.
1 <= n <= 100
0 <= nums[i] <= 100
*/

public class Solution53 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 6, 7, 4, 0};
        System.out.println(sum(arr));
    }

    private static int sum(int[] nums) {
        return sumHelper(nums, 0, 0);
    }

    private static int sumHelper(int[] nums, int idx, int sum) {
        if (idx == nums.length) {
            return sum;
        }

        return sumHelper(nums, idx + 1, sum + nums[idx]);
    }
}
