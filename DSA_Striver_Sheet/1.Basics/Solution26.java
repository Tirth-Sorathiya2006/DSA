/*
You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.
0 <= n <= 5000
n will contain no leading zeroes except when it is 0 itself.
*/

public class Solution26 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    private static boolean isPalindrome(int num) {
        int n = num;
        int rev = 0;

        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }

        return num == rev;
    }
}
