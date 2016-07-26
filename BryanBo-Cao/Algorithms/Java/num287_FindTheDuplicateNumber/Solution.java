/**
https://leetcode.com/problems/find-the-duplicate-number/
287. Find the Duplicate Number My Submissions QuestionEditorial Solution
Total Accepted: 31083 Total Submissions: 78855 Difficulty: Hard
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */
package algorithms.num287_FindTheDuplicateNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (set.contains(nums[i])) return nums[i];
        	else set.add(nums[i]);
        }
        return 0;
    }
}
//20160622Wed14:12 duration:4m12s10 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao