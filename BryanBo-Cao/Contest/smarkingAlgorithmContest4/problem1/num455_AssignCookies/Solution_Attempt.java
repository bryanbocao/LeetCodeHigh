package smarkingAlgorithmContest4.problem1.num455_AssignCookies;

public class Solution_Attempt {
    public int findContentChildren(int[] g, int[] s) {
    	int cnt = 0;
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
