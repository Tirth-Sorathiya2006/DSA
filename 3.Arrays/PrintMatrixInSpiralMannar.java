/*
Given an M * N matrix, print the elements in a clockwise spiral manner.
Return an array with the elements in the order of their appearance when printed in a spiral manner.

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-100 <= matrix[i][j] <= 100
*/

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixInSpiralMannar {
    public static void main(String[] args) {
        int[][] mat = new int[][] {
                { 5, 4, 7, 6 },
                { 4, 3, 2, 1 },
                { 8, 2, 3, 5 }
        };

        System.out.println(printMatrixInSpiral(mat));
    }

    private static List<Integer> printMatrixInSpiral(int[][] mat) {
        List<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {
            // move left to right
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }

            top++;
            if (top > bottom) {
                break;
            }

            // move top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }

            right--;
            if (right < left) {
                break;
            }

            // move right to left
            for (int i = right; i >= left; i--) {
                ans.add(mat[bottom][i]);
            }

            bottom--;
            if (bottom < top) {
                break;
            }

            // move bottom to top
            for (int i = bottom; i >= top; i--) {
                ans.add(mat[i][left]);
            }

            left++;
            if (left > right) {
                break;
            }
        }

        return ans;
    }
}
