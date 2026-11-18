/*
Given an integer n, return the first n (1-Indexed) rows of Pascal's triangle.

In Pascal's triangle:

The first row has one element with a value of 1.
Each row has one more element in it than its previous row.
The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.

1 <= n <= 30
All values will fit inside a 32-bit integer.
*/

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleIII {
    public static void main(String[] args) {
        System.out.println(printPascalTriangle(5));
    }

    private static List<List<Integer>> printPascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            List<Integer> temp = new ArrayList<>();

            for (int col = 1; col <= row; col++) {
                temp.add(getPascalValue(row, col));
            }

            ans.add(temp);
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

        return (int) res;
    }
}
