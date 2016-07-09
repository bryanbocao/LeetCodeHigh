/**
https://leetcode.com/problems/number-of-1-bits/
191. Number of 1 Bits  QuestionEditorial Solution  My Submissions
Total Accepted: 100395 Total Submissions: 266815 Difficulty: Easy
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
package algorithms.num191_NumberOf1Bits;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        System.out.println(s);
        int cnt = 0;
        int i = s.indexOf('1');
		while (i < s.length()) {
			if (i == -1) break;
			cnt++;
			s = s.substring(i + 1);
			i = s.indexOf('1');
		}
        return cnt;
    }
}
//20160709Sat12:31 duration:17m41s46 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao