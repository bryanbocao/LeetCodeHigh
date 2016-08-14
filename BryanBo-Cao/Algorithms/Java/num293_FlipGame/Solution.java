/**
https://leetcode.com/problems/flip-game/
Locked Question
 */
package algorithms.num293_FlipGame;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> ls = new ArrayList<String>();
        StringBuffer sb = new StringBuffer(s);
        for (int i = 1; i < sb.length(); i++) {
        	if (sb.charAt(i - 1) == sb.charAt(i)) {
        		if (sb.charAt(i) == '+') {
        			sb.setCharAt(i - 1, '-');
        			sb.setCharAt(i, '-');
        			ls.add(sb.toString());
        			sb.setCharAt(i - 1, '+');
        			sb.setCharAt(i, '+');
        		}
        	}
        }
        return ls;
    }
}
//20160813Sat22:17 CodingDuration:15m56s04 Accpeted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao 
