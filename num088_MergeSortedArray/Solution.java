/**
https://leetcode.com/problems/merge-sorted-array/
88. Merge Sorted Array  QuestionEditorial Solution  My Submissions
Total Accepted: 108060 Total Submissions: 355255 Difficulty: Easy
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
package algorithms.num088_MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
        	for (int i = 0; i < n; i++) nums1[i] = nums2[i];
        } else {
        	int i = m - 1, j = n - 1;
        	while (i >= 0 && j >= 0) {
        		if (nums1[i] > nums2[j]) nums1[i + j + 1] = nums1[i--];
        		else nums1[i + j + 1] = nums2[j--];
        	}
        	while (j >= 0) nums1[j] = nums2[j--];
        }
    }
}
//20160707Thu14:37 duration:29m18s05 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao