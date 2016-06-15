/**
 * 153. Find Minimum in Rotated Sorted Array My Submissions QuestionEditorial Solution
Total Accepted: 96015 Total Submissions: 261733 Difficulty: Medium
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
package algorithms.num153_FindMinimumInRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        else if (len == 1) return nums[0];
        else if (len == 2) return nums[0] < nums[1] ? nums[0] : nums[1];
        else {
        	int fi = 0, li = len - 1;
        	while (nums[fi] > nums[li]) {
        		int mid = (fi + li) / 2;
        		if (nums[fi] > nums[mid]) li = mid - 1;
        		else if (nums[mid] > nums[li]) fi = mid + 1;
        	}
        	return nums[fi];
        }
    }
}
//20160615Wed14:58 duration:26m03s44 Accepted @BryanBo-Cao