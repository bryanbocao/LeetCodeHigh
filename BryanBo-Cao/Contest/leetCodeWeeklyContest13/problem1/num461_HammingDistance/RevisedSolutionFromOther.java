package leetCodeWeeklyContest13.problem1.num461_HammingDistance;

public class RevisedSolutionFromOther {
    int hammingDistance(int x, int y) {
        int c = x ^ y;
        int count = 0;
        while (c > 0) {
            c = c & (c-1);
            count++;
        }
        return count;
    }
}
//revised from cpp code of https://leetcode.com/yanzhan2/
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
