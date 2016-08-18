/**
https://leetcode.com/problems/palindrome-permutation/
Locked Question
 */
package algorithms.num266_PalindromePermutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canPermutePalindrome(String s) {
    	int len = s.length();
    	if (len < 2) return true;
    	int oddCnt = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
        	char c = s.charAt(i);
        	if (map.containsKey(c)) {
        		int f = map.get(c);
        		map.put(c, f + 1);
        		if (f % 2 == 0) oddCnt++;
        		else oddCnt--;
        	} else {
        		map.put(c, 1);
        		oddCnt++;
        	}
        }
        if (oddCnt > 1) return false;
        return true;
    }
}
//SolvedOn20160817WedAt20:29 CodingDuraton:6m02s12 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
