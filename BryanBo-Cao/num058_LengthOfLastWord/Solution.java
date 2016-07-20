/**
https://leetcode.com/problems/length-of-last-word/
58. Length of Last Word  QuestionEditorial Solution  My Submissions
Total Accepted: 101932 Total Submissions: 340230 Difficulty: Easy
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 */
package algorithms.num058_LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.isEmpty()) return 0;
        else if (!s.contains(" ")) return s.length();
        else {
        	s = s.trim();
        	int index = s.lastIndexOf(" ");
        	return s.length() - 1 - index;
        }
    }
}
//20160720Wed14:41 duration:4m24s26 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao