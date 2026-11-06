/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*
**
***
****
*****
****
***
**
*

Print the pattern in the function given to you.
*/

public class Solution10 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        // printing upper triangle
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // printing lower triangle
        for (int row = 1; row <= n - 1; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
