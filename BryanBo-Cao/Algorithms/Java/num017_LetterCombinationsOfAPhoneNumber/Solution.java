/**
https://leetcode.com/problems/letter-combinations-of-a-phone-number/
17. Letter Combinations of a Phone Number  QuestionEditorial Solution  My Submissions
Total Accepted: 89209
Total Submissions: 299184
Difficulty: Medium
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.
 */
package algorithms.num017_LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	
    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<String>();
        if (digits.length() > 0 && (!digits.contains("0") || !digits.contains("1"))) {
        	String[] letters = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        	char[] cDigits = digits.toCharArray();
        	for (int i = 0; i < cDigits.length; i++) ls = appendDigitChar(ls, letters[(int)cDigits[i] - 48]);
        }
        return ls;
    }
    
    private static List<String> appendDigitChar(List<String> ls, String letters) {
    	List<String> lsr = new ArrayList<String>();
    	char[] lts = letters.toCharArray();
    	if (ls.isEmpty()) {
    		for (int i = 0; i < lts.length; i++) lsr.add(Character.toString(lts[i]));
    	} else {
    		Iterator<String> it = ls.iterator();
    		while (it.hasNext()) {
    		    String next = it.next();
    			for (int i = 0; i < lts.length; i++) {
    			    StringBuffer sb = new StringBuffer(next);
    				sb.append(lts[i]);
    				lsr.add(sb.toString());
    			}
    		}
    	}
    	return lsr;
    }
    
}
//20160725Mon20:17 duration:19m21s87 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 