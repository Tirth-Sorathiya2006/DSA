/*
Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays. Each element in the result must appear as many times as it appears in both arrays; that is, if an element appears x times in nums1 and y times in nums2, it should appear min(x, y) times in the result.

The intersection of two arrays is an array where all values are present in both arrays. Since both input arrays are sorted, the resulting intersection array should also be in sorted order.

1 <= nums1.length, nums2.length <= 1000
-10^4 <= nums1[i], nums2[i] <= 10^4
Both nums1 and nums2 are sorted in non-decreasing order.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 3, 3 };
        int[] nums2 = { 2, 3, 3, 4, 5, 7 };

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        int first = 0, second = 0;
        int m = nums1.length, n = nums2.length;
        List<Integer> intersectionList = new ArrayList<>();

        while (first < m && second < n) {
            if (nums1[first] < nums2[second]) {
                first++;
            } else if (nums1[first] > nums2[second]) {
                second++;
            } else {
                intersectionList.add(nums1[first++]);
                second++;
            }
        }

        int[] ans = new int[intersectionList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = intersectionList.get(i);
        }

        return ans;
    }
}
