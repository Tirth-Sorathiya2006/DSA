import java.util.Arrays;

/*
    Un-Stable sorting algorithm
    O(n^2)
*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 8, 7, -8, 9, 74, 5, 2, 0, -8, -7 };

        System.out.println("Before sorting = " + Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("After sorting = " + Arrays.toString(nums));
    }

    static void selectionSort(int[] nums) {
        // check if array is null
        if (nums == null) {
            return;
        }

        // assuming array as a two part first is sorted and second is unsorted
        // take the smallest element from the unsorted part and swap it with the last element of the unsorted part
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            // swap min element with the ith (last element in the sorted part)
            int temp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = temp;
        }
    }
}
