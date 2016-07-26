/**
https://leetcode.com/problems/longest-valid-parentheses/
32. Longest Valid Parentheses  QuestionEditorial Solution  My Submissions
Total Accepted: 68000 Total Submissions: 299307 Difficulty: Hard
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
package algorithms.num032_LongestValidParentheses;

public class Solution20160724Sun0002 {
    public int longestValidParentheses(String s) {
        if (s.length() < 2) return 0;
        else {
        	int leftCnt = 0, cnt = 0, maxCnt = 0;
        	char[] cs = s.toCharArray();
        	for (int i = 0; i < cs.length; i++) {
        		if (cs[i] == '(') leftCnt++;
        		else if (cs[i] == ')') {
        			if (leftCnt > 0) {
        				cnt += 2;
        				leftCnt--;
        				if (leftCnt == 0){
            				if (cnt > maxCnt) maxCnt = cnt;
            				cnt = 0;
            			}
        			} else {
        				if (cnt > maxCnt) maxCnt = cnt;
        				cnt = 0;
        			}
        		}
        	}
			if (leftCnt == 0 && cnt > maxCnt) maxCnt = cnt;
        	return maxCnt;
        }
    }
}
//20160724Sun00:02 duration:29m25s75 WrongAnswer @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
/**
Input:
"()(())"
Output:
2
Expected:
6

Input:
"()(()"
Output:
4
Expected:
2

Input:
"(()"
Output:
0
Expected:
2
*/