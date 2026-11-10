/*
Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
1 <= s.length <= 10^3
s.length == t.length
s and t consist of only lowercase English letters.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution47 {
    public static void main(String[] args) {
        System.out.println(isomorphic("apple", "bbnbm"));
    }

    private static boolean isomorphic(String str1, String str2) {
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (mapST.containsKey(ch1) && mapST.get(ch1) != ch2) {
                return false;
            } else{
                mapST.put(ch1, ch2);
            }

            if (mapTS.containsKey(ch2) && mapTS.get(ch2) != ch1) {
                return false;
            } else {
                mapTS.put(ch2, ch1);
            }
        }

        return true;
    }
}
