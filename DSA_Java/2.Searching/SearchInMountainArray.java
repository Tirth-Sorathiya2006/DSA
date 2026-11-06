public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] nums = { -7, -7, -7, 8, 2, 1 };
        System.out.println(search(nums, 2));
    }

    private static int search(int[] nums, int target) {
        // check for empty array
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // find peak
        int peakIdx = peak(nums);

        if (peakIdx == -1) {
            return -1;
        }

        int left = binarySearch(nums, target, 0, peakIdx, true);

        if (left != -1) {
            return left;
        }

        return binarySearch(nums, target, peakIdx + 1, nums.length - 1, false);
    }

    private static int binarySearch(int[] nums, int target, int left, int right, boolean isAsc) {
        int start = left, end = right;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

    private static int peak(int[] nums) {
        // check if the array is empty
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // check if the first or last element is peak
        if (nums.length == 1 || nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        // apply binary search logic
        int start = 1, end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // return -1 if the peak is not found
        return -1;
    }
}
