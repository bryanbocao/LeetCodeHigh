/**
https://leetcode.com/problems/kth-largest-element-in-an-array/
215. Kth Largest Element in an Array My Submissions QuestionEditorial Solution
Total Accepted: 62263 Total Submissions: 182119 Difficulty: Medium
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

For example,
Given [3,2,1,5,6,4] and k = 2, return 5.

Note: 
You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
package algorithms.num215_KthLargestElementInAnArray;

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
    	Arrays.sort(nums);
    	for (int i = nums.length - 1; i >= 0; i--) {
    		if (--k == 0) return nums[i];
    	}
    	return 0;
    }
}
//20160628Tue13:16 duration:5m35s18 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao