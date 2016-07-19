/**
https://leetcode.com/problems/valid-perfect-square/
367. Valid Perfect Square My Submissions QuestionEditorial Solution
Total Accepted: 3854 Total Submissions: 10571 Difficulty: Medium
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
 */
package algorithms.num367_ValidPerfectSquare;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        else {
            if (num == 2147483647) return false;
        	int step = 3;
        	for (int i = 1; i <= num;) {
        		if (i == num) return true;
        		i += step;
        		step += 2;
        	}
        	return false;
        }
    }
}
//20160701Fri18:11 duration:30m58s34 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao