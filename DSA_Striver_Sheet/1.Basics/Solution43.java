/*
Given a string, the task is to reverse it. The string is represented by an array of characters s.
Perform the reversal in place with O(1) extra memory.
Note: no need to return anything, modify the given list.

1 <= s.length <= 10^5
s consist of only lowercase and uppercase English characters.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution43 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('p');
        list.add('p');
        list.add('l');
        list.add('e');

        reverseString(list);
        System.out.println(list);
    }

    private static void reverseString(List<Character> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            char temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}