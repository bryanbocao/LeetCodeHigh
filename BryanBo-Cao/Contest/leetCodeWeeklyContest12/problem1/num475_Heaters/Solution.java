package leetCodeWeeklyContest12.problem1.num475_Heaters;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int f = 1, l = houses.length, pre = f, minD = -1;
        for (int i = 0; i < heaters.length; i++) {
        	int delta = (heaters[i] - pre) / 2;
        	if (delta == 0) delta = 1;
        	if (minD == -1) minD = delta;
        	else if (delta < minD) minD = delta;
        }
        return minD;
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-12/problems/heaters/
/*
475. Heaters My SubmissionsBack To Contest
User Accepted: 115
User Tried: 507
Total Accepted: 125
Total Submissions: 601
Difficulty: Easy
Winter is coming! Your first job during the contest is to design a standard heater with fixed warm radius to warm all the houses.

Now, you are given positions of houses and heaters on a horizontal line, find out minimum radius of heaters so that all houses could be covered by those heaters.

So, your input will be the positions of houses and heaters seperately, and your expected output will be the minimum radius standard of heaters.

Note:
Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
As long as a house is in the heaters' warm radius range, it can be warmed.
All the heaters follow your radius standard and the warm radius will the same.
Example 1:
Input: [1,2,3],[2]
Output: 1
Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
Example 2:
Input: [1,2,3,4],[1,4]
Output: 1
Explanation: The two heater was placed in the position 1 and 4. We need to use radius 2 standard, then all the houses can be wa
 */

//TriedOn20161210SatNight CodingDuration:9m40s12 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
/*
Submission Details
4 / 27 test cases passed.
Status: Wrong Answer
Submitted: 1 hour, 55 minutes ago
Input:
[1,5]
[2]
Output:
1
Expected:
3
*/