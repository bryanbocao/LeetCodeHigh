package algorithms.num388_LongestAbsoluteFilePath;

import java.util.Stack;

public class Solution {
    public int lengthLongestPath(String input) {
        if (input.contains(".")) {
            Stack<String> parentStk = new Stack<String>();
            String[] dirs = input.split("\n");
            if (dirs.length <= 1) return input.length();
            else {
                int maxlen = 0, crrlen = 0, parentTCnt = 0;
                for (int i = 0; i < dirs.length; i++) {
                	String s = dirs[i];
                	int tCnt = 0;
                	String headS;
                	while ((headS = s.substring(0, 1)).equals("\t")) {
                		s = s.substring(1);
                		tCnt++;
                	}
                    if (parentStk.isEmpty()) crrlen = s.length();
                    else {
                        if (tCnt < parentTCnt + 1) for (int tempParentTCnt = parentTCnt; tempParentTCnt >= tCnt; tempParentTCnt--) crrlen -= parentStk.pop().length() + 1;
                        crrlen += s.length() + 1;
                    }
                	parentStk.push(s);
                	parentTCnt = tCnt;
                	if (s.contains(".") && crrlen > maxlen) maxlen = crrlen;
                }
                return maxlen;
            }
        } else return 0;
    }
}
//https://leetcode.com/problems/longest-absolute-file-path/
//Solved20161117Thu20:00 CodingDuration:3h41m10s76 @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao

