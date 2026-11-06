/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

12345
1234
123
12
1

Print the pattern in the function given to you.
1 <= n <= 100
*/

public class Solution6 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }

    
}
