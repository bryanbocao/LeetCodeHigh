/**
https://leetcode.com/problems/reverse-integer/
7. Reverse Integer  QuestionEditorial Solution  My Submissions
Total Accepted: 155743 Total Submissions: 654406 Difficulty: Easy
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Update (2014-11-10):
Test cases had been added to test the overflow behavior.
 */
package algorithms.num007_ReverseInteger;

public class Solution {
	
    public int reverse(int x) {
    	if ((x >= 0 && x < 10) ||(x < 0 && x > -10)) return x;
    	StringBuffer sb = null;
    	if (x > 0) sb = new StringBuffer(Integer.toString(x)).reverse();
    	else if (x < 0) sb = new StringBuffer(Integer.toString(x).substring(1)).append('-').reverse();
    	long result = Long.valueOf(sb.toString());
		if (result > (long) Integer.MAX_VALUE || result < (long) Integer.MIN_VALUE) return 0;
		return (int) result;
    }
    
}
//20160806Sat21:17 duration:19m15s54 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
