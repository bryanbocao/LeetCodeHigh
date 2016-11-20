package smarkingAlgorithmContest4.problem4.num456_132Pattern;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean find132pattern(int[] nums) {
    	List<Integer> ls = new ArrayList<Integer>();
        if (nums.length >= 3) {
            int minI = 0, maxI = 0, minTI = 0, maxTI = 0;
            for (int i = 1; i < nums.length; i++) {
            	if (i == nums.length - 1 && (chkMaxMinInLs(nums, ls, i) || (minTI < maxTI && nums[minTI] < nums[i] && nums[maxTI] > nums[i]))) return true;
            	if (nums[minI] < nums[i] && nums[maxI] > nums[i] && (chkMaxMinInLs(nums, ls, i) || (minTI < maxTI && nums[minTI] < nums[i] && nums[maxTI] > nums[i]))) return true;
            	if (nums[minTI] >= nums[i]) {
            		if (minTI < maxTI) {
            			ls.add(minTI); ls.add(maxTI);
            		}
            		minTI = i; maxTI = i;
            	} else if (nums[maxTI] < nums[i]) maxTI = i;
            	if (nums[maxI] < nums[i]) maxI = i;
            	if (nums[minI] > nums[i]) minI = i;
            	System.out.println();
            }
        }
        return false;
    }
    
    private static boolean chkMaxMinInLs(int[] nums, List<Integer> ls, int i) {
    	int n = nums[i];
    	for (int ii = 0; ii < ls.size(); ii += 2) if (nums[ls.get(ii)] < n && nums[ls.get(ii + 1)] > n) return true; 
    	return false;
    }
}
//https://leetcode.com/contest/smarking-algorithm-contest-4/problems/132-pattern/
//SolvedOn20161112Sat CodingDuration:1h25m56s33 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao