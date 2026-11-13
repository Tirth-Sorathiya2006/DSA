/*
Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array. If the target is not found in the array, return -1

1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
-10^4 <= target <= 10^4
*/

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 9};
        System.out.println(linearSearch(nums, 5));
    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
