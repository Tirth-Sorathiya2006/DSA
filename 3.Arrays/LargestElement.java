/*
Given an array of integers nums, return the value of the largest element in the array
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
nums may contain duplicate elements.
*/

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 9};
        System.out.println(max(nums));
    }

    private static int max(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
