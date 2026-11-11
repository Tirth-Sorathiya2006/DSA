/*
Given an array of integers called nums,sort the array in non-decreasing order using the bubble sort algorithm and return the sorted array.

A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.
*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 0, -4, -8, 941};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums)  {
        if (nums == null || nums.length <= 1) {
            return;
        }

        boolean isSwapped = false;

        for (int i = 0; i < nums.length - 1; i++) {
            isSwapped = false;
            
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }
}
