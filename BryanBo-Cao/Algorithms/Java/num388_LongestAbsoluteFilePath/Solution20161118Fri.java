package algorithms.num388_LongestAbsoluteFilePath;

import java.util.Stack;

public class Solution20161118Fri {
    public int lengthLongestPath(String input) {
        int maxlen = 0, nowlen = 0, tCnt = 0;
        Stack<String> parentStk = new Stack<String>();
        int i;
        while ((i = input.indexOf("\n")) != -1) {
        	String headS = input.substring(0, i);
        	nowlen += headS.length();
        	int i2 = i + 2;
        	
        }
    }
}
