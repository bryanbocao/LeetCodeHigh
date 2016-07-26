/**
https://leetcode.com/problems/reverse-vowels-of-a-string/
345. Reverse Vowels of a String My Submissions QuestionEditorial Solution
Total Accepted: 23406 Total Submissions: 65706 Difficulty: Easy
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
 */
package algorithms.num345_ReverseVowelsOfAString;

import java.util.*;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vset = new HashSet<Character>();
        char[] cs = s.toCharArray();
        vset.add('a'); vset.add('e'); vset.add('i'); vset.add('o'); vset.add('u');
        vset.add('A'); vset.add('E'); vset.add('I'); vset.add('O'); vset.add('U');
        List<Character> vls = new ArrayList<Character>();
        for (int i = 0; i < cs.length; i++) if (vset.contains(cs[i])) vls.add(cs[i]);
        Collections.reverse(vls);
        
        StringBuffer sb = new StringBuffer();
        Iterator<Character> it = vls.iterator();
        for (int i = 0; i < cs.length; i++) {
        	if (vset.contains(cs[i])) sb.append(it.next());
        	else sb.append(cs[i]);
        }
        return sb.toString();
    }
}
//20160620Mon16:56 duration:8m27s15 Accepted @github.com/BryanBo-Cao,hackerrank.com/BryanBoCao,linkedin.com/in/bryanbocao