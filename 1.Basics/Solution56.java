/*
Given an integer num, return true if it is prime otherwise false.
A prime number is a number that is divisible only by 1 and itself.
1 <= num <= 10^4
*/

public class Solution56 {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    private static boolean isPrime(int n) {
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n, int i) {
        if (n == 1) {
            return false;
        }

        if (i*i > n) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return isPrimeHelper(n, i + 1);
    }
}
