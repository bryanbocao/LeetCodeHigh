/**
https://leetcode.com/problems/first-missing-positive/
41. First Missing Positive  QuestionEditorial Solution  My Submissions
Total Accepted: 70012 Total Submissions: 289068 Difficulty: Hard
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.
 */
package algorithms.num041_FirstMissingPositive;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) if (nums[i] > 0) set.add(nums[i]);
		for (int num = 1; num <= nums.length + 1; num++) if (!set.contains(num)) return num;
		return 1;
	}
}
//20160726Tue23:03 duration:13m21s04 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 