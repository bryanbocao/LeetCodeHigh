/**
https://leetcode.com/problems/3sum-smaller/
Locked Question
 */
package algorithms.num259_ThreeSumSmaller;

import java.util.Arrays;

public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
    	if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int cnt = 0, one = 0, twoSum = 0, threeSum = 0;
        boolean firstThirdLarger = true;
        for (int i = 0; i < nums.length; i++) {
        	one = nums[i];
        	for (int j = i + 1; j < nums.length; j++) {
        		twoSum = one + nums[j];
        		firstThirdLarger = true;
        		for (int k = j + 1; k < nums.length; k++) {
        			threeSum = twoSum + nums[k];
        			if (threeSum < target) {
        				cnt++;
        				firstThirdLarger = false;
        			} else 	break;
        		}
        		if (firstThirdLarger) break;
        	}
        }
        return cnt;
    }
}
//SolvedOn20160817WedAt20:11 CodingDuration:12m15s08 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
