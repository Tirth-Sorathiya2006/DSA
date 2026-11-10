/*
Given an array of n integers, find the sum of the frequencies of the highest occurring number and lowest occurring number.
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

import java.util.Map;
import java.util.HashMap;

public class Solution42 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 5, 5, 7};
        System.out.println(sumOfHighestAndLowest(nums));
    }

    private static int sumOfHighestAndLowest(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int lowestFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer>  pair : map.entrySet()) {;
            int freq = pair.getValue();

            if (freq > highestFreq) {
                highestFreq = freq;
            }

            if (freq < lowestFreq) {
                lowestFreq = freq;
            }
        }

        return highestFreq + lowestFreq;
    }
}
