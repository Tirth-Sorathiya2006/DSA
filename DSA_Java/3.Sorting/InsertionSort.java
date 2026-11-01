import java.util.Arrays;

/*
    Stable sorting algorithm
    O(n^2)
*/
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 8, 7, -8, 9, 74, 5, 2, 0, -8, -7 };

        System.out.println("Before sorting = " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("After sorting = " + Arrays.toString(nums));
    }

    static void insertionSort(int[] nums) {
        // check if array is null
        if (nums == null) {
            return;
        }

        // considoring the array in to sorted and unsorted part
        // initially the first element of the array is assume to sorted
        // peak the element from the unsorted part and place it to it's correct position in the sorted half
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i]; // chose num for which we want to find correct place
            int j = i - 1;
            
            // shifting element to the right which are bigger than the num
            while (j >= 0 && nums[j] > num) {
                nums[j + 1] = nums[j];
                j--;
            }

            // put the num to it's correct place
            nums[j + 1] = num;
        }
    }
}
