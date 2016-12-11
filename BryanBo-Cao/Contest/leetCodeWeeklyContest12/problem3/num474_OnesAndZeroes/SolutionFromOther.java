package leetCodeWeeklyContest12.problem3.num474_OnesAndZeroes;

public class SolutionFromOther {
    public int findMaxForm(String[] strs, int m, int n) {
        int count = strs.length;
        int[] zero = new int[count];
        int[] one = new int[count];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == '1') {
                    one[i]++;
                } else {
                    zero[i]++;
                }
            }
        }

        int[][][] dp = new int[count+1][m+1][n+1];
        for (int k = 1; k <= count; k++) {
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    dp[k][i][j] = dp[k-1][i][j];
                    if (i >= zero[k-1] && j >= one[k-1]) {
                        dp[k][i][j] = Math.max(dp[k][i][j],
                            1 + dp[k-1][i - zero[k-1]][j-one[k-1]]);
                    }
                }
            }
        }
        return dp[count][m][n];
    }
}
//from https://leetcode.com/zhouxin913/
//https://leetcode.com/contest/leetcode-weekly-contest-12/problems/ones-and-zeroes/
/*
474. Ones and Zeroes My SubmissionsBack To Contest
User Accepted: 0
User Tried: 0
Total Accepted: 0
Total Submissions: 0
Difficulty: Medium
In the computer world, use restricted resource you have to generate maximum benefit is what we always want to pursue.

For now, suppose you are a dominator of m 0s and n 1s respectively. On the other hand, there is an array with strings consisting of only 0s and 1s.

Now your task is to find the maximum number of strings that you can form with given m 0s and n 1s. Each 0 and 1 can be used at most once.

Note:
The given numbers of 0s and 1s will both not exceed 100
The size of given string array won't exceed 600.
Example 1:
Input: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
Output: 4

Explanation: This are totally 4 strings can be formed by the using of 5 0s and 3 1s, which are “10,”0001”,”1”,”0”
Example 2:
Input: Array = {"10", "0", "1"}, m = 1, n = 1
Output: 2

Explanation: You could form "10", but then you'd have nothing left. Better form "0" and "1".
*/