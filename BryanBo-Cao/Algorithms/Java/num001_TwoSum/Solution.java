/**
https://leetcode.com/problems/two-sum/
1. Two Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 263740 Total Submissions: 1051214 Difficulty: Easy
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
UPDATE (2016/2/13):
The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */
package algorithms.num001_TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
			else map.put(nums[i], i);
		}
		return new int[2];
	}
}
//20160726Tue23:29 duration:6m53s73 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 