package smarkingAlgorithmContest4.problem2.num459_RepeatedSubstringPattern;

public class Solution {
    public boolean repeatedSubstringPattern(String str) {
    	StringBuffer sb = new StringBuffer();
    	char c = str.charAt(0);
    	sb.append(c);
        for (int i = 1; i < str.length(); i++) {
            char ca = str.charAt(i);
        	if (ca == c && testSub(str, sb.toString())) return true;
        	sb.append(ca);
        }
        return false;
    }
    
    private static boolean testSub(String str, String sub) {
    	int len0 = str.length(), len1 = sub.length();
    	if (len0 % len1 == 0) {
    		int i = 0;
    		while (str.length() > 0) {
    			i = str.indexOf(sub);
    			if (i == 0) str = str.substring(len1);
    			else return false;
    		}
    		return true;
    	}
    	return false;
    }
}
//https://leetcode.com/contest/smarking-algorithm-contest-4/problems/repeated-substring-pattern/
//SolvedOn20161112Sat CodingDuration:29m40s97 Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao


