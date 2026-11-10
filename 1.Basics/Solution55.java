/*
Given a string s, return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.
1 <= s.length <= 10^3
s consist of only uppercase and lowercase English characters.
*/

public class Solution55 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("asad"));
    }

    private static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindromeHelper(str, left + 1, right - 1);
    }
}
