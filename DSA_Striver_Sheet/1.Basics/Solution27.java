/*
You are given an integer n. Return the largest digit present in the number.
0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.
*/

public class Solution27 {
    public static void main(String[] args) {
        System.out.println(largestDigit(451));
    }

    private static int largestDigit(int num) {
        int largest = 0;

        while(num != 0) {
            largest = Math.max(largest, num % 10);
            num /= 10;
        }

        return largest;
    }
}
