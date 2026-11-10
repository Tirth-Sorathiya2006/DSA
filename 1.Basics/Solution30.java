/*
You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.

A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.
1 <= n <= 5000
*/

public class Solution30 {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
    }

    private static boolean isPerfect(int num) {
        if (num == 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i*i <= num; i++) {
            if(num % i == 0) {
                sum += i;

                if((num / i != num) && (num / i != i)) {
                    sum += num / i;
                }
            }
        }

        return num == sum;
    }
}