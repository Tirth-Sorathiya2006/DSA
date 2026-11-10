/*
Given an integer n, return the factorial of n.

Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n (use 64-bits to return answer).

0 <= n <= 15
*/

public class Solution52 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static long factorial(int n) {
        if (n == 0L || n == 1L) {
            return 1L;
        }

        return factorial(n - 1) * n;
    }
}
