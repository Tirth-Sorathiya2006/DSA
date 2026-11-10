/*
Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. If there are multiple elements that appear a maximum number of times, find the smallest of them.

Please note that this section might seem a bit difficult without prior knowledge on what hashing is, we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!

1 <= n <= 10^5
1 <= nums[i] <= 10^4
*/

import java.util.Map;
import java.util.HashMap;

public class Solution40 {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 7, -7, -7, 9, 9, 2, 2, 2 };
        System.out.println(mostFrequent(nums));
    }

    private static int mostFrequent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mostFreqElement = 0;
        int highestFreq = 0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int num = pair.getKey();
            int freq = pair.getValue();

            if (freq > highestFreq) {
                highestFreq = freq;
                mostFreqElement = num;
            }

            else if (freq == highestFreq && num < mostFreqElement) {
                mostFreqElement = num;
            }
        }

        return mostFreqElement;
    }
}
