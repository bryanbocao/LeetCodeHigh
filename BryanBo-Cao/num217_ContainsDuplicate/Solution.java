/*
 * 217. Contains Duplicate My Submissions QuestionEditorial Solution
Total Accepted: 93957 Total Submissions: 225186 Difficulty: Easy
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
package algorithms.num217_ContainsDuplicate;

import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < set.size(); i++) {
        	System.out.println(nums[i]);
        	if (set.contains(nums[i])) return true;
        	else set.add(nums[i]);
        }
        return false;
    }
}
//20160606Mon11:26 @BryanBo-Cao