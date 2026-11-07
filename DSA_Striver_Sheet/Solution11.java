/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

Print the pattern in the function given to you.
1 <= n <= 100
*/

public class Solution11 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if ((col + row) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println();
        }
    }
}