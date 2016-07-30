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

public class Solution20160729Fri1721 {
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
        
        int medianI = (len1 + len2) / 2;
        if ((len1 + len2) % 2 == 0) {//even
        	if (len1 < len2) {
        		if (nums1[len1 - 1] < nums2[0]) return (double)(nums2[medianI - len1] + nums2[medianI - len1 + 1]) / 2;
        	} else if (len1 > len2) {
        		if (nums2[len2 - 1] < nums1[0]) return (double)(nums1[medianI - len2] + nums1[medianI - len2 + 1]) / 2;
        	} else {
        	    if (nums1[len1 - 1] < nums2[0]) return (double)(nums1[len1 - 1] + nums2[0]) / 2;
        	    if (nums2[len2 - 1] < nums1[0]) return (double)(nums2[len2 - 1] + nums1[0]) / 2;
        	}
        	int i = 0, i1 = 0, i2 = 0;
			boolean bi1 = false;
			System.out.println("line 25");
			while (i < medianI - 1 && i1 < len1 && i2 < len2) {
			    System.out.println("line 27 while");
				if (nums1[i1] <= nums2[i2]) {
					i = i1++;
					bi1 = true;
				} else {
					i = i2++;
					bi1 = false;
				}
			}
			if (i == medianI - 1) {
			    System.out.println("line 35");
				if (bi1) {
				    System.out.println("line 38 i i1 i2: " + i + " " + i1 + " " + i2);
					if (i + 1 < len1) return (double)(nums1[i] + nums1[i + 1]) / 2;
					else return (double)(nums1[i] + nums2[i2]) / 2;
				} else {
				    System.out.println("line 42: ");
					if (i + 1 < len2) return (double)(nums2[i] + nums2[i + 1]) / 2;
					else return (double)(nums2[i] + nums1[i1]) / 2;
				}
			}
        } else {//odd
        	if (len1 < len2) {
        		if (nums1[len1 - 1] < nums2[0]) return nums2[medianI - len1];
        	} else if (len1 > len2) {
        		if (nums2[len2 - 1] < nums1[0]) return nums1[medianI - len2];
        	}
			int i = 0, i1 = 0, i2 = 0;
			boolean bi1 = false;
			while (i < medianI - 1 && i1 < len1 && i2 < len2) {
				if (nums1[i1] <= nums2[i2]) {
					i = i1++;
					System.out.println("line 56 i: " + i);
					bi1 = true;
				} else {
					i = i2++;
					System.out.println("line 60 i: " + i);
					bi1 = false;
				}
			}
			if (i == medianI - 1) {
				if (bi1) return nums1[i];
				else return nums2[i];
			}
        }
		return 0;
    }
    
}
//20160729Fri17:21 duration:1h08m18s53 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
Runtime Error Message:
Line 6: java.lang.ArrayIndexOutOfBoundsException: 2
Last executed input:
[]
[2,3]

Runtime Error Message:
Line 47: java.lang.ArrayIndexOutOfBoundsException: -1
Last executed input:
[1]
[2,3]

Input:
[1,2]
[1,2]
Output:
2.00000
Expected:
1.50000
*/