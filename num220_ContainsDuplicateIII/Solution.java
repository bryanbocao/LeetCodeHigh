/**
https://leetcode.com/problems/contains-duplicate-iii/
220. Contains Duplicate III My Submissions QuestionEditorial Solution
Total Accepted: 31109 Total Submissions: 163840 Difficulty: Medium
Given an array of integers, find out whether there are two distinct indices i and j in the array such that the difference between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
 */
package algorithms.num220_ContainsDuplicateIII;

import java.util.Arrays;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		if (Math.abs((long)nums[j] - (long)nums[i]) <= t && j - i <= k) return true;
        	}
        }
        return false;
    }
}
//20160630Thu13:46 duration:7m19s36 TimeLimitExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao