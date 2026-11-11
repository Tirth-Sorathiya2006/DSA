/*
Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.

A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.
*/

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 0, -4, -8, 941};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = temp;
        }
    }
}
