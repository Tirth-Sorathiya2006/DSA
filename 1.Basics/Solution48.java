/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

1 <= s.length <= 100
1 <= goal.length <= 100
s and goal consist of only lowercase English letters.
*/

public class Solution48 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }

    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        s = s + s;
        return s.contains(goal);
    }
}
