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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution20160622Tue1302 {
    public int maxProduct(String[] words) {
        List<Integer> ls = new ArrayList<Integer>();
        Map<Integer, Set> map = new HashMap<Integer, Set>();
        for (int i = 0; i < words.length; i++) {
        	int len = words[i].length();
        	if (map.containsKey(len)) {
        		Set<String> set = map.get(len);
        		set.add(words[i]);
        		map.put(len, set);
        	} else {
        		Set<String> set = new HashSet<String>();
        		set.add(words[i]);
        		map.put(len, set);
        	}
        }
        Collections.sort(ls);
        Collections.reverse(ls);
        String[] nss = new String[words.length];
        Iterator<Integer> it = ls.iterator();
        int ii = 0;
        while (it.hasNext()) {
        	Set<String> set = map.get(it.next());
        	Iterator<String> its = set.iterator();
        	while (its.hasNext()) nss[ii++] = its.next();
        }
        
        for (int i = 0; i < nss.length; i++) {
        	char[] csi = nss[i].toCharArray();
        	Set<Character> seti = new HashSet<Character>();
        	for (int iii = 0; iii < csi.length; iii++) seti.add(csi[iii]);
        	for (int j = i + 1; j < nss.length; j++) {
        		char[] csj = nss[j].toCharArray();
        		Set<Character> setj = new HashSet<Character>();
        		for (int iii = 0; iii < csj.length; iii++) setj.add(csj[iii]);
        		setj.retainAll(seti);
        		if (setj.size() == 0) return nss[i].length() + nss[j].length();
        	}
        }
        return 0;
    }
}
