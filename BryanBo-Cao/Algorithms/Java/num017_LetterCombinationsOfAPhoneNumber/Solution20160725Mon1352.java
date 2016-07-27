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

public class Solution20160725Mon1352 {
    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<String>();
        if (digits.length() > 0) {
        	String[] letters = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        	char[] cs = digits.toCharArray();
        	for (int i = 0; i < cs.length; i++) ls = getAppendDigitChar(ls, cs[i]);
        }
        return ls;
    }
    
    private static List<String> getAppendDigitChar(List<String> ls, char c) {
    	List<String> lsr = new ArrayList<String>();
    	if (ls.isEmpty()) {
    		int numc = (int) c;
    		if (numc == 48) lsr.add(" ");
    		else if (50 <= numc && numc <= 54) {//digit 1 to 6
    			for (int i = numc + (numc - 50) * 3; i < numc + (numc - 50) * 3 + 3; i++) lsr.add(Character.toString((char)(i + 47)));
    		} else if (numc == 55) {//digit 7
    			for (int i = numc; i < numc + 4; i++) lsr.add(Character.toString((char)(i + 57)));
    		} else if (numc == 56) {//digit 8
    			for (int i = numc; i < numc + 3; i++) lsr.add(Character.toString((char)(i + 60)));
    		} else if (numc == 57) {//digit 9
    			for (int i = numc; i < numc + 3; i++) lsr.add(Character.toString((char)(i + 62)));
    		}
    	} else {
    		Iterator<String> it = ls.iterator();
    		while (it.hasNext()) {
    			StringBuffer sb = new StringBuffer(it.next());
        		int numc = (int) c;
        		if (numc == 48) {
        			sb.append(" ");
        			lsr.add(sb.toString());
        		} else if (50 <= numc || numc <= 54) {//digit 1 to 6
        			for (int i = numc + (numc - 50) * 3; i < numc + 3; i++) {
        				sb.append((char)(i + 47));
        			}
        		} else if (numc == 55) {//digit 7
        			for (int i = numc; i < numc + 4; i++) lsr.add(Character.toString((char)(i + 57)));
        		} else if (numc == 56) {//digit 8
        			for (int i = numc; i < numc + 3; i++) lsr.add(Character.toString((char)(i + 60)));
        		} else if (numc == 57) {//digit 9
        			for (int i = numc; i < numc + 3; i++) lsr.add(Character.toString((char)(i + 62)));
        		}
    		}
    	}
    	return lsr;
    }
    
}
//20160725Mon13:52 duration:42m21s74 NotFinished @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 