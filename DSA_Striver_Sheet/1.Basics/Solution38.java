/*
1 ≤ n ≤ 10^6
- 10^9 ≤ arr[i] ≤ 10^9
*/

public class Solution38 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 8, 8};
        System.out.println(isSorted(nums));
    }

    private static boolean isSorted(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
