/*
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.

n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.
*/

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNum = (n * (n + 1)) / 2;

        for (int num : nums) {
            missingNum -= num;
        }

        return missingNum;
    }
}
