/*
268. Missing Number My Submissions QuestionEditorial Solution
Total Accepted: 54122 Total Submissions: 133068 Difficulty: Medium
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
package algorithms.num268_MissingNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) list.add(i);
        for (int i = 0; i < nums.length; i++) if (list.contains(nums[i])) list.remove(new Integer(nums[i]));
        if (list.size() > 0) return list.get(0);
        return nums.length;
    }
}
//20160604Sat duration: 28m23s97 ACCEPTED @BryanBo-Cao 