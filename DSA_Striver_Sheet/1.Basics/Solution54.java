/*
Given an input string as an array of characters, write a function that reverses the string.
1 <= s.length <= 10^3
s consist of only lowercase and uppercase English characters.
*/

import java.util.ArrayList;

public class Solution54 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        list.add('a');
        list.add('p');
        list.add('p');
        list.add('l');
        list.add('e');

        System.out.println(reverse(list));
    }

    private static ArrayList<Character> reverse(ArrayList<Character> list) {
        ArrayList<Character> ans = new ArrayList<>();
        return reverseHelper(list, list.size() - 1, ans);
    }

    private static ArrayList<Character> reverseHelper(ArrayList<Character> list, int idx, ArrayList<Character> ans) {
        if (idx == -1) {
            return ans;
        }

        ans.add(list.get(idx));
        return reverseHelper(list, idx - 1, ans);
    }
}
