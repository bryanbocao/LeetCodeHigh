/**
https://leetcode.com/problems/remove-invalid-parentheses/
301. Remove Invalid Parentheses My Submissions QuestionEditorial Solution
Total Accepted: 14536 Total Submissions: 44617 Difficulty: Hard
Remove the minimum number of invalid parentheses in order to make the input string valid. Return all possible results.

Note: The input string may contain letters other than the parentheses ( and ).

Examples:
"()())()" -> ["()()()", "(())()"]
"(a)())()" -> ["(a)()()", "(a())()"]
")(" -> [""]
 */
package algorithms.num301_RemoveInvalidParentheses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ls = new ArrayList<String>();
        char[] cs = s.toCharArray();
        List<Integer> erpls = new ArrayList<Integer>();
        int cntl = 0, cntr = 0;
        for (int i = 0; i < cs.length; i++) {
        	if (cs[i] == '(') cntl++;
        	else if (cs[i] == ')') cntr++;
        	if (cntl < cntr - erpls.size()) erpls.add(i);
        }
        if (cntl == cntr) {
        	ls.add(s);
        	return ls;
        } else if (cntl < cntr) {
        	Iterator<Integer> it = erpls.iterator();
        	while (it.hasNext()) {
        		int erp = it.next();
        		
        	}
        	
        } else { // cntl > cntr
        	int cntrm = cntl - cntr;
        	
        }
        
    }
}
//20160623Thu12:09 duration:22m00s87 NotFinished @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao