import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = { -7, -7, -7, -2, -1, 0, 0, 2, 3, 3, 3, 4, 4, 8, 9, 25 };
        int target = 5;
        System.out.println(Arrays.toString(findFirstAndLastPos(nums, target)));
    }

    private static int[] findFirstAndLastPos(int[] nums, int target) {
        // check for empty array input
        if (nums == null || nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return new int[] { -1, -1 };
        }

        // finding first and last pos and return it
        return new int[] { findPos(nums, target, true), findPos(nums, target, false) };

    }

    static int findPos(int[] nums, int target, boolean isFirstPos) {
        // apply binary search logic
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isFirstPos) {
                // if mid element is less than the target then move right
                // otherwise move left
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // if mid element is less than or equals to the target then move right
                // otherwise move left
                if (nums[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if (isFirstPos) {
            // return element at end pointer
            return nums[start] == target ? start : -1;
        }

        // return element at end pointer
        return nums[end] == target ? end : -1;
    }
}