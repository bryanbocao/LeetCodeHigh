package algorithms.num388_LongestAbsoluteFilePath;

import java.util.Stack;

public class Solution20161118Fri1756 {
    public int lengthLongestPath(String input) {
        int maxlen = 0, nowlen = 0, parentTCnt = 0;
        Stack<String> parentStk = new Stack<String>();
        int i;
        while ((i = input.indexOf("\n")) != -1) {
        	String s = input.substring(0, i);
        	
        	System.out.println("line 12 i: " + i);
        	int tCnt = 0;
        	System.out.println("line 15: input: " + input);
        	System.out.println("line 16: input.substring(i, i + 2):" +  input.substring(i, i + 2));
        	String tS = new String();
        	while ((tS = input.substring(i, i + 2)).equals("\t")) {
        		System.out.println("line 18 i: " + i);
        		input = input.substring(i + 2);
        		
        		tCnt++;
        	}
        	System.out.println("line 19: tCnt: " + tCnt);
            if (parentStk.isEmpty()) parentTCnt = 0;
            else {
            	System.out.println("line 21");
            	parentTCnt = tCnt;
                if (tCnt == parentTCnt + 1) {
        		    nowlen += s.length();
        	    	parentStk.push(s);
        	    } else {
        		    while(tCnt >= parentTCnt) {
        		    	String parentS = parentStk.pop();
        		    	nowlen -= parentS.length();
        			    tCnt--;
        	    	}
            	}
            }
        	parentStk.push(s);
        	
        	input = input.substring(i + 2);
        	if (nowlen > maxlen) maxlen = nowlen;
        }
        return maxlen;
    }
}
