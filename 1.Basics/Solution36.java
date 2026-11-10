/*
Given an array arr of size n, the task is to find the sum of all the elements in the array.
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

// import java.util.Arrays;

public class Solution36 {
    public static void main(String[] args) {
        int[] nums = {5, 4};
        System.out.println(sum(nums));
    }

    private static int sum(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
        // return Arrays.stream(nums).sum();
    }
}
