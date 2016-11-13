package smarkingAlgorithmContest4.problem1.num455_AssignCookies;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
    	int cnt = 0;
    	Arrays.sort(g);
    	Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
        	for (int j = 0; j < s.length; j++) {
        		if (s[j] != 0 && g[i] <= s[j]) {
        			cnt++;
        			s[j] = 0;
        			break;
        		}
        	}
        }
        return cnt;
    }
}
//https://leetcode.com/contest/smarking-algorithm-contest-4/problems/assign-cookies/
//SolvedOn20161112Sat CodingDuration:around13minutes Accepted @github.com/BryanBo-Cao,hackerrank.com/bryanbocao,leetcode.com/bryanbocao-0/,linkedin.com/in/bryanbocao
