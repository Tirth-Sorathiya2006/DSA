/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    *
   ***
  *****
 *******
*********

Print the pattern in the function given to you.
1 <= n <= 100
*/

public class Solution7 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            // print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 1; col <= 2*row - 1; col++) {
                System.out.print("*");
            }

            // print newline at the end of row
            System.out.println();
        }
    }

    
}
