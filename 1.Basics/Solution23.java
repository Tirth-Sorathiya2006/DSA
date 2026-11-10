/*
You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.

0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.
*/

public class Solution23 {
    public static void main(String[] args) {
        System.out.println(countDigits(-5441));
    }

    private static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
