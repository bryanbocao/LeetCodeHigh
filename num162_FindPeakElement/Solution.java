/**
https://leetcode.com/problems/find-peak-element/
162. Find Peak Element  QuestionEditorial Solution  My Submissions
Total Accepted: 72815 Total Submissions: 215994 Difficulty: Medium
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

click to show spoilers.

Note:
Your solution should be in logarithmic complexity.
 */
package algorithms.num162_FindPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        else if (nums.length > 0) {
        	if (nums[0] > nums[1]) return 0;
        	else if (nums[nums.length - 1] > nums[nums.length -2]) return nums.length - 1;
        	else {
        		for (int i = 1; i < nums.length; i++) {
        			if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
        		}
        	}
        }
        return 0;
    }
}
//20160718Mon23:51 duration:17m45s70 Accepted duration:7m11s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao