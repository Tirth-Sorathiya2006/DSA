/*
Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.

The number returned should not have leading zero's. But the given input string may have leading zero. (If no odd number is found, then return empty string.)
1 <= s.length <= 10^3
'0' <= s[i] <= '9'
*/

public class Solution45 {
    public static void main(String[] args) {
        System.out.println(largestOdd("0001427544442"));
    }

    private static String largestOdd(String str) {
        // removing leading zeros
        int start = 0;
        int right = str.length() - 1;

        while (start < str.length() && str.charAt(start) == '0') {
            start++;
        }

        // check for the right most odd number
        while (right >= 0 && (str.charAt(right) - '0') % 2 == 0) {
            right--;
        }

        // check for valid range
        if (start <= right) {
            return str.substring(start, right + 1);
        }

        return "";
    }
}
