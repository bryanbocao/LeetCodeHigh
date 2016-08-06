/**
https://leetcode.com/problems/happy-number/
202. Happy Number  QuestionEditorial Solution  My Submissions
Total Accepted: 81947 Total Submissions: 217261 Difficulty: Easy
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Credits:
Special thanks to @mithmatt and @ts for adding this problem and creating all test cases.
 */
package algorithms.num202_HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isHappy(int n) {
    	if (n == 0) return false;
        if (n == 1) return true;
        List<Integer> ls = new ArrayList<Integer>();
        int next;
        while (n != 1) {
        	next = 0;
        	while (n > 9) {
        		int d = n % 10;
        		next += d * d;
        		n /= 10;
        	}
        	int d = n % 10;
        	next += d * d;
        	if (ls.contains(next)) return false;
        	else ls.add(next);
    		n /= 10;
    		n = next;
        }
        return true;
    }
}
//20160805Fri23:24 duration:16m17s90 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
