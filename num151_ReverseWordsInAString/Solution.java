/**
https://leetcode.com/problems/reverse-words-in-a-string/
151. Reverse Words in a String  QuestionEditorial Solution  My Submissions
Total Accepted: 107315
Total Submissions: 681970
Difficulty: Medium
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):
For C programmers: Try to solve it in-place in O(1) space.

click to show clarification.

Clarification:
What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.

 */
package algorithms.num151_ReverseWordsInAString;

public class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = ss.length - 1; i >= 0; i--) {
        	if (ss[i].length() != 0) sb.append(ss[i] + " ");
        }
        return sb.toString().trim();
    }
}
//20160705Tue12:03 duration:10m42s09 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao