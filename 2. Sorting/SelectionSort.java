/*
Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.

A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.
*/

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 0, -4, -8, 941};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }

            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }
    }
}
