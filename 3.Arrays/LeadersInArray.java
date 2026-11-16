/*
Given an integer array nums, return a list of all the leaders in the array.

A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.

1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
*/

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders(nums));
    }

    private static List<Integer> leaders(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > ans.get(ans.size() - 1)) {
                ans.add(nums[i]);
            }
        }

        reverseList(ans);
        return ans;
    }

    private static void reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
