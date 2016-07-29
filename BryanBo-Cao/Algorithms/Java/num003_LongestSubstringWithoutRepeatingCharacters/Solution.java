/**
https://leetcode.com/problems/longest-substring-without-repeating-characters/
3. Longest Substring Without Repeating Characters  QuestionEditorial Solution  My Submissions
Total Accepted: 168743 Total Submissions: 741415 Difficulty: Medium
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 */
package algorithms.num003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        else {
        	int maxlen = 0;
        	char[] cs = s.toCharArray();
        	Set<Character> set = null;
        	for (int i = 0; i < cs.length; i++) {
        		set = new HashSet<Character>();
        		for (int j = i; j <= cs.length; j++) {
        			if (j == cs.length || set.contains(cs[j])) {
            			int len = j - i;
            			if (len > maxlen) maxlen = len;
            			break;
            		}
            		set.add(cs[j]);
        		}
        	}
        	return maxlen;
        }
    }
}
//20160729Fri16:10 duration:25m52s17 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 

/**
Your input

"dvdf"
Your answer

3
Expected answer

3
*/