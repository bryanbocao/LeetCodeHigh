/**
https://leetcode.com/problems/single-number/
136. Single Number My Submissions QuestionEditorial Solution
Total Accepted: 133476 Total Submissions: 264774 Difficulty: Medium
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
package algorithms.num136_SingleNumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (set.contains(nums[i])) set.remove(nums[i]);
        	else set.add(nums[i]);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
}
//20160616Thu10:42 duration:5m49s55 Accepted @github.com/BryanBo-Cao
