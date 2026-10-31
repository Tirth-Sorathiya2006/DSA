/*
    Given an array nums of integers, return how many of them contain an even number of digits.
    1 <= nums.length <= 500
    1 <= nums[i] <= 10^5
*/

public class LeetCode1295 {
    public static void main(String[] args) {
        int[] arr = {555, 901, 482, 1771};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        // it is a counter which stores the count of even digit numbers found in array
        int evenNumberCount = 0;

        // go through each number
        for (int num : nums) {
            
            // count digits of the number
            int length = (int)(Math.log10(num)) + 1;

            // check for even digit of numebr
            if(length % 2 == 0){
                evenNumberCount++;
            }
        }

        // return total count of even digit numbers 
        return evenNumberCount;
    }
}
