/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

Print the pattern in the function given to you.
1 <= n <= 100
*/

public class Solution20 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            // print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // print spaces
            for (int col = 1; col <= 2*(n - row); col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // print new line at the end of the row
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            // print stars
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }

            // print spaces
            for (int col = 1; col <= 2*(row - 1); col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }

            // print new line at the end of the row
            System.out.println();
        }
    }
}
