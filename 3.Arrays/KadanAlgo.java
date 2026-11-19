/*
Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.

1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
*/

public class KadanAlgo {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, -2, 7, -4, 0, 4, 5 };
        System.out.println(maxSubarraySum(nums));
    }

    private static int maxSubarraySum(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
