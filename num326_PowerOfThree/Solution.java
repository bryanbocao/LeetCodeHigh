/**
https://leetcode.com/problems/power-of-three/
326. Power of Three My Submissions QuestionEditorial Solution
Total Accepted: 50293 Total Submissions: 133760 Difficulty: Easy
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
 */
package algorithms.num326_PowerOfThree;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        else {
        	while (n % 3 == 0) n /= 3;
        	if (n == 1) return true;
        	else return false;
        }
    }
}
//20160629Wed15:51 duration:18m Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao