/*
You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.

An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
0 <= n <= 10^9
*/

public class Solution29 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    private static boolean isArmstrong(int num) {
        if (num == 0) {
            return true;
        }

        int n = num;
        int digits = (int)(Math.log10(n)) + 1;
        int sum = 0;

        while(n != 0){
            sum += (int)(Math.pow(n % 10, digits));
            n /= 10;
        }

        return sum == num;
    }
}
