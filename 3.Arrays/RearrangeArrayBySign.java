/*
Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.

2 <= nums.length <= 10^5
1 <= | nums[i] | <= 10^4
nums.length is an even number.
Number of positive and negative numbers are equal.
*/

import java.util.Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] nums = {1, -1, -3, -4, 2, 3}; 
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    private static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }
}
