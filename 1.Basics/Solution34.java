/*
You are given two integers n1 and n2. You need find the Lowest Common Multiple (LCM) of the two given numbers. Return the LCM of the two numbers.

The Lowest Common Multiple (LCM) of two integers is the lowest positive integer that is divisible by both the integers.
1 <= n1, n2 <= 1000
*/

public class Solution34 {
    public static void main(String[] args) {
        System.out.println(lcm(54, 21));
    }

    private static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
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
