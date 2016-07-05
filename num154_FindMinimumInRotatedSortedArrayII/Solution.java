/**
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
154. Find Minimum in Rotated Sorted Array II  QuestionEditorial Solution  My Submissions
Total Accepted: 54584
Total Submissions: 156562
Difficulty: Hard
Follow up for "Find Minimum in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.
 */
package algorithms.num154_FindMinimumInRotatedSortedArrayII;

public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        else if (len == 1) return nums[0];
        else if (len == 2) return nums[0] < nums[1] ? nums[0] : nums[1];
        else {
        	int fi = 0, li = len - 1;
        	while (fi < len && nums[fi] >= nums[li]) {
        	    if (nums[fi] == nums[li]) fi++;
        	    else {
        	        int mid = (fi + li) / 2;
        	    	if (nums[mid] > nums[li]) {
        	    	    fi = mid + 1;
        	    	    if (nums[fi] == nums[li]) return nums[fi];
        	    	} else if (nums[fi] > nums[mid]) {
        	    	    if (fi == mid - 1) return nums[mid];
        	    	    else li = mid;
        	    	}
        	    }

        	}
        	if (fi == len) return nums[len - 1];
        	else return nums[fi];
        }
    }
}
//20160705Tue11:50 duration:23m29s45 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao