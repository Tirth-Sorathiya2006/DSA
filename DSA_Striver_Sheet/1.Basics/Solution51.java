/*
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.
1 <= N <= 10^3
*/

public class Solution51 {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return sum(n - 1) + n;
    }
}
