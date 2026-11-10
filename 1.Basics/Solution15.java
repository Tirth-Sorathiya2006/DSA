/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

ABCDE
ABCD
ABC
AB
A

Print the pattern in the function given to you.
1 <= n <= 26
*/

public class Solution15 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            char ch = 'A';

            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print(ch++);
            }

            System.out.println();
        }
    }
}
