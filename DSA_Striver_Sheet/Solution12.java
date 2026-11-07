/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1        1
12      21
123    321
1234  4321
1234554321 

Print the pattern in the function given to you.
1 <= n <= 100
*/

public class Solution12 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            // print numbers in ascending order
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // print spaces
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            // print numbers in descending order
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }

            // print new line at the end of the row
            System.out.println();
        }

    }
}
