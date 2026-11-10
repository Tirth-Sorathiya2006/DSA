/*
You are given an integer n. You need to return the number of odd digits present in the number.
The number will have no leading zeroes, except when the number is 0 itself.

0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.
*/

public class Solution24 {
    public static void main(String[] args) {
        System.out.println(countOddDigits(541));
    }

    private static int countOddDigits(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 10 % 2 == 1) {
                count++;
            }

            num /= 10;
        }

        return count;
    }
}
