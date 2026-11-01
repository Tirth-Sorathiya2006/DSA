import java.util.Arrays;

/*
    Stable sorting algorithm
    O(n^2)
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 8, 7, -8, 9, 74, 5, 2, 0, -8, -7 };

        System.out.println("Before sorting = " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("After sorting = " + Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        // check if array is null
        if (nums == null) {
            return;
        }

        // keep the track that any pair swapped or not
        boolean isSwapped = false;

        // check adjsunt elements and swap if not in sorted order
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

            // if in pass there is no swap then array is sorted already so break loop
            if (!isSwapped) {
                break;
            }
        }
    }
}