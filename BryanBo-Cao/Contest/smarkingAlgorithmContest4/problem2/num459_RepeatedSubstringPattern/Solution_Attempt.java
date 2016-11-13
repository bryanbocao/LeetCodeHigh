package smarkingAlgorithmContest4.problem2.num459_RepeatedSubstringPattern;

public class Solution_Attempt {
    public boolean repeatedSubstringPattern(String str) {
    	StringBuffer sb = new StringBuffer();
    	char c = str.charAt(0);
    	sb.append(c);
        for (int i = 1; i < str.length(); i++) {
        	if (str.charAt(i) == c && testSub(str, sb.toString())) return true;
        	sb.append(str.charAt(i));
        }
        return false;
    }
    
    private static boolean testSub(String str, String sub) {
    	int len0 = str.length(), len1 = sub.length();
    	if (len0 % len1 == 0) {
    		int i = 0;
    		while (len0 > 0) {
    			i = str.indexOf(sub);
    			if (i == 0) str = str.substring(i);
    			else if (i == -1) return false;
    		}
    		return true;
    	}
    	return false;
    }
}
//Time Limit Exceeded
//17m14s34