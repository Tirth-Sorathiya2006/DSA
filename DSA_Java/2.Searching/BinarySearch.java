public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -8, -7, -2, 0, 1, 5, 5, 8, 12, 25 };
        System.out.println(binarySearch(arr, 8));
    }

    private static int binarySearch(int[] nums, int target) {
        // check for empty array input
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // apply binary search logic
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // if target is not found in array then return -1
        return -1;
    }
}