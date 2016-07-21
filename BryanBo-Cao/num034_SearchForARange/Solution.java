/**
https://leetcode.com/problems/search-for-a-range/
34. Search for a Range  QuestionEditorial Solution  My Submissions
Total Accepted: 91366 Total Submissions: 307445 Difficulty: Medium
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
package algorithms.num034_SearchForARange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int len = nums.length;
    	if (len == 0) return new int[]{-1, -1};
    	else if (len == 1) {
    		if (nums[0] == target) return new int[]{0, 0};
    		else return new int[]{-1, -1};
    	} else {//len > 1
    		int min = 0, max = len - 1, mid = 0;
    		boolean found = false;
    		int[] result = new int[]{-1, -1};
    		while (min <= max) {
    			mid = (min + max) / 2;
    			if (nums[mid] == target) {
    				found = true;
    				break;
    			} else if (nums[mid] < target) min = mid + 1;
    			else max = mid - 1; //nums[mid] > target
    		}
    		if (found) {
    			int head = mid, tail = mid;
    			while (head >= 0 && nums[head] == target) head--;
    			while (tail < len && nums[tail] == target) tail++;
    			result[0] = head + 1;
    			result[1] = tail - 1;
    			return result;
    		} else return result;
    	}
    }
}
//20160721Thu13:19 duration:14m33s39 Accepted(ImprovementsCouldBeMadeAfterTheTargetWasFound) @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao