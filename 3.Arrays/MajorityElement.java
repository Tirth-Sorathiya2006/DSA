/*
Given an integer array nums of size n, return the majority element of the array.

The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

n == nums.length.
1 <= n <= 10^5
-10^4 <= nums[i] <= 10^4
One value appears more than n/2 times.
*/

public class MajorityElement{
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int point = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                point++;
            } else {
                point--;
            }

            if (point == 0) {
                candidate = nums[i];
                point = 1;
            }
        }

        return candidate;
    }
}