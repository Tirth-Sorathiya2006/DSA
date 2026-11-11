/*
Given an array of integers, nums,sort the array in non-decreasing order using the merge sort algorithm. Return the sorted array.

A sorted array in non-decreasing order is one in which each element is either greater than or equal to all the elements to its left in the array.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5, 7, 8, 0, -4, -8, 941};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private static void merge(int[] nums, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;

        List<Integer> list = new ArrayList<>();

        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                list.add(nums[left++]);
            } else {
                list.add(nums[right++]);
            }
        }

        while (left <= mid) {
            list.add(nums[left++]);
        }

        while (right <= end) {
            list.add(nums[right++]);
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i + start] = list.get(i);
        }
    }
}
