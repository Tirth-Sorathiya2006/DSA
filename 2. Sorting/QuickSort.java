/*
Given an array of integers called nums, sort the array in non-decreasing order using the quick sort algorithm and return the sorted array.

A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.
*/

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 8, 0, -4, -8, 941, 5, 8 };
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIdx = pivot(nums, start, end);
        quickSort(nums, start, pivotIdx - 1);
        quickSort(nums, pivotIdx + 1, end);
    }

    private static int pivot(int[] nums, int start, int end) {
        int pivot = nums[start];
        int left = start;
        int right = end;

        while (left < right) {
            while (left <= end && nums[left] <= pivot) {
                left++;
            }

            while (right >= start && nums[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }

        int temp = nums[right];
        nums[right] = nums[start];
        nums[start] = temp;

        return right;
    }

}
