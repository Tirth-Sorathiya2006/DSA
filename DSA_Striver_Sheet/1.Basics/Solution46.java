/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
1 <= str.length <= 200
1 <= str[i].length <= 200
str[i] contains only lowercase English letters.
*/

import java.util.Arrays;

public class Solution46 {
    public static void main(String[] args) {
        String[] strs = { "flowers", "flow", "fly", "flight" };
        System.out.println(commonPrefix(strs));
    }

    private static String commonPrefix(String[] strs) {
        // sort the array of string
        Arrays.sort(strs);

        // take two strings first and last
        String first = strs[0];
        String last = strs[strs.length - 1];

        // build the prefix string
        StringBuilder sb = new StringBuilder();

        int left = 0, right = 0;
        while (left < first.length() && right < last.length()) {
            char leftChar = first.charAt(left);
            char rightChar = last.charAt(right);

            if (leftChar == rightChar) {
                sb.append(leftChar);
            } else {
                break;
            }

            left++;
            right++;
        }

        return sb.toString();
    }
}
