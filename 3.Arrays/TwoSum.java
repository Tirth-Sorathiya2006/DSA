/*
Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.

Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in any order.

2 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
-10^5 <= target <= 10^5
Only one valid answer exists.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-6, 7, 1, -7, 6, 2};
        int target = 3;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int secondPossible = target - nums[i];

            if (map.containsKey(secondPossible)) {
                return new int[] {map.get(secondPossible), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}