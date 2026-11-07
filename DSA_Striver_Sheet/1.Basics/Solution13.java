/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1 
2 3 
4 5 6
7 8 9 10 
11 12 13 14 15

Print the pattern in the function given to you.
*/

public class Solution13 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num++ + " ");
            }

            System.out.println();
        }
    }
}
