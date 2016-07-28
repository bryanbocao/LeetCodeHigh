/**
https://leetcode.com/problems/single-number-ii/
137. Single Number II  QuestionEditorial Solution  My Submissions
Total Accepted: 90707 Total Submissions: 234974 Difficulty: Medium
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
package algorithms.num137_SingleNumerII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (map.containsKey(nums[i])) {
        		if (map.get(nums[i]) == 2) map.remove(nums[i]);
        		else map.put(nums[i], map.get(nums[i]) + 1);
        	} else map.put(nums[i], 1);
        }
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (map.get(num) == 1) return num; 
        }
        return -1;
    }
}
//20160727Wed22:46 duration:12m50s97 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 