/*
Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
The rotation must be done in place, meaning the input 2D matrix must be modified directly.

n == matrix.length.
n == matrix[i].length.
1 <= n <= 100.
-10^4 <= matrix[i][j] <= 10^4
*/

import java.util.Arrays;

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    private static void rotateMatrix(int[][] mat) {
        int n = mat.length;

        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }

        for (int row = 0; row < n; row++) {
            reverseRow(mat[row]);
        }
    }

    private static void reverseRow(int[] row) {
        int start = 0, end = row.length - 1;

        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;

            start++;
            end--;
        }
    }
}
