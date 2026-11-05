/*
    Find the ceiling of the given given target number from sorted array nums
    Ceiling is the smallest element which is bigger than the number
*/

public class Ceil {
    public static void main(String[] args) {
        int[] nums = { -7, -7, -7, -2, -1, 0, 0, 2, 3, 3, 3, 4, 4, 8, 9, 25 };
        int target = 5;
        System.out.println(ceil(nums, target));
    }

    static int ceil(int[] nums, int target) {
        // check for empty array input and target out of boundry check
        if (nums == null || nums.length == 0 || target > nums[nums.length - 1]) {
            return Integer.MAX_VALUE;
        }

        // apply binary search logic
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if we find out the target then we directly return it
            if (nums[mid] == target) {
                return nums[mid];
            }

            // if mid element is less than the target then move right
            // otherwise move left
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // return element at start pointer
        return nums[start];
    }
}
