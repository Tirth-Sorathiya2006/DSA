/*
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.

The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.

1 <= nums1.length, nums2.length <= 1000
-10^4 <= nums1[i] , nums2[i] <= 10^4
Both nums1 and nums2 are sorted in non-decreasing order
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = {-8, -8, -8, 0, 7, 7, 14};
        int[] nums2 = {8, 12, 27};

        System.out.println(Arrays.toString(union(nums1, nums2)));
    }

    private static int[] union(int[] nums1, int[] nums2) {
        List<Integer> unionList = new ArrayList<>();

        int first = 0, second = 0;
        int m = nums1.length, n = nums2.length;
        
        while (first < m && second < n) {
            int current;

            if (nums1[first] <= nums2[second]) {
                current = nums1[first++];
            } else {
                current = nums2[second++];
            }

            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != current) {
                unionList.add(current);
            }
        }

        while (first < m) {
            int current = nums1[first++];
            
            if (unionList.get(unionList.size() - 1) != current) {
                unionList.add(current);
            }
        }

        while (second < n) {
            int current = nums2[second++];
            
            if (unionList.get(unionList.size() - 1) != current) {
                unionList.add(current);
            }
        }

        int[] ans = new int[unionList.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = unionList.get(k);
        }

        return ans;
    }
}
