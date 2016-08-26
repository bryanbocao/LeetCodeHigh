/**
https://leetcode.com/problems/first-unique-character-in-a-string/
387. First Unique Character in a String  QuestionEditorial Solution  My Submissions
Total Accepted: 5323 Total Submissions: 12561 Difficulty: Easy
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */
package algorithms.num387_FIrstUniqueCharacterInAString;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {
    	List<Character> ls = new ArrayList<Character>();
    	Set<Character> set = new HashSet<Character>();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
        	if (!set.contains(c)) {
        		if (ls.contains(c)) {
        			ls.remove(new Character(c));
        			set.add(c);
        		} else ls.add(c);
        	}
        }
    	if (ls.isEmpty()) return -1;
    	else return s.indexOf(ls.iterator().next());
    }
}
//SolvedOn20160824WedAt22:38 CodingDuration:19m23s21 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
