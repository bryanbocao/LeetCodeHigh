/**
https://leetcode.com/problems/contains-duplicate-ii/
219. Contains Duplicate II My Submissions QuestionEditorial Solution
Total Accepted: 64276 Total Submissions: 211082 Difficulty: Easy
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
package algorithms.num219_ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) {
        		if (i - map.get(nums[i]) <= k) return true;
        	}
        	map.put(nums[i], i);
        }
        return false;
    }
}
//20160628Tue12:47 duration:5m02s39 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao