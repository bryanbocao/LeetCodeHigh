package leetCodeWeeklyContest21.problem3;

import java.util.Collections;
import java.util.List;

public class Solution2 {
    public String findLongestWord(String s, List<String> d) {
    	String lw = new String();
    	int len = s.length();
        if (s == null || len == 0 || d == null || d.size() == 0) return lw;
        Collections.sort(d);
        Collections.reverse(d);
        for (int i = 0; i < d.size(); i++) {
        	String ds = d.get(i);
        	if (canBeWord(s, ds)) {
        		if (lw.equals("")) lw = ds;
        		else if (i > 0){
        			if (lw.length() == ds.length()) lw = ds;
        			else if (lw.length() > ds.length()) return lw;
        		}
        	}
        }
        return lw;
    }
    
    private boolean canBeWord(String s, String ds) {
    	int sLen = s.length(), dsLen = ds.length();
    	if (sLen < dsLen) return false;
    	else if (sLen == dsLen) {
    		if (s.equals(ds)) return true;
    	} else if (sLen > dsLen) {
    		char[] sCs = s.toCharArray(), dsCs = ds.toCharArray();
    		int sI = 0, dsI = 0;
    		while (dsI < dsLen && sI < sLen) {
    			if (sCs[sI] == dsCs[dsI]) dsI++;
    			sI++;
    		}
    		if (dsI < dsLen - 1) return false;
    	}
    	return true;
    }
}
//https://leetcode.com/contest/leetcode-weekly-contest-21/problems/longest-word-in-dictionary-through-deleting/
/*
524. Longest Word in Dictionary through Deleting My SubmissionsBack To Contest
User Accepted: 609
User Tried: 827
Total Accepted: 619
Total Submissions: 2039
Difficulty: Medium
Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output: 
"apple"
Example 2:
Input:
s = "abpcplea", d = ["a","b","c"]

Output: 
"a"
Note:
All the strings in the input will only contain lower-case letters.
The size of the dictionary won't exceed 1,000.
The length of all the strings in the input won't exceed 1,000.
*/
