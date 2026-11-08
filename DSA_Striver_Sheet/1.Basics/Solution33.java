/*
You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.

The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.
1 <= n1, n2 <= 1000
*/

public class Solution33 {
    public static void main(String[] args) {
        System.out.println(gcd(14, 21));
    }

    private static int gcd(int num1, int num2) {
        int a = num1 > num2 ? num1 : num2;
        int b = num1 > num2 ? num2 : num1;

        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}
