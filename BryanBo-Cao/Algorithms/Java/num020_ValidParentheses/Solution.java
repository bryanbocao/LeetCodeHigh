/**
https://leetcode.com/problems/valid-parentheses/
20. Valid Parentheses  QuestionEditorial Solution  My Submissions
Total Accepted: 121395 Total Submissions: 400389 Difficulty: Easy
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
package algorithms.num020_ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if (len == 0) return true;
        else if (len % 2 == 1) return false;
        else {
        	char[] cs = s.toCharArray();
        	Stack<Character> stk = new Stack<Character>();
        	for (int i = 0; i < len; i++) {
        		switch (cs[i]) {
        		case '(':
        		case '[':
        		case '{':
        			stk.push(cs[i]);
        			break;
        		case ')':
        			if (stk.isEmpty()) return false;
        			if (stk.peek() == '(') stk.pop();
        			else return false;
        			break;
        		case ']':
        			if (stk.isEmpty()) return false;
        			if (stk.peek() == '[') stk.pop();
        			else return false;
        			break;
        		case '}':
        			if (stk.isEmpty()) return false;
        			if (stk.peek() == '{') stk.pop();
        			else return false;
        			break;
        		}
        	}
        	if (stk.isEmpty()) return true;
        	else return false;
        }
    }
}
//20160730Sat13:25 duration:17m58s16 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
