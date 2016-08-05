/**
https://leetcode.com/problems/count-and-say/
38. Count and Say  QuestionEditorial Solution  My Submissions
Total Accepted: 91368 Total Submissions: 300900 Difficulty: Easy
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */
package algorithms.num038_CountAndSay;

public class Solution {
    public String countAndSay(int n) {
    	if (n == 1) return "1";
    	if (n == 2) return "11";
    	else {
    		char[] cs = "11".toCharArray();
    		StringBuffer sb = null;
    		for (int i = 2; i < n; i++) {
        		sb = new StringBuffer();
        		int preJ = 0;
        		for (int j = 1; j < cs.length;) {
        			char c = cs[preJ];
        			if (cs[preJ] == cs[j]) {
        				int cnt = 1;
        				int k = j;
            			while (k < cs.length && cs[preJ] == cs[k]) {cnt++; k++;}
            			preJ = k;
            			j = preJ + 1;
            			sb.append(Integer.toString(cnt) + c);
        			} else {preJ = j++; sb.append("1" + c);}
        			if (preJ == cs.length - 1) sb.append("1" + cs[preJ]);
        		}
        		cs = sb.toString().toCharArray();
    		}
    		return sb.toString();
    	}
    }
}
//2016084Thu23:39 duration:1h19m28s54 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

