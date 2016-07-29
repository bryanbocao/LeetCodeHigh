/**
https://leetcode.com/problems/median-of-two-sorted-arrays/
4. Median of Two Sorted Arrays  QuestionEditorial Solution  My Submissions
Total Accepted: 105143 Total Submissions: 542336 Difficulty: Hard
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
package algorithms.num004_MedianOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len1 = nums1.length, len2 = nums2.length;
        if (len1 == 0) {
        	if (len2 % 2 == 1) return nums2[len2 / 2];
        	else return (double)(nums2[len2 / 2 - 1] + nums2[len2 / 2]) / 2;
        }
        if (len2 == 0) {
        	if (len1 % 2 == 1) return nums1[len1 / 2];
        	else return (double)(nums1[len1 / 2 - 1] + nums1[len1 / 2]) / 2;
        }
        
        int medianI = (len1 + len2) / 2 ;
        List<Integer> ls1 = new ArrayList<Integer>(),
        		ls2 = new ArrayList<Integer>();
        for (int i = 0; i < len1; i++) ls1.add(nums1[i]);
        for (int i = 0; i < len2; i++) ls2.add(nums2[i]);
        ls1.addAll(ls2);
        Collections.sort(ls1);
        if ((len1 + len2) % 2 == 0) return (double)(ls1.get(medianI - 1) + ls1.get(medianI)) / 2;
        else return ls1.get(medianI);
    }
}

//20160729Fri17:29 duration:1h11m52s03 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
