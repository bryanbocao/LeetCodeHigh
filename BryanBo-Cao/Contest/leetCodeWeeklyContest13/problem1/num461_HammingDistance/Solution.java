package leetCodeWeeklyContest13.problem1.num461_HammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int r = x ^ y;
        String r_s = Integer.toBinaryString(r);
        int i = r_s.indexOf("1"), cnt = 0;
        for (; i != -1 && i < r_s.length(); i = r_s.indexOf("1", i + 1)) cnt++;
        return cnt;
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-13/problems/hamming-distance/
/*
461. Hamming Distance My SubmissionsBack To Contest
User Tried: 0
Total Submissions: 0
Difficulty: Easy
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/
//SolvedOn20161217SatNight CodingDuration:22m52s @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao