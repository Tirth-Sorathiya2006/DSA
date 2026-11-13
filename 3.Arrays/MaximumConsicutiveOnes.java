/*
Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s.
1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
*/

public class MaximumConsicutiveOnes {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0};
        System.out.println(maxConsecutiveOnes(nums));
    }

    private static int maxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}