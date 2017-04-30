package leetCodeWeeklyContest30.problem2.num560_SubarraySumEqualsK;

public class Solution2 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0, cnt = 0, i = 0, j = -1;
        while (i < nums.length) {
        	while (sum < k && j + 1 < nums.length) sum += nums[++j];
        	if (sum == k && j > -1) cnt++;
        	sum -= nums[i++];
        }
        return cnt;
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