/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

Print the pattern in the function given to you.
1 <= n <= 26
*/

public class Solution17 {
    public static void main(String[] args) {
        printPattern(26);
    }

    private static void printPattern(int n) {
        
        for (int row = 1; row <= n; row++) {
            char ch = 'A';

            // print spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // print characters in ascending order
            for (int col = 1; col <= row; col++) {
                System.out.print(ch++);
            }

            // decresing ch by two 
            ch -= 2;

            // printing characters in descending order
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(ch--);
            }

            // print new line at the end of the row
            System.out.println();
        }
    }
}
