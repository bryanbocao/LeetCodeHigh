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

public class Solution20160629Wed1544 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) return false;
        else if (n > 0) {
        	int p3 = 1;
        	for (int i = 0; p3 < n;i++) {
        		p3 = i * i * i;
             	if (p3 == n) return true;
        	}
        	return false;
        } else {
        	int p3 = -1;
        	for (int i = 0; p3 > n;i--) {
        		p3 = i * i * i;
             	if (p3 == n) return true;
        	}
        	return false;
        }
    }
}
//20160629Wed15:44 duration:10m46s43 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao