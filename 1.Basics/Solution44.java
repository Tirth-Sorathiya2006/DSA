/*
You are given a string s. Return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.
1 <= s.length <= 10^5
s consist of only uppercase and lowercase English characters.
*/

public class Solution44 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
