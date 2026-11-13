public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 8, -4, 65, 4};
        System.out.println(secondLargest(nums));
    }

    private static int secondLargest(int[] nums) {
        if (nums.length == 1) {
            return -1;
        }

        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && secondLargest < nums[i]) {
                secondLargest = nums[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
