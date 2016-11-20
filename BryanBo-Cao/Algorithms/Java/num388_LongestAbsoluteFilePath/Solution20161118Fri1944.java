package algorithms.num388_LongestAbsoluteFilePath;

import java.util.Stack;

public class Solution20161118Fri1944 {
    public int lengthLongestPath(String input) {
        int maxlen = 0, crrlen = 0, parentTCnt = 0;
        Stack<String> parentStk = new Stack<String>();
        String[] dirs = input.split("\n");
        for (int i = 0; i < dirs.length; i++) {
        	String s = dirs[i];
        	System.out.println("s : " + s);
        	int tCnt = 0;
        	String headS;
        	System.out.println(s.substring(0, 2));
        	while ((headS = s.substring(0, 1)).equals("\t")) {
        		System.out.println("line 17 s : " + s);
        		s = s.substring(1);
        		tCnt++;
        	}
        	
        	System.out.println("line 19: tCnt: " + tCnt);
            if (parentStk.isEmpty()) {
            	crrlen = s.length();
            	System.out.println("line 21");
            } else {
                if (tCnt == parentTCnt + 1) {
                	System.out.println("line 28");
                	System.out.println("s: " + s);
        		    System.out.println("line 32: currlen: " + crrlen);
        	    } else {
        	    	System.out.println("line 35");
        	    	System.out.println("parentTCnt: " + parentTCnt);
        	    	for (int tempParentTCnt = parentTCnt; tempParentTCnt >= tCnt; tempParentTCnt--) {
        	    		System.out.println("line 38 inside while");
        	    		String parentS = parentStk.pop();
        		    	crrlen -= parentS.length() + 1;
        		    	System.out.println("crrlen: " + crrlen);
        	    	}
        	    	
        	    	System.out.println("line 46: crrlen: " + crrlen);
            	}
                crrlen += s.length() + 1;
            }
            
        	parentStk.push(s);
        	parentTCnt = tCnt;
        	System.out.println("line 47: crrlen: " + crrlen);
        	System.out.println("line 48: parentTCnt: " + parentTCnt);
        	if (crrlen > maxlen) maxlen = crrlen;
        	System.out.println("maxlen: " +  maxlen);
        	System.out.println();
        	System.out.println();
        }
        return maxlen;
    }
}
