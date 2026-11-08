/*
Given an array of n elements. The task is to return the count of the number of odd numbers in the array.

1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

// import java.util.Arrays;

public class Solution37 {
    public static void main(String[] args) {
        int[] nums = {4, 7, 8, 9, 7};
        System.out.println(oddCount(nums));
    }

    private static int oddCount(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num % 2 == 1) {
                count++;
            }
        }

        return count;

        // return (int)Arrays.stream(nums).filter(num -> num % 2 == 1).count();
    }
}
