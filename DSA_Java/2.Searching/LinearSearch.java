import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        // int[] arr = {4, 7, 8, 5, 7, -8, 9, 0};
        // System.out.println(linearSearch(arr, 5));
        // System.out.println(linearSearchInRange(arr, 5, 1, 5));

        // String name = "Tirth Sorathiya";
        // System.out.println(searchInString(name, 'a'));

        // System.out.println(min(arr));

        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {-8, 7, 5}};
        System.out.println(Arrays.toString(searchIn2DArray(mat, 5)));
        
    }

    static int linearSearch(int[] nums, int target) {
        // check for empty array input
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // go to each index one by one compare it with target element if found then
        // return that index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        // if target element is not found in entier array then return -1
        return -1;
    }

    static int linearSearchInRange(int[] nums, int target, int start, int end) {
        // check for empty array input
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // check for invalid range input
        int n = nums.length;
        if(start < 0 || end < 0 || start >= n || end >= n || start > end) {
            return -1;
        }

        // go to each index one by one compare it with target in given range if element found then return that index
        for (int i = start; i <= end; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        // if target element is not found in entier array then return -1
        return -1;
    }

    static int searchInString(String str, char target){
        // check for empty string input
        if (str == null || str.length() == 0) {
            return -1;
        }

        // go to each index one by one compare it with target if element found then return that index
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        // if target element is not found in entier string then return -1
        return -1;
    }

    static int min(int[] nums){
        // check for empty array input
        if(nums == null || nums.length == 0){
            return -1;
        }

        // // ========== traditional way of calculating min element ==========
        // int minElement = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     if(minElement > nums[i]) {
        //         minElement = nums[i];
        //     }
        // }

        // // return minimum element
        // return minElement;

        // ========== sort way in mordarn java ===========
        return Arrays.stream(nums).min().getAsInt();
    }

    static int[] searchIn2DArray(int[][] nums, int target){
        // check for empty array input
        if(nums == null || nums.length == 0){
            return new int[] {-1, -1};
        }

        // iterate through each row
        for (int row = 0; row < nums.length; row++) {
            
            // check if row is null then go to next row
            if(nums[row] == null){
                continue;
            }

            // if row is not null then iterate through each element and try to find target
            for (int col = 0; col < nums[row].length; col++) {
                if(nums[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }

        // if target is not found in 2D array then return [-1, -1]
        return new int[] {-1, -1};
    }
}
