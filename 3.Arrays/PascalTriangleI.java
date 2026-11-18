/*
Given two integers r and c, return the value at the rth row and cth column (1-indexed) in a Pascal's Triangle.

In Pascal's triangle:

The first row contains a single element 1.
Each row has one more element than the previous row.
Every row starts and ends with 1.
For all interior elements (i.e., not at the ends), the value at position (r, c) is computed as the sum of the two elements directly above it from the previous row:

Pascal[r][c]=Pascal[r−1][c−1]+Pascal[r−1][c]

1 <= r, c <= 30
c <= r
All values will fit inside a 32-bit integer.
*/

public class PascalTriangleI {
    public static void main(String[] args) {
        System.out.println(pascalTriangleI(5, 3));
    }

    private static int pascalTriangleI(int row, int col) {
        int n = row - 1;
        int r = col - 1;
        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 1; i <= r; i++) {
            res *= n;
            res /= i;
            n--;
        }

        return (int)res;
    }
}
