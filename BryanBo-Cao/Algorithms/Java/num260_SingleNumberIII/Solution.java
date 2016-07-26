/*
 * 260. Single Number III My Submissions QuestionEditorial Solution
Total Accepted: 36526 Total Submissions: 81985 Difficulty: Medium
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
package algorithms.num260_SingleNumberIII;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
        	if (set.contains(nums[i])) set.remove(nums[i]);
        	else set.add(nums[i]);
        }
        int[] result = new int[2];
        Iterator<Integer> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
        	result[i++] = it.next();
        }
        return result;
    }
}
//20160607Tue21:13 duration:18m47s82 ACCEPTED @BryanBo-Cao