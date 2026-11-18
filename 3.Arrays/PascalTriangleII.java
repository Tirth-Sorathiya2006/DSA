/*
Given an integer r, return all the values in the rth row (1-indexed) in Pascal's Triangle in correct order.

In Pascal's triangle:

The first row has one element with a value of 1.
Each row has one more element in it than its previous row.
The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.

1 <= r <= 30
All values will fit inside a 32-bit integer.
*/

import java.util.Arrays;

public class PascalTriangleII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pascalTriangleII(5)));
    }

    private static int[] pascalTriangleII(int row) {
        int[] ans = new int[row];

        for (int col = 1; col <= row; col++) {
            ans[col - 1] = getPascalValue(row, col);
        }

        return ans;
    }

    private static int getPascalValue(int row, int col) {
        long res = 1;
        int n = row - 1;
        int r = Math.min(col - 1, row - col);

        for (int i = 1; i <= r; i++) {
            res *= n;
            res /= i;
            n--;
        }

        return (int)res;
    }
}
