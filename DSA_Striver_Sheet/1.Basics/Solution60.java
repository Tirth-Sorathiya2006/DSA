/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
0 <= n <= 20
*/

public class Solution60 {
    public static void main(String[] args) {
        System.out.println(fib(20));
    }

    private static int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        return fib(num - 1) + fib(num - 2);
    }
}
