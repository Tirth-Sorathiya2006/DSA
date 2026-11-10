/*
You are given an integer n. Return the value of n! or n factorial.
Factorial of a number is the product of all positive integers less than or equal to that number.
0 <= n <= 10
*/

public class Solution28 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    private static int factorial(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
