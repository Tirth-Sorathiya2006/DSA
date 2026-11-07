/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5

Print the pattern in the function given to you.
1 <= n <= 100
*/

public class Solution22 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= 2*n - 1; row++) {
            for (int col = 1; col <= 2*n - 1; col++) {
                int num = n - Math.min(Math.min(row - 1, col - 1), Math.min(2*n - col - 1, 2*n - row - 1));
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
