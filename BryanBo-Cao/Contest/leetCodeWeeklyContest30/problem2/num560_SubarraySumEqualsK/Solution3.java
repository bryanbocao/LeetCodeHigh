package leetCodeWeeklyContest30.problem2.num560_SubarraySumEqualsK;

public class Solution3 {
    public int subarraySum(int[] nums, int k) {
    	int len = nums.length;
        if (nums == null || nums.length == 0) return 0;
        int sum = 0, cnt = 0;
        int[] fnsum = new int[len];
        for (int i = 0; i < len; i++) {
        	if (i == 0) fnsum[i] = nums[i];
        	else fnsum[i] = nums[i] + fnsum[i - 1];
        	if (fnsum[i] == k) cnt++;
        }
        
    }
}
/*
Input:
[1]
0
Output:
1
Expected:
0

Input:
[-1,-1,1]
0
Output:
0
Expected:
1
*/