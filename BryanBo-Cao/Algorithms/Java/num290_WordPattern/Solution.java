/**
https://leetcode.com/problems/word-pattern/
290. Word Pattern My Submissions QuestionEditorial Solution
Total Accepted: 41369 Total Submissions: 137912 Difficulty: Easy
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
package algorithms.num290_WordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] cs = pattern.toCharArray();
        String[] ss = str.split(" ");
        if (cs.length != ss.length) return false;
        Map<Character, String> ptnMap = new HashMap<Character, String>();
        Map<String, Character> reptnMap = new HashMap<String, Character>();
        for (int i = 0; i < cs.length; i++) {
        	if (ptnMap.containsKey(cs[i])) {
        		if (!ptnMap.get(cs[i]).equals(ss[i])) return false;
        	}else ptnMap.put(cs[i], ss[i]);
        	if (reptnMap.containsKey(ss[i])) {
        		if (!reptnMap.get(ss[i]).equals(cs[i])) return false;
        	}else reptnMap.put(ss[i], cs[i]);
        }
        return true;
    }
}
//20160624Fri12:53 duration:15m46s08 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao