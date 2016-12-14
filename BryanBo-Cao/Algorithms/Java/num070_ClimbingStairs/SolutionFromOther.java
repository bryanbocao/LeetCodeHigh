package num070_ClimbingStairs;

public class SolutionFromOther {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0) a = (b += a) - a;
        return a;
    }
}
//https://leetcode.com/problems/climbing-stairs/
/*
70. Climbing Stairs   Add to List QuestionEditorial Solution  My Submissions
Total Accepted: 144680
Total Submissions: 375913
Difficulty: Easy
Contributors: Admin
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Hide Company Tags Adobe Apple
Hide Tags Dynamic Programming
*/
//from https://discuss.leetcode.com/topic/17002/3-4-short-lines-in-every-language
//from https://discuss.leetcode.com/user/stefanpochmann
