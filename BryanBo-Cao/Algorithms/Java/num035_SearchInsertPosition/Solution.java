/**
https://leetcode.com/problems/search-insert-position/
35. Search Insert Position  QuestionEditorial Solution  My Submissions
Total Accepted: 114240
Total Submissions: 301280
Difficulty: Medium
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
package algorithms.num035_SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        else if (nums.length == 1) {
        	if (target <= nums[0]) return 0;
        	else return 1;
        } else if (target < nums[0]) return 0;
        else if (target > nums[nums.length - 1]) return nums.length;
        else {
        	int min = 0, max = nums.length - 1, mid = 0;
        	while (min <= max) {
        		mid = (min + max) / 2;
        		System.out.println("mid: " + mid);
        		if (target == nums[mid]) return mid;
        		else if (target < nums[mid]) {
        			System.out.println("target < nums[mid]");
        			max = mid - 1;
        		}
        		else {
        			System.out.println("target > nums[mid]");
        			min = mid + 1;
        		}
        	}
        	mid = (min + max) / 2;
        	if (min == max) {
        		System.out.println("min == max");
        		return min;
        	}
        	else {
        		System.out.println("min > max");
        		return min;
        	}
        }
    }
}
//20160720Wed16:55 duration:24m11s74 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao