public class PeakInMountain {
    public static void main(String[] args) {
        int[] nums = { -7, -7, -7, 8, 2, 1 };
        int[] nums2 = { -7, -7, -7, 8, 2, 1, 0, -5, 9, 5, 4, 3, 2, 9, 5, 4, 3, 1 };
        int[] nums3 = { 1, 2, 3 };
        int[] nums4 = { 3, 2, 1 };

        System.out.println(peak(nums));
        System.out.println(peak(nums2));
        System.out.println(peak(nums3));
        System.out.println(peak(nums4));
    }

    // this provide any peak return -1 if there is no strict peak is there
    // return -1 in case of platue
    // in case of multiple peak it provide the any peak from that
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
