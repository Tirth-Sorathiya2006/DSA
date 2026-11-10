/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A
BB
CCC
DDDD
EEEEE

Print the pattern in the function given to you.
1 <= n <= 26
*/

public class Solution16 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        char ch = 'A';

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
            }

            System.out.println();
            ch++;
        }
    }
}
