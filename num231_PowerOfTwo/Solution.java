/**
https://leetcode.com/problems/power-of-two/
231. Power of Two My Submissions QuestionEditorial Solution
Total Accepted: 81941 Total Submissions: 218453 Difficulty: Easy
Given an integer, write a function to determine if it is a power of two.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
package algorithms.num231_PowerOfTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
    	if (n <= 0) return false;
    	else {
            StringBuffer sbs = new StringBuffer(Integer.toBinaryString(n));
            sbs.delete(0, 1);
            if (sbs.toString().contains("1")) return false;
            else return true;
    	}
    }
}
//20160627Mon13:30 duration:6m29s28 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao