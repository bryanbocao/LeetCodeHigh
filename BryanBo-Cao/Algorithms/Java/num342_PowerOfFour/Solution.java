/**
https://leetcode.com/problems/power-of-four/
342. Power of Four My Submissions QuestionEditorial Solution
Total Accepted: 22106 Total Submissions: 64333 Difficulty: Easy
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
 */
package algorithms.num342_PowerOfFour;

public class Solution {
    public boolean isPowerOfFour(int num) {
    	if (num < 0) return false;
    	else if (num == 1) return true;
    	else {
            String s = Integer.toBinaryString(num);
            int i1 = s.indexOf("1");
            String zs = s.substring(i1 + 1, s.length());
            if (zs.contains("1")) return false;
            if (zs.length() >= 2 && zs.length() % 2 == 0) return true;
            else return false;
    	}
    }
}
//20160620Mon17:58 duration:15m33s06 Accepted @github.com/BryanBo-Cao,hackerrank.com/BryanBoCao,linkedin.com/in/bryanbocao