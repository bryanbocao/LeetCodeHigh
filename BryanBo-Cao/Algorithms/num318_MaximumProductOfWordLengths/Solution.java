/**
https://leetcode.com/problems/maximum-product-of-word-lengths/
318. Maximum Product of Word Lengths My Submissions QuestionEditorial Solution
Total Accepted: 24515 Total Submissions: 61182 Difficulty: Medium
Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.
 */
package algorithms.num318_MaximumProductOfWordLengths;

import java.util.*;

public class Solution {
    public int maxProduct(String[] words) {
    	
        Arrays.sort(words,new Comparator<String>() {
        	public int compare(String s1, String s2) {
        		return s2.length() - s1.length();
        	}
        });
        
        int maxproduct = 1;
        boolean found2 = false;
        for (int i = 0; i < words.length && words[i].length() != 0; i++) {
        	
        	char[] csi = words[i].toCharArray();
        	Set<Character> seti = new HashSet<Character>();
        	for (int ii = 0; ii < csi.length; ii++) seti.add(csi[ii]);
        	
        	for (int j = i + 1; j < words.length && words[j].length() != 0; j++) {
        	    
        		char[] csj = words[j].toCharArray();
        		Set<Character> setj = new HashSet<Character>();
        		for (int ii = 0; ii < csj.length; ii++) setj.add(csj[ii]);
        		setj.retainAll(seti);
        		if (setj.size() == 0) {
        		    found2 = true;
        			int product = words[i].length() * words[j].length();
        			if (product > maxproduct) maxproduct = product;
        		}
        	}
        	
        }
        if (found2) return maxproduct;
        else return 0;
    }
}
//20160622Wed13:23 duration:51m31s88 TimeLimitedExceeded @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,linkedin.com/in/bryanbocao