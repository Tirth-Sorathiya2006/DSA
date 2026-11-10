/*
Given an array of n integers, find the second most frequent element in it.
If there are multiple elements that appear second most frequent times, find the smallest of them.
If second most frequent element does not exist return -1.
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/

// ============================================================================
//                              BUG IN THIS CODE
// ============================================================================

import java.util.Map;
import java.util.HashMap;

public class Solution41 {
    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 7, 7, 5, 5, 8, 8, 8};
        System.out.println(secondMostFreq(nums));
    }

    private static int secondMostFreq(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int highestFreq = 0;
        int largest = 0;
        int secondHighestFreq = 0;
        int secondLargest = 0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            int num = pair.getKey();
            int freq = pair.getValue();

            if (freq > highestFreq) {
                secondHighestFreq = highestFreq;
                highestFreq = freq;

                secondLargest = largest;
                largest = num;
            }

            else if (freq > secondHighestFreq && freq < highestFreq) {
                secondHighestFreq = freq;
                secondLargest = num;
            }

            else if (freq == secondHighestFreq && num < secondLargest) {
                secondLargest = num;
            }
        }

        return secondHighestFreq == 0 ? -1 : secondLargest;
    }
}